package DAY24;

// Write a program to Check string rotation.

import java.util.*;
public class p93 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1=sc.nextLine();
        System.out.print("Enter second string: ");
        String str2=sc.nextLine();
        boolean isr=false;
        if(str1.length()==str2.length())
        {
            for(int i=0;i<str1.length();i++)
            {
                String r=(str1.substring(i))+(str1.substring(0,i));
                if(r.equals(str2))
                {
                    isr=true;
                    break;
                }
            }
        }
        if(isr)
            System.out.println("The strings are rotations of each other.");
        else
            System.out.println("The strings are not rotations of each other.");
    }   
}
