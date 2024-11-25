import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        {
            if (1 != args.length) {
                System.err.println("Hibás bemenet!");
                System.exit(1);
            }
            // else
            String szereplo = args[0];
            List<String> lines = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader("imput.txt"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    lines.add(line);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();

            } catch (IOException e) {
                e.printStackTrace();
            }
            List<Mese> mesek = new ArrayList<>();
            for (String line : lines) {
                String[] felezve = line.split(":");
                if (felezve.length != 2) {
                    System.out.println("Fájl szintax error!");
                    System.exit(2);
                }
                String cim = felezve[0];
                String[] szereplokS = felezve[1].split(",");
                List<String> szereplok = new ArrayList<>();
                for (String szerep : szereplokS) {
                    szereplok.add(szerep);
                }
                mesek.add(new Mese(cim, szereplok));
            }
            List<Mese> talatatok = new ArrayList<>();
            for (Mese mese : mesek) {
                if (mese.getSzereplok().contains(szereplo)) {
                    talatatok.add(mese);
                }
            }
            Collections.sort(talatatok);
            for (Mese talalt : talatatok) {
                System.out.println(talalt.toString());
            }

        }
    }
}