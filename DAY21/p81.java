package DAY21;

// Write a program to Find string length without strlen().


import java.util.*;
public class p81 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        char c[]=s.toCharArray();
        int count=0;
        for(int i=0;i<c.length;i++)
            count++;
        System.out.println("Length of the string: "+count);
    }
}
