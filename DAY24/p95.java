package DAY24;

// Write a program to Find longest word.

import java.util.*;
public class p95 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str=sc.nextLine();
        String w="";
        String lg="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch!=' ')
                w=w+ch;
            else
            {
                if(w.length()>lg.length())
                    lg=w;
                w="";
            }
        }
        System.out.println("Longest word: "+lg);
    }
}
