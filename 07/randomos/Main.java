import java.util.List;
import java.util.Random;

class RandUtils {
    public final static Random r = new Random();

    private RandUtils() {

    }

    public static int randrange(int also, int felso) {
        int result = r.nextInt((felso - also));
        result += also;
        return result;
    }

    public static int randint(int also, int felso) {
        int result = r.nextInt((felso - also+1));
        result += also;
        return result;
    }
    
        public static int choice(List<Integer> szamok) {
            int result = randrange(0, szamok.size());
            return szamok.get(result);
        }
    
    }
    
    public class Main {
    
        public static void main(String[] args) {
            System.out.println(RandUtils.randrange(70, 72));
            System.out.println(RandUtils.randint(70, 72));
            int result = RandUtils.choice(List.of(110,2,1010,4,52301,6));
            System.out.println(result);

    }
}