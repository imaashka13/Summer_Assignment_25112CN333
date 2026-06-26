import java.util.*;
public class p12
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        int n1,n2;
        n1=a;
        n2=b;
        while(b!=0)
        {
            int t=b;
            b=a%b;
            a=t;
        }
        int gcd=a;
        int lcm=(n1*n2)/gcd;
        System.out.println("The LCM of "+n1+" and "+n2+" is: "+lcm);
    }
}