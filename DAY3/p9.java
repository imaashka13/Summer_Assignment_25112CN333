import java.util.*;
public class p9
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int count=0;
        for(int i=1; i<=num; i++)
        {
            if(num%i==0)
                count++;
        }
        if(count==2)
            System.out.println("The entered number is a prime number.");
        else 
            System.out.println("The entered number is not a prime number.");

    }
}
