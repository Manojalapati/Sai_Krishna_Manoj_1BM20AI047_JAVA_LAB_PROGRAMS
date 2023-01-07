import java.util.*;

public class strings {
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    
    String s = sc.nextLine();
    int words = 0;
    char ch[]=s.toCharArray();

    for(int i=0;i<ch.length;i++)
    {
        if(ch[i]==' ')
        {
            words+=1;
        }
    }
    System.out.println(words+1);
    ch.toString();
    System.out.println(ch);

    System.out.println(s.toUpperCase());
    }
}
