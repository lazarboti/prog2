class FizzBuzz {
    private int darab;

    FizzBuzz(int darab) {
        this.darab = darab;
    }

    public void start()
    {
        for(int i = 1;i <=darab;i++)
        {
            if (i %3 ==0 && i%5==0) {
                System.out.println("fizzbuzz");
            }
            else if(i%3 ==0)
            {
                System.out.println("fizz");
            }else if (i % 5 ==0) {
                System.out.println("buzz");
            }
            else
            {
                System.out.println(i);
            }


        }
    }

}

public class Main {
    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz(100);
        fb.start();
    }
}