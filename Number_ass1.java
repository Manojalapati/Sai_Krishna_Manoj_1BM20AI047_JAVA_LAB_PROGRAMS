

public class Number_ass1 {
    int var;
    Number_ass1(){}
    Number_ass1(int a)
    {
        this.var = a;
    }
    boolean iszero(){
        if(var == 0)
            return true;
        return false;
    }
    boolean ispos(){
        if(var>0)
            return true;
        return false;
    }
    boolean isneg(){
        if(var<0)
            return true;
        return false;
    }
    boolean isodd(){
        if(var%2 != 0)
            return true;
        return false;
    }
    boolean iseven(){
        if(var%2 == 0)
            return true;
        return false;
    }
    boolean isprime(){
        for(int i=0;i<=var/2;i++)
        {
            if(var%i == 0)
                return false;
        }
        return true;
    }
    //boolean isarmstrong()
    public static void main(String args[])
    {
        Number_ass1 obj = new Number_ass1(100);
        System.out.println("even or not "+obj.iseven());
    }
}
