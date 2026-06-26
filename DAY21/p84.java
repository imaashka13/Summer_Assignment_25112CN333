package DAY21;

// Write a program to Convert lowercase to uppercase.

import java.util.*;
public class p84 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        String r="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>='a'&& ch<='z')
                ch=(char)(ch-32);
            r=r+ch;
        } 
        System.out.println("Uppercase String: "+r);   
    }
}
