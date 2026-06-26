package DAY23;

// Write a program to Find first repeating character.

import java.util.*;
public class p90 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        boolean f=false;
        char r=' ';
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            int count=0;
            for(int j=0;j<str.length();j++)
            {
                if(ch==str.charAt(j))
                    count++;
            }
            if(count>1)
            {
                r=ch;
                f=true;
                break;
            }
        }
        if(f)
            System.out.println("First repeating character: "+r);
        else 
            System.out.println("No repeating character found.");
    }
}
