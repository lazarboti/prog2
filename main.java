

public class main

{
    public static void Main(String[] args) {

        int[] tomb = new int[101];
        int osszeg =0;
        int negyzetosszeg =0;
        int osszegnegyzet =0;
        for (int i = 0; i < tomb.length; i++) 
        {
            tomb[i] = i;
        }
        for (int i = 0; i < tomb.length; i++) 
        {
            negyzetosszeg=negyzetosszeg+(tomb[i]*tomb[i]);
            osszegnegyzet = osszegnegyzet+tomb[i];
        }
        osszeg=osszegnegyzet*osszegnegyzet;
        osszeg = osszeg-negyzetosszeg;
        System.out.println(osszeg);


    }
}
