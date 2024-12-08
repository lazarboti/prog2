namespace linq
{
    internal class Program
    {
        static void Main(string[] args)
        {
           var input1= new List<string> { "auto", "villamos", "metro" };
           var output1 = input1.Select(x => x.ToUpper()+"!").ToList();
            Console.WriteLine(string.Join(" ,",output1));

            var input2 = new List<string> { "aladar", "bela", "cecil" };
            var output2 = input1.Select(x => char.ToUpper(x[0])+x.Substring(1)).ToList();
            Console.WriteLine(string.Join(" ,",output2));

            List<int> tomb1 = Enumerable.Repeat(0,10).ToList();
            Console.WriteLine(string.Join(" ,",tomb1));

           
            var tomb2  = Enumerable.Range(1,10);
            var output4 = tomb2.Select(x => x*2).ToList();
            Console.WriteLine(string.Join(" ,", output4));

            var input5 = new List<string> { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
            var output5 = input5.Select(x => int.Parse(x)).ToList();
            Console.WriteLine(string.Join(" ,", output5));

            string input7 = "1234567";
            var output7 = input7.Select(x => x -'0').ToList();
            Console.WriteLine(string.Join(" ,", output7));

            string input8 = "The quick brown fox jumps over the lazy dog";
            var output8 = input8.Split(" ").Select(x => x.Length).ToList();
            Console.WriteLine(string.Join(" ,", output8));

            string input9 = "python is an awesome language";
            var output9 = input9.Split(" ").Select(x => x.Substring(0,1)).ToList();
            Console.WriteLine(string.Join(" ,", output9));

            string input10 = "The quick brown fox jumps over the lazy dog";
            var outpur10 = input10.Split(" ").Select(s => new {szo = s ,hossz =s.Length }).ToList();
            foreach (var s in outpur10)
            {
                Console.Write(s.szo+":"+s.hossz+",");
            }
            Console.WriteLine();

            var output11 = Enumerable.Range(1,10-1).Where(x => x%2==0).ToList();
            Console.WriteLine(string.Join(" ,", output11));

            var output12 = Enumerable.Range(0, 20-1).Where(x => x % 2 == 0).Select(x => x*x).ToList();
            Console.WriteLine(string.Join(" ,", output12));

            var output13 = Enumerable.Range(0, 20 - 1).Where(x => x % 2 == 0).Select(x => x * x).Where(x => x%10 ==4).ToList();
            Console.WriteLine(string.Join(" ,", output13));

            var input14 = new List<string>{" apple ", " banana ", " kiwi" };
            var output14 = input14.Select(s => s.Trim()).ToList();
            Console.WriteLine(string.Join(" ,", output14));

            int[] imnput15 =[1, 0, 1, 1, 0, 1, 0, 0];
            var output15 = string.Concat(imnput15);
        }
    }
}
