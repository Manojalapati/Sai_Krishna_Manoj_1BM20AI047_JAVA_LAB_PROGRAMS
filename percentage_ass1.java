abstract class Marks{
    abstract double getpercentage();
}

class A extends Marks{
    int m1,m2,m3;
    A(){}
    A(int a,int b,int c)
    {
        this.m1 = a;
        this.m2 = b;
        this.m3 = c;
    }
    double getpercentage()
    {
        return (m1+m2+m3)/3;
    }

}
class B extends Marks{
    int m1,m2,m3,m4;
    B(){}
    B(int a,int b,int c,int d)
    {
        this.m1 = a;
        this.m2 = b;
        this.m3 = c;
        this.m4 = d;
    }
    double getpercentage()
    {
        return (m1+m2+m3+m4)/4;
    }
}
public class percentage_ass1 {
    public static void main(String args[])
    {
        A obj1 = new A(90,90,90);
        B obj2 = new B(91,91,91,91);

        System.out.println("Student A percentage"+ obj1.getpercentage());
        System.out.println("Student B percentage"+ obj2.getpercentage());
    } 
}
