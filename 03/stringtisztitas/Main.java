
public class Main {
    public static String cleanProxy(String proxy)

    {
        return proxy.replaceAll("\\s+", "");

    }
    
    public static void main(String[] args) {
        String proxy1 = "192.20.246.138:\n 6666";
        String proxy2 = "206.130.99.82:\n8080";
        String proxy3 = "  123.45.67.89: \t9876";

        System.out.println("Eredeti: " + proxy1);
        System.out.println("Tisztitott: " + cleanProxy(proxy1));

        System.out.println("Eredeti: " + proxy2);
        System.out.println("Tisztitott: " + cleanProxy(proxy2));

        System.out.println("Eredeti: " + proxy3);
        System.out.println("Tisztitott: " + cleanProxy(proxy3));

    }

}