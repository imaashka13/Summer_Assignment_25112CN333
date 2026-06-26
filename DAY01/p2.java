import java.util.*;
public class p2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int p=1;
        System.out.println("Multiplication table of "+n+":");
        for(int i=1; i<=10; i++)
        {
            p=n*i;
            System.out.println(n+"*"+i+"="+p);
        }
    }
}