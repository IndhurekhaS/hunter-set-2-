import java.util.*;
public class MyClass{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2="";
        String s[]=s1.split("\\s");
        for(int i=0;i<s.length;i++)
        {
            StringBuilder sb=new StringBuilder(s[i]);
            System.out.print(sb.reverse()+" ");
        }
    }
}
