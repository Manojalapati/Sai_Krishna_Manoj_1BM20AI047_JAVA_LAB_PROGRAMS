import java.util.*;

public class exception_hdling_calculator {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Operations");
        System.out.println("enter your choice");
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1:
            try{
                c = a/b;
                System.out.println("c="+c);
            }
            catch(ArithmeticException e)
            {
                System.out.println("b value = 0");
            }
            break;
            case 2:
            c = a - b;
            System.out.println("c value is"+c );
            break;
            case 3:
            c= a+b;
            System.out.println("c value is"+c );
            break;
            case 4:
            c = a*b;
            System.out.println("c value is"+c );
            break;
            default:
            System.out.println("Invalid case");            
        }
        sc.close();

    }
    
}
