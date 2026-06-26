import java.util.*;
public class p8
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int a=n;
        int rev=0, r;
        while(n>0)
        {
            r=n%10;
            rev= rev*10 + r;
            n=n/10;
        }
        if(rev==a)
            System.out.println("The number "+a+" is palindrome number.");
        else 
            System.out.println("The number "+a+" is not a palindrome number.");

    }

}