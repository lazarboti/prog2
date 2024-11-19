public class productTest {
    public static void main(String[] args) {
        multiWithZero();
        productHappyCase();
        zeroInput();
    }
    private productTest()
    {

    }
    private static void multiWithZero()
    {
        int result =Product.product(1,2,0,2);
        assert result == 0;
        System.out.println("OK");

    }
    private static void productHappyCase()
    {
        int result =Product.product(2,2,10);
        assert result == 40;
        System.out.println("OK");

    }
    private static void zeroInput()
    {
        int result =Product.product();
        assert result == 1;
        System.out.println("OK");

    }
}
