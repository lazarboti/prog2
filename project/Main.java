import java.io.File;

public class Main {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Adjon meg egy mappa elérési útvonalat!");
            return;
        }

        String gyokerUtvonal = args[0];
        File gyokerMappa = new File(gyokerUtvonal);

        if (!gyokerMappa.isDirectory()) {
            System.out.println("A megadott útvonal nem egy mappa!");
            return;
        }

        Galeria generator = new Galeria();
        generator.galeriaLetrehozasa(gyokerMappa);
        // generator.htmlFajlokTorlese(gyokerMappa);
    }
}