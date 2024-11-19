public class Main
{
    public static void main(String[] args)
    {
        System.out.println(Product.product());                      // 1
        System.out.println(Product.product(2));            // 2
        System.out.println(Product.product(2, 5));         // 10
        System.out.println(Product.product(2, 5, 10));     // 100
        System.out.println(Product.product(2, 5, 10, 3));  // 300
    }


}