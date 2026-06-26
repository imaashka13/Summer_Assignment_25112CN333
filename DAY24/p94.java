package DAY24;

// Write a program to Compress a string.

import java.util.*;
public class p94 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        if(str.length()==0)
        {
            System.out.println("Empty string.");
            return;
        }
        String res="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(i==0 || ch!=str.charAt(i-1))
                res=res+ch;
        }
        System.out.println("Compressed string: "+res);
    }
}
