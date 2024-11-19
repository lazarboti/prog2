public class VeremTest {
    public static void main(String[] args) {
        popTest();
        appentTest();
        
    }
    private VeremTest()
    {

    }
    private static void popTest()
    {
        Verem v = new Verem();
        v.append(2);
        v.append(4);
        v.append(6);
        int top =v.pop();
        assert top == 6;
        assert v.toString().equals("[2, 4"): "hiba 2";
        System.out.println("OK");

    }
    private static void appentTest()
    {
        Verem v = new Verem();
        v.append(2);
        v.append(4);
        assert v.toString().equals("[2, 4"): "hiba 1";
        System.out.println("OK");

    }
}
