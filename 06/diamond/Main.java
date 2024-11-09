import java.util.Scanner;

class Myutils {
    private Myutils() {

    }

    public static void ismetel(int szam, char betu) {
        for (int i = 0; i < szam; i++) {
            System.out.print(betu);

        }

    }

}

public class Main {
    public static void main(String[] args) {

        System.out.print("Adjon meg egy páratlan számot: ");
        Scanner sr = new Scanner(System.in);
        final int x = sr.nextInt();
        System.out.println("");
        if (x % 2 == 0 || x < 0) {
            System.err.println("Hiba! Nem megfelelő bemenet");
            System.exit(1);

        }
        // else
        for (int i = 1; i <= x; i++) {

            int szam = x;
            szam = szam - i;
            szam = szam / 2;
            Myutils.ismetel(szam, ' ');
            Myutils.ismetel(i, '*');
            Myutils.ismetel(szam, ' ');
            i++;
            System.out.println("");

        }
        
        for (int i = x-2; i >= 1; i--) 
        {

            int szam = x;
            szam = szam - i;
            szam = szam / 2;
            Myutils.ismetel(szam, ' ');
            Myutils.ismetel(i, '*');
            Myutils.ismetel(szam, ' ');
            i--;
            System.out.println("");

        }

    }
}