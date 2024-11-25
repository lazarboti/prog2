import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

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

public class Main{
    public static void main(String[] args)
    {
        HashSet<String> szavak =new HashSet<>();
        List <String> sorok = FileUtils.readLines("input.txt");
        for (String sor : sorok) {
            String[] sSzavak = sor.split(" ");
            for(String s : sSzavak)
            {
                szavak.add(s);
            }
        }
        int darab =szavak.size();
        System.out.println(darab);

    }
}