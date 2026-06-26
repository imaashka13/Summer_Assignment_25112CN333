package DAY21;

// Write a program to Count vowels and consonants.

import java.util.*;
public class p83 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine().toLowerCase();
        int v=0,c=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>='a'&& ch<='z')
            {
                if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
                    v++;
                else
                    c++;
            }
        }
        System.out.println("Number of vowels: "+v);
        System.out.println("Number of consonants: "+c);
    }
}
