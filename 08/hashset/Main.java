import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class Main
{
    public static void main(String[] args) {
        
        HashSet<Integer> szamok = new HashSet<>();
        List<Integer> alap = List.of(5, 2, 3, 5, 1, 4, -200, 5, 1, 3, 2, 2, 5);
        for (int e : alap)
        {
            szamok.add(e);

        }
        List<Integer> sortedSzamok = new ArrayList<>(szamok);
        sortedSzamok.sort(Comparator.reverseOrder());
        System.out.println(sortedSzamok);
        szamok.
        

    }
}