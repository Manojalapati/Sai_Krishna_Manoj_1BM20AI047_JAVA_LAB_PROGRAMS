package user_defined_exception;
import java.util.*;

//import javax.lang.model.util.ElementScanner6;
class diffzero extends Exception
{
    diffzero()
    {
        super();
    }
}
class negdiff extends Exception
{
    negdiff()
    {
        super();
    }
}

public class diff_exception {
    public static void main(String args[]) throws negdiff, diffzero
    {
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        i = sc.nextInt();
        j = sc.nextInt();

        int diff = i-j;
        try{
        if(diff < 0)
        {
            throw new negdiff();
        }
        else if(diff == 0)
        {
            throw new diffzero();
        }
        else
        {
            System.out.println("diff is positive"+diff);
        }
    }
        catch(negdiff n)
        {
            System.out.println("neg diff caught");
        }
        catch(diffzero d)
        {
            System.out.println("diff zero caught");
        }
        //sc.close();
    }
}
