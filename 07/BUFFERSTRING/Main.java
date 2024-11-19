import java.util.Scanner;

class Szamos
{

    public static String szamol(int n)
    {
        StringBuilder s = new StringBuilder();
        for(int i = 1; i <= n;i++)
        {
            s.append(Integer.toString(i));
        }
        return s.toString();
    }
}

public class Main
{
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.print("Adjon meg egy számot: ");
        int n = sr.nextInt();
        System.out.println("");
        System.out.println(Szamos.szamol(n));
        sr.close();
    }
}