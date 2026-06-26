package DAY5;

import java.util.*;
public class p18
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        if(n<=1)
            System.out.println("Invalid input");
        else
        {
            int a=n;   //to create copy of the number
            int r, sum=0;
            while(a>0)
            {
                r=a%10;
                int f=1;   //to find the factorial of the extracted digit
                for(int i=1;i<=r;i++)
                    f=f*i;
                sum=sum+f;   //to sum the factorials of all the digits in the number
                a=a/10;

            }
            if(sum==n)
                System.out.println("The entered number "+n+" is a strong number.");
            else
                System.out.println("The entered number "+n+" is not a strong number.");
        }
    }
}