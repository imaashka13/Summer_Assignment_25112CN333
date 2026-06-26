package DAY26;

// Write a program to create ATM simulation.

import java.util.*;
public class p103 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        double balance=10000;
        System.out.println("Welcome to ATM Simulation");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("Enter your choice:");
        int choice=sc.nextInt();
        if(choice==1)
            System.out.println("Your balance is: "+balance);
        else if(choice==2)
        {
            System.out.println("Enter amount to deposit:");
            double amount=sc.nextDouble();
            balance+=amount;
            System.out.println("Your new balance is: "+balance);
        }
        else if(choice==3)
        {
            System.out.println("Enter amount to withdraw:");
            double amount=sc.nextDouble();
            if(amount>balance)
                System.out.println("Insufficient balance");
            else
            {
                balance-=amount;
                System.out.println("Your new balance is: "+balance);
            }
        }
        else
            System.out.println("Invalid choice");
    }
}
