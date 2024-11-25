import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class FileUtils{
    
    public static List<String> readLines(String filename)
    {
        List<String> lines = new ArrayList<>();
        String line;
        try(BufferedReader br = new BufferedReader(new FileReader(filename)))
        {
            while ((line =br.readLine())!=null) {
                lines.add(line);
            }
            br.close();
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }



        return lines;
    }
}
class Szavacska
{
    private String szo;
    private int ertek;

    public Szavacska(String szo, int ertek)
    {
        this.szo = szo;
        this.ertek = ertek;
    }
    public  String getSzo()
    {
        return this.szo;
    
    }
    public  int getertek()
    {
        return this.ertek;
    
    }


}

public class Main{
    public static void main(String[] args) {
        HashMap<String,Integer> szavak = new HashMap<>();

        List<String> sorok = FileUtils.readLines("input.txt");
        for(String sor : sorok)
        {
            String[] sSzavak= sor.split(" ");
            for(String szo : sSzavak)
            {
                if (!szavak.containsKey(szo)) {
                    szavak.put(szo, 1);
                }
                else
                {
                    int db=szavak.get(szo);
                    szavak.put(szo, db+1);
                }
            }
        }
        //System.out.println(szavak.toString());
        List<Szavacska> minden = new ArrayList<>();
        for(Map.Entry<String,Integer> szo : szavak.entrySet())
        {
            minden.add(new Szavacska(szo.getKey(),szo.getValue()));


        }
        int max = 0;
        for(Szavacska sz : minden)
        {
            if (max < sz.getertek()) {
                max = sz.getertek();
            }
        }
        for(Szavacska sz : minden)
        {
            if (max == sz.getertek()) {
                System.out.println(sz.getSzo());
                
            }
        }
        
    }
}