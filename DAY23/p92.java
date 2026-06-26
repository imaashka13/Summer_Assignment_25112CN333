package DAY23;

// Write a program to Find maximum occurring character.

import java.util.*;
public class p92 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        char maxch=' ';
        int maxcount=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            int count=0;
            for(int j=0;j<str.length();j++)
            {
                if(ch==str.charAt(j))
                    count++;
            }
            if(count>maxcount)
            {
                maxcount=count;
                maxch=ch;
            }
        }
        System.out.println("Maximum occurring character: "+maxch);
        System.out.println("Count: "+maxcount);
    }
}
