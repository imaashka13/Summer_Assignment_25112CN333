package DAY22;

// Write a program to Character frequency.

import java.util.*;
public class p87 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            int count=0;
            boolean f=false;
            for(int k=0;k<i;k++)
            {
                if(str.charAt(k)==ch)
                {
                    f=true;
                    break;
                }
            }
            if(!f)
            {
                for(int j=0;j<str.length();j++)
                {
                    if(ch==str.charAt(j))
                        count++;
                }
                System.out.println(ch+" : "+ count);
            }
        }
    }
}