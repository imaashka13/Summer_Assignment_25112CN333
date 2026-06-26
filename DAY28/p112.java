package DAY28;

// Write a program to create contact management system.

import java.util.*;
public class p112 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String name="";
        String phone="";
        boolean contact=false;
        int choice;
        do
        {
            System.out.println("\nContact Management System");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contact Details");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice)
            {
                case 1:
                    if(contact)
                        System.out.println("Contact already exists.");
                    else
                    {
                        System.out.print("Enter contact name: ");
                        name=sc.nextLine();
                        System.out.print("Enter contact phone number: ");
                        phone=sc.nextLine();
                        contact=true;
                        System.out.println("Contact added successfully.");
                    }
                    break;
                case 2:
                    if(!contact)
                        System.out.println("No contact found.");
                    else
                    {
                        System.out.println("\nContact Details:");
                        System.out.println("Name: "+name);
                        System.out.println("Phone Number: "+phone);
                    }
                    break;
                case 3:
                    if(!contact)
                        System.out.println("No contact found.");
                    else
                    {
                        System.out.print("Enter new contact name: ");
                        name=sc.nextLine();
                        System.out.print("Enter new contact phone number: ");
                        phone=sc.nextLine();
                        System.out.println("Contact updated successfully.");
                    }
                    break;
                case 4:
                    if(!contact)
                        System.out.println("No contact found.");
                    else
                    {
                        contact=false;
                        name="";
                        phone="";
                        System.out.println("Contact deleted successfully.");
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
