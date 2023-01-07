import java.util.*;
class demo
{
    int a,b,c;
    demo(int a,int b){
        this.a=a;
        this.b=b;
    }
    void method()
    {
        try{
            c = a/b;
            System.out.println("c="+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("b value is 0");
        }
    }
}

public class exception_handling {
    public static void main(String args[])
    {
        int a,b;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        demo d = new demo(a,b);

        d.method();
        sc.close();

    }
}
