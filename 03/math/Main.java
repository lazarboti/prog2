public class Main
{
    public static void main(String[] args)
    {
        System.out.println("ABszolut érték");
        int i1 =-6;
        System.out.println("Bemenet:"+i1);
        System.out.println("Kimenet:"+ Math.abs(i1));
        System.out.println("--------------");
        System.out.println("Összeadás");
        int a =6;
        int b = 4;
        System.out.println("Bemenet:"+a+ "+"+b);
        System.out.println("Kimenet:"+ Math.addExact(a,b));
        System.out.println("--------------");
        System.out.println("Gyökvonás");
        int c =81;
        System.out.println("Bemenet:"+c);
        System.out.println("Kimenet:"+ Math.sqrt(c));
        System.out.println("--------------");
        System.out.println("Kerekités");
        double d =11.23;
        System.out.println("Bemenet:"+d);
        System.out.println("Kimenet:"+ Math.round(d));
        System.out.println("--------------");
        System.out.println("Maximum , melyik a nagyobb");
        int e =11;
        int f = 2;
        System.out.println("Bemenet:"+f+","+e);
        System.out.println("Kimenet:"+ Math.max(e,f));
        System.out.println("--------------");
        


        
        

    }
}