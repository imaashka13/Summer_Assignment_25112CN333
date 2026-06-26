package DAY25;

// Write a program to sort words by length.

import java.util.*;
public class p100 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of words: ");
        int n=sc.nextInt();
        String words[]=new String[n];
        System.out.println("Enter words: ");
        for(int i=0;i<n;i++)
            words[i]=sc.next();
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(words[i].length()>words[j].length()|| (words[i].length()==words[j].length() && words[i].compareToIgnoreCase(words[j])>0))
                {
                    String temp=words[i];
                    words[i]=words[j];
                    words[j]=temp;
                }
            }
        }
        System.out.println("Words sorted by length: ");
        for(int i=0;i<n;i++)
            System.out.println(words[i]);
   }
}
