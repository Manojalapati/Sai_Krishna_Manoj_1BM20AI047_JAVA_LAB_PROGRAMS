import java.util.*;
public class exception_array_outofbound {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of elements");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the index value to access");
        int index = sc.nextInt();
        try
        {
            System.out.println(arr[index]);
        }
        catch(Exception e)
        {
            System.out.println("Out of bound exception");
        }
        sc.close();

    }
}
