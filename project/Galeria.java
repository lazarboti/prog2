import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Galeria {

    private String gyokerMappaUtvonal;
    private final Stack<String> latogatottMappak = new Stack<>();

    private boolean kepFajlEllenorzes(File fajl) {
        String fajlNev = fajl.getName().toLowerCase();
        return fajlNev.endsWith(".jpg") || fajlNev.endsWith(".jpeg") || fajlNev.endsWith(".png");
    }

    public void galeriaLetrehozasa(File aktualisMappa) {
        if (!aktualisMappa.isDirectory())
            return;

        if (gyokerMappaUtvonal == null) {
            gyokerMappaUtvonal = aktualisMappa.getAbsolutePath();
        }
        latogatottMappak.push(aktualisMappa.getAbsolutePath());

        File[] fajlok = aktualisMappa.listFiles();
        if (fajlok == null)
            return;

        List<File> kepek = new ArrayList<>();
        List<File> almappak = new ArrayList<>();

        for (File fajl : fajlok) {
            if (fajl.isDirectory()) {
                almappak.add(fajl);
                System.out.println("Beolvasott Mappák: " + fajl.getAbsolutePath());
            } else if (kepFajlEllenorzes(fajl)) {
                kepek.add(fajl);
            }
        }

        kepOldalakGeneralasa(aktualisMappa, kepek);
        indexOldalGeneralasa(aktualisMappa, kepek, almappak);

        for (File almappa : almappak) {
            galeriaLetrehozasa(almappa);
        }

        latogatottMappak.pop();
    }

    private void indexOldalGeneralasa(File mappa, List<File> kepek, List<File> almappak) {
        int melyseg = mappaMelysege(mappa.getAbsolutePath(), gyokerMappaUtvonal);

        try (PrintWriter writer = new PrintWriter(new FileWriter(new File(mappa, "index.html")))) {
            writer.println("<!DOCTYPE html>");
            writer.println("<html>");
            writer.println("<head>");
            writer.println("<meta charset='UTF-8'>");
            writer.println("<title>" + mappa.getName() + "</title>");
            writer.println("</head>");
            writer.println("<body>");

            writer.println("<a href='" + "../".repeat(melyseg) + "index.html'><h2>Kezdőlap</h2></a>");

            if (!mappa.getAbsolutePath().equals(gyokerMappaUtvonal)) {
                writer.println("<a href='../index.html'><h2>⬅ Vissza</h2></a>");
            }
            if (!almappak.isEmpty()) {
                writer.println("<h3>Almappák:</h3>");
                writer.println("<ul>");
                for (File almappa : almappak) {
                    writer.println(
                            "<li><a href='" + almappa.getName() + "/index.html'>" + almappa.getName() + "</a></li>");
                }
                writer.println("</ul>");
            }

            if (!kepek.isEmpty()) {
                writer.println("<h3>Képek:</h3>");
                writer.println("<ul>");
                for (File kep : kepek) {
                    writer.println("<li><a href='" + kep.getName() + ".html'>" + kep.getName() + "</a></li>");
                }
                writer.println("</ul>");
            }

            writer.println("</body>");
            writer.println("</html>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void kepOldalakGeneralasa(File mappa, List<File> kepek) {
        for (File kep : kepek) {
            kepOldalGeneralasa(mappa, kepek, kep);
        }
    }

    private void kepOldalGeneralasa(File mappa, List<File> kepek, File kepFajl) {
        String kepNev = kepFajl.getName();
        int jelenlegiIndex = kepek.indexOf(kepFajl);
        int melyseg = mappaMelysege(mappa.getAbsolutePath(), gyokerMappaUtvonal);

        try (PrintWriter writer = new PrintWriter(new FileWriter(new File(mappa, kepNev + ".html")))) {
            writer.println("<!DOCTYPE html>");
            writer.println("<html>");
            writer.println("<head>");
            writer.println("<meta charset='UTF-8'>");
            writer.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
            writer.println("<title>" + kepNev + "</title>");
            writer.println("<style>");
            writer.println("body { font-family: Arial, sans-serif; text-align: center; margin: 0; padding: 0; }");
            writer.println(".kep { max-width: 30%; height: auto; }");
            writer.println(".navigacio { display: flex; justify-content: space-between; margin: 20px; }");
            writer.println("</style>");
            writer.println("</head>");
            writer.println("<body>");

            writer.println("<a href='" + "../".repeat(melyseg) + "index.html'><h2>Kezdőlap</h2></a>");

            if (mappa.getAbsolutePath().equals(gyokerMappaUtvonal)) {

                writer.println("<a href='index.html'><h2>⬅ Vissza</h2></a>");
            } else {

                writer.println("<a href='../index.html'><h2>⬅ Vissza</h2></a>");
            }

            writer.println("<div class='navigacio'>");
            if (jelenlegiIndex > 0) {
                writer.println("<a href='" + kepek.get(jelenlegiIndex - 1).getName() + ".html'>Előző</a>");
            } else {
                writer.println("<span></span>");
            }
            if (jelenlegiIndex < kepek.size() - 1) {
                writer.println("<a href='" + kepek.get(jelenlegiIndex + 1).getName() + ".html'>Következő</a>");
            } else {
                writer.println("<span></span>");
            }
            writer.println("</div>");

            writer.println("<img class='kep' src='" + kepNev + "' alt='" + kepNev + "'>");

            writer.println("</body>");
            writer.println("</html>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int mappaMelysege(String aktualisUtvonal, String gyokerUtvonal) {
        String elvalaszto = File.separator.equals("\\") ? "\\\\" : File.separator; // Windowsba kell ez csak
        return aktualisUtvonal.split(elvalaszto).length - gyokerUtvonal.split(elvalaszto).length; // elvalaszto csere
                                                                                                  // FIle.separatorra
    }

    public void htmlFajlokTorlese(File mappa) {
        if (!mappa.isDirectory()) {
            System.out.println("A megadott útvonal nem mappa: " + mappa.getAbsolutePath());
            return;
        }

        File[] fajlok = mappa.listFiles();
        if (fajlok == null) {
            System.out.println("Nem sikerült beolvasni a mappa tartalmát: " + mappa.getAbsolutePath());
            return;
        }

        for (File fajl : fajlok) {
            if (fajl.isDirectory()) {
                htmlFajlokTorlese(fajl);
            } else if (fajl.getName().toLowerCase().endsWith(".html")) {

                if (fajl.delete()) {
                    System.out.println("Törölve: " + fajl.getAbsolutePath());
                } else {
                    System.out.println("Nem sikerült törölni: " + fajl.getAbsolutePath());
                }
            }
        }
    }

}