package DAY24;

// Write a program to Remove duplicate characters.

import java.util.*;
public class p96 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        String res="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(res.indexOf(ch)==-1)
                res=res+ch;
        }
        System.out.println("String after removing duplicates: "+res);
    }
}
