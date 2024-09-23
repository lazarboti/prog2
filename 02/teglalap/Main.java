class Teglalap
{
    public int a;
    public int b;


}
public class Main
{

    public static void main(String[] args)
    {
        Teglalap t1 = new Teglalap();
        t1.a = 6;
        t1.b =10;
        int eredmeny =kerulet(t1.a, t1.b);
        System.out.println(eredmeny);


    }

    public static int kerulet(int a , int b)
    {
        return 2*(a+b);
    }

}