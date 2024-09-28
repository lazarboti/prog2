class MyArrayUtils {
    public static void reverse(int[] tomb) {
        int[] tomb2 = new int[tomb.length];

        for (int i = 0; i < tomb.length; i++) {
            tomb2[i] = tomb[i];
        }

        int j = tomb.length;
        for (int i = 0; i < tomb.length; i++) {
            j--;
            tomb[i] = tomb2[j];
        }
    }
    public static void sort(int[] tomb){
        for (int i = 0; i < tomb.length-1; i++) 
        {
            for (int j = 0; j < tomb.length-1; j++) 
            {
                if (tomb[j] < tomb[j + 1]) {
                    int temp = tomb[j];
                    tomb[j] = tomb[j + 1];
                    tomb[j + 1] = temp;
                }
                
                
            }
        }
    }
    public static boolean equals(int[] tomb1, int[] tomb2){

        if (tomb1.length !=tomb2.length) {
            return false;
            
        }
        else
        {
            for (int i = 0; i < tomb1.length-1; i++) 
            {
                if (tomb1[i] != tomb2[i]) 
                {
                    return false;
                    
                }

            }
        }
        return true;
    }
    public static void fill(int[] tomb, int szam)
    {
        for (int i = 0; i <= tomb.length-1; i++) 
        {
            tomb[i] = szam;
        }
    }



}

public class Main {
    public static void main(String[] args) {
        int[] tomb1 = new int[5];
        for (int i = 0; i < tomb1.length; i++) {
            tomb1[i] = i + 1;
        }
        int[] tomb3 = new int[5];
        for (int i = 0; i < tomb3.length; i++) {
            tomb3[i] = i + 1;
        }
        for (int i = 0; i < tomb1.length; i++)
        {
            System.out.println(tomb1[i]);
        }
        
        System.out.println("-------");
        //MyArrayUtils.reverse(tomb1);
        //MyArrayUtils.sort(tomb1);
        MyArrayUtils.fill(tomb1,7);
        //boolean result=MyArrayUtils.equals(tomb1,tomb3);
        for (int i = 0; i < tomb1.length; i++)
        {   

            System.out.println(tomb1[i]);
        }
        //System.out.println(result);

    }
    

}