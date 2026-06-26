package DAY26;

// Write a program to create voting eligibility system.

import java.util.*;
public class p102 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        if(age>=18)
            System.out.println("You are eligible to vote.");
        else
            System.out.println("You are not eligible to vote.");
    }   
}
