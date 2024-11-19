public class Product {
    public static int product(int... args)
    {
        int p = 1;
        for (int n : args) {
            p *= n;
        }
        return p;
    }
    
}
