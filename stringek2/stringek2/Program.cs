using System;
using System.Collections.Generic;
using System.Diagnostics.Eventing.Reader;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace stringek2
{
    class Sztringek2
    {
        // E. verbing
        // Ha az adott sztring hossza legalább 3, akkor
        // a végéhez adjuk hozzá az 'ing' ragot.
        // Ha 'ing'-re végződik, akkor ehelyett az 'ly'
        // ragot tegyük hozzá.
        // Ha a sztring hossza rövidebb 3 karakternél, akkor
        // hagyjuk változatlanul.
        // Adjuk vissza az eredménysztringet.
        private static string Verbing(string s)
        {
            if (s.Length < 3)
            {
                return s;
            }
            if (s.EndsWith("ing"))
            {
                return s + "ly";
            }
            else
            {
                return s + "ing";

            }
        }

        // F. not_bad
        // Egy adott sztringben keressük meg a 'not' és
        // 'bad' szavak előfordulási helyét. Ha a 'bad'
        // a 'not' szót követi, akkor cseréljük ki az
        // egész 'not'...'bad' részsztringet a 'good' szóra.
        // Adjuk vissza az eredmény sztringet.
        // Példa: 'This dinner is not that bad!' ->
        //        This dinner is good!
        private static string NotBad(string s)
        {
            int notIndex = s.IndexOf("not");
            int badIndex = s.IndexOf("bad");

            if (notIndex != -1 && badIndex != -1 && notIndex < badIndex)
            {
                return s.Substring(0, notIndex) + "good" + s.Substring(badIndex + 3);
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
        private static string FrontBack(string a, string b)
        {
            string aeleje;
            string beleje;
            string avege;
            string bvege;
            if (a.Length % 2 == 0)
            {
                aeleje = a.Substring(0, a.Length / 2);
                avege = a.Substring(a.Length / 2);
            }
            else
            {
                aeleje = a.Substring(0, (a.Length + 1) / 2);
                avege = a.Substring((a.Length + 1)/ 2);
            }
            if (b.Length % 2 == 0)
            {
                beleje = b.Substring(0, b.Length/2);
                bvege = b.Substring(b.Length / 2);
            }
            else
            {
                beleje = b.Substring(0, (b.Length + 1) / 2);
                bvege = b.Substring((b.Length + 1) / 2);
            }

            return aeleje+beleje + avege+bvege;
        }


            
        

        private static void Test(string got, string expected)
        {
            var prefix = (got == expected ? " OK " : "  X ");
            Console.WriteLine($"{prefix} got: {got}; expected: {expected}");
        }

        public static void Main(string[] args)
        {
            Console.WriteLine("verbing");
            Test(Verbing("hail"), "hailing");
            Test(Verbing("swiming"), "swimingly");
            Test(Verbing("do"), "do");

            Console.WriteLine();
            Console.WriteLine("not_bad");
            Test(NotBad("This movie is not so bad"), "This movie is good");
            Test(NotBad("This dinner is not that bad!"), "This dinner is good!");
            Test(NotBad("This tea is not hot"), "This tea is not hot");
            Test(NotBad("It's bad yet not"), "It's bad yet not");

            Console.WriteLine();
            Console.WriteLine("front_back");
            Test(FrontBack("abcd", "xy"), "abxcdy");
            Test(FrontBack("abcde", "xyz"), "abcxydez");
            Test(FrontBack("Kitten", "Donut"), "KitDontenut");
            Console.ReadKey();
        }

    }
}
