

public class main

{
    public static void Main(String[] args) {

        int[] tomb = new int[1000];
        int osszeg =0;
        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = i;
        }
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] % 3 == 0 || tomb[i] % 5 == 0) 
            {
                osszeg = osszeg+i;

            }
        }
        System.out.println(osszeg);

    }
}
