package DAY12;


import java.util.*;
public class p45 
{
    public static boolean Palindrome(int num) 
    {
        int a=num;
        int r=0;
        while (num > 0) 
        {
            int digit = num % 10;
            r = r * 10 + digit;
            num = num / 10;
        }
        return (a==r);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (Palindrome(num))
            System.out.println(num + " is a palindrome number.");
        else
            System.out.println(num + " is not a palindrome number.");
    }
}

        

    

