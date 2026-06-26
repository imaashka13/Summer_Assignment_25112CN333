package DAY23;

// Write a program to Find first non-repeating character.

import java.util.*;
public class p89 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        boolean f=false;
        char nr=' ';
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            int count=0;
            for(int j=0;j<str.length();j++)
            {
                if(ch==str.charAt(j))
                    count++;
            }
            if(count==1)
            {
                nr=ch;
                f=true;
                break;
            }
        }
        if(f)
            System.out.println("First non-repeating character: "+nr);
        else 
            System.out.println("No non-repeating character found.");
    }  
}
