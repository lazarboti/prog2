import java.util.List;

class MyUtils {
    private MyUtils() {
    }

    public static int polin(List<String> sorok) {
        int result = 0;

        for (String sor : sorok) {
            boolean polindriom = true;

            for (int i = 0; i < sor.length() / 2; i++) { 
                if (sor.charAt(i) != sor.charAt(sor.length() - 1 - i)) {
                    polindriom = false;
                    break; 
                }
            }

            if (polindriom) {
                result++;
            }
        }

        return result;
    }
}
public class Main
{
    public static void main(String[] args) {
        String fname = "words_alpha.txt";
        List<String> sorok = FileUtils.readLines(fname);
        int result = MyUtils.polin(sorok);
        System.out.println(result);
    }
}