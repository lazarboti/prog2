// Ebben a kódban a String osztály split metódusára hoztam néhány példát. A split metódus rendkívül hasznos eszköz adatfeldolgozás során,
// mivel lehetővé teszi, hogy egy hosszabb, összefüggő szöveget részekre bontsunk valamilyen előre meghatározott elválasztó karakter vagy
// mintázat alapján. Ezek az elválasztók lehetnek például szóközök, pontosvesszők, vesszők vagy bármilyen más karakter, amit az adott
// feldolgozási folyamat megkíván. 

public class Main {
    public static void main(String[] args) {
        String teszt1 = "alma,banan,korte";
        String teszt2 = "Kiss Kun Lajos 1978";
        String teszt3 = "Beka;Medve;Oroszlan";
        String[] parts = teszt2.split(" ");
        for (int i = 0; i < parts.length; i++) {
            System.out.printf((i + 1) + "." + parts[i] + "\n");

        }
        System.out.println("-------");
        String[] parts1 = teszt1.split(",");
        for (int i = 0; i < parts1.length; i++) {
            System.out.printf((i + 1) + "." + parts1[i] + "\n");

        }
        System.out.println("-------");
        String[] parts2 = teszt3.split(";");
        for (int i = 0; i < parts2.length; i++) {
            System.out.printf((i + 1) + "." + parts2[i] + "\n");

        }

    }

}