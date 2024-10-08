public class Main {
    // E. verbing
    // Ha az adott sztring hossza legalább 3, akkor
    // a végéhez adjuk hozzá az 'ing' ragot.
    // Ha 'ing'-re végződik, akkor ehelyett az 'ly'
    // ragot tegyük hozzá.
    // Ha a sztring hossza rövidebb 3 karakternél, akkor
    // hagyjuk változatlanul.
    // Adjuk vissza az eredménysztringet.
    private static String verbing(String s) {
        if (s.length() <= 3) {
            return s;
        } else {
            if (s.endsWith("ing")) {
                return s + "ly";
            } else {
                return s + "ing";
            }

        }

    }

    // F. not_bad
    // Egy adott sztringben keressük meg a 'not' és
    // 'bad' szavak előfordulási helyét. Ha a 'bad'
    // a 'not' szót követi, akkor cseréljük ki az
    // egész 'not'...'bad' részsztringet a 'good' szóra.
    // Adjuk vissza az eredmény sztringet.
    // Példa: 'This dinner is not that bad!' ->
    // This dinner is good!
    private static String notBad(String s) {
        String not = "not";
        String bad = "bad";
        if (s.contains(not) && s.contains(bad)) {
            if (s.indexOf(not) < s.indexOf(bad)) {
                s = s.replace(s.substring(s.indexOf(not), (s.indexOf(bad) + 3)), "good");

            }

        }

        return s;
    }

    // G. front_back
    // Egy sztringet osszunk két részre, s a két részt nevezzük
    // a sztring elejének és végének. Ha a sztring hossza páros, akkor
    // a két rész hossza azonos. Ha a hossz páratlan, akkor az eleje
    // legyen egy karakterrel hosszabb mint a vége.
    // Például 'abcde' esetén a két rész: 'abc' és 'de'.
    // Két adott sztring (a és b) esetén adjunk vissza egy sztringet, mely
    // a következőképpen épül fel:
    // a-eleje + b-eleje + a-vége + b-vége
    // Például ha a = 'abcd' és b = 'xy', akkor az eredmény 'abxcdy' legyen.
    private static String frontBack(String a, String b) {
        String aeleje, avege, beleje, bvege;
        if (a.length() % 2 == 0) {
            aeleje = a.substring(0, a.length() / 2);
            avege = a.substring(a.length() / 2);

        } else {
            aeleje = a.substring(0, a.length() / 2 + 1);
            avege = a.substring(a.length() / 2 + 1);
        }
        if (b.length() % 2 == 0) {
            beleje = b.substring(0, b.length() / 2);
            bvege = b.substring(b.length() / 2);

        } else {
            beleje = b.substring(0, b.length() / 2 + 1);
            bvege = b.substring(b.length() / 2 + 1);
        }
        return "" + aeleje + beleje + avege + bvege;
    }

    static void test(String got, String expected) {
        String prefix = (got.equals(expected) ? " OK " : "  X ");
        System.out.printf("%s got: %s; expected: %s\n", prefix, got, expected);
    }

    public static void main(String[] args) {
        System.out.println("verbing");
        test(verbing("hail"), "hailing");
        test(verbing("swiming"), "swimingly");
        test(verbing("do"), "do");

        System.out.println();
        System.out.println("not_bad");
        test(notBad("This movie is not so bad"), "This movie is good");
        test(notBad("This dinner is not that bad!"), "This dinner is good!");
        test(notBad("This tea is not hot"), "This tea is not hot");
        test(notBad("It's bad yet not"), "It's bad yet not");

        System.out.println();
        System.out.println("front_back");
        test(frontBack("abcd", "xy"), "abxcdy");
        test(frontBack("abcde", "xyz"), "abcxydez");
        test(frontBack("Kitten", "Donut"), "KitDontenut");
    }
}
