package DAY22;

// Write a program to Count words in a sentence.

import java.util.*;
public class p86 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sen=sc.nextLine();
        int count=1;
        for(int i=0;i<sen.length();i++)
        {
            if(sen.charAt(i)==' ')
                count++;
        }
        System.out.println("Number of words: "+count);
    }
}
