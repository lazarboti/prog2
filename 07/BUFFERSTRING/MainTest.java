public class MainTest {
    private MainTest()
    {
        // nem példányositható
    }
    public static void main(String[] args) {
        szamolHappyCase();
        isEmpty();
    }
    private static void szamolHappyCase()
    {
        String result = Szamos.szamol(10);
        System.out.println(result);
        assert result == "12345678910":"hiba 1";
        System.out.println("OK");

    }
    private static void isEmpty()
    {
        String result = Szamos.szamol(0);
        assert result == "": "hiba2";
        System.out.println("OK");

    }
    
}
