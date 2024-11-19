import java.util.List;

public class PyUtilsTest {

    private PyUtilsTest()
    {

    }
    public static void main(String[] args) {
        rangeHappyCase();
        isEmpty();
    }   
    private static void rangeHappyCase()
    {
        List<Integer>szamok =PyUtils.range(4, 18, 2);
        assert szamok.toString().equals("[4, 6, 8, 10, 12, 14, 16]"):"Hiba!";
        System.out.println("OK");

    }
    private static void isEmpty()
    {
        List<Integer>szamok =PyUtils.range(0,0);
        assert szamok.toString().equals("[]"):"Hiba!";
        System.out.println("OK");

    }

    
}
