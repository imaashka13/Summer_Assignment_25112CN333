package DAY28;

// Write a program to create bank account system.

import java.util.*;
public class p110 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String Name="";
        int AccountNo=0;
        double Balance=0.0;
        int choice;
        do
        {
            System.out.println("\nBank Account System");
            System.out.println("1. Create Account");
            System.out.println("2. Display Account Details");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice)
            {
                case 1:
                    System.out.print("Enter account holder name: ");
                    Name=sc.nextLine();
                    System.out.print("Enter account number: ");
                    AccountNo=sc.nextInt();
                    System.out.print("Enter initial balance: ");
                    Balance=sc.nextDouble();
                    System.out.println("Account created successfully.");
                    break;
                case 2:
                    if(Name.equals(""))
                        System.out.println("No account found.");
                    else
                    {
                        System.out.println("\nAccount Details:");
                        System.out.println("Account Holder Name: "+Name);
                        System.out.println("Account Number: "+AccountNo);
                        System.out.println("Balance: "+Balance);
                    }
                    break;
                case 3:
                    if(Name.equals(""))
                        System.out.println("No account found.");
                    else
                    {
                        System.out.print("Enter amount to deposit: ");
                        double deposit=sc.nextDouble();
                        Balance+=deposit;
                        System.out.println("Amount deposited successfully. New balance: "+Balance);
                    }
                    break;
                case 4:
                    if(Name.equals(""))
                        System.out.println("No account found.");
                    else
                    {
                        System.out.print("Enter amount to withdraw: ");
                        double withdraw=sc.nextDouble();
                        if(withdraw>Balance)
                            System.out.println("Insufficient balance.");
                        else
                        {
                            Balance-=withdraw;
                            System.out.println("Amount withdrawn successfully. New balance: "+Balance);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        while(choice!=5);
    }
}
