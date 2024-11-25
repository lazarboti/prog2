import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class FileUtils {
    public static void writeLines(String fileName, List<String> lines) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (String line : lines) {
                bw.write(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class Main {
    public static final Random r = new Random();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Adjon meg egy pozitív számot: ");
        int szam = sc.nextInt();
        char[] betu = { 'a', 'b', 'c' };
        String fileName = "output.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 0; i < szam; i++) {
                for (int j = 0; j < szam; j++) {
                    bw.write(betu[r.nextInt(betu.length)]);
                    bw.write(Character.forDigit(r.nextInt(10), 10));
                    bw.write(" ");

                }
                bw.write("\n");
            }
            System.out.println("Fájlba irás megtörtént");
        } catch (IOException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}