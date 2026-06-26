package DAY22;

// Write a program to Remove spaces from string.


import java.util.*;
public class p88 
{
	public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        String res="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
                res+=str.charAt(i);
        }
        System.out.println("String after removing spaces: "+res);
	}
}
