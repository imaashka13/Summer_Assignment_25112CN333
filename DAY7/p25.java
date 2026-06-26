package DAY7;

import java.util.*;
public class p25 
{
    static int factorial(int n) 
    {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        if (n < 0)
            System.out.println("Invalid input.");
        else
            System.out.println("Factorial of "+n+" is:"+ factorial(n));
    }
    
}
