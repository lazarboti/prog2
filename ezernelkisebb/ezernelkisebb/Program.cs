using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ezernelkisebb
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int osszeg = 0;
            int[] tomb = new int[1000];
            for (int i = 0; i < tomb.Length; i++)
            {
                tomb[i] = i;
            }
            for (int i = 0; i < tomb.Length; i++)
            {
                if (tomb[i] % 3 == 0 || tomb[i] % 5 == 0)
                    osszeg += tomb[i];
            }
            Console.WriteLine(osszeg);
            Console.ReadKey();
            }
    }

}

