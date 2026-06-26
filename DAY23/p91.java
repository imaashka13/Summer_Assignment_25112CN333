package DAY23;

// Write a program to Check anagram strings.

import java.util.*;
public class p91 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1=sc.nextLine();
        System.out.print("Enter second string: ");
        String str2=sc.nextLine();
        boolean isanagram=true;
        if(str1.length()!=str2.length())
            isanagram=false;
        else
        {
            for(int i=0;i<str1.length();i++)
            {
                char ch=str1.charAt(i);
                int count1=0;
                int count2=0;
                for(int j=0;j<str1.length();j++)
                {
                    if(ch==str1.charAt(j))
                        count1++;
                }
                for(int j=0;j<str2.length();j++)
                {
                    if(ch==str2.charAt(j))
                        count2++;
                }
                if(count1!=count2)
                {
                    isanagram=false;
                    break;
                }
            }
        }
        if(isanagram)
            System.out.println("The strings are anagrams.");
        else
            System.out.println("The strings are not anagrams.");
    }
}
