 class Haming 
{
    private Haming(){

    }
    public static int distance(String s1, String s2) 
    {

        int counter = 0;
        if (s1.length()!=s2.length())
        {
            return -1;
            
        }
        for (int i = 0; i < s1.length(); i++)
        {
            if (s1.charAt(i)!=s2.charAt(i)) 
            {
                counter++;
            }
        }

        return counter;
    }

}

public class Main {
    public static void main(String[] args) {
        int diff = Haming.distance("toned","roses");
        System.out.printf("%d\n",diff);

    }

}