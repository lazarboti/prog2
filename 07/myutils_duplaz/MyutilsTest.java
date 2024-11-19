public class MyutilsTest {

    public static void main(String[] args) {
        DuplazHappyCase();
        StringHappyCase();
        ZeroDupla();
        isEmpty();
    }

    private static void DuplazHappyCase()
    {
        int result = MyUtils.duplaz(1);
        assert result ==2;
        System.out.println("OK");
    }
    private static void ZeroDupla()
    {
        int result = MyUtils.duplaz(0);
        assert result ==0;
        System.out.println("OK");
    }
    private static void isEmpty()
    {
        int result = MyUtils.strlen("");
        assert result == 0;
        System.out.println("OK");
    }
    private static void StringHappyCase() {
        int result = MyUtils.strlen("alma");
        assert result == 4;
        System.out.println("OK");
    }
}
