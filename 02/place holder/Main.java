public class Main {
    public static void main(String[] args) {
        String name = "Anna";
        int age = 30;
        double salary = 50000.75;
        boolean isEmployed = true;

        // Placeholder-ek kipróbálása
        String formattedString = String.format(
                "Név: %s\n" +"Kor: %d\n" + "Fizetés: %.2f\n" +"Foglalkoztatott: %b\n",name, age, salary, isEmployed);

        System.out.println(formattedString);
    }
}