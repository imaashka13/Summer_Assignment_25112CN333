package DAY28;

// Write a program to create library management system.

import java.util.*;
public class p109 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String books[]=new String[100];
        boolean issued[]=new boolean[100];
        int count=0;
        int choice;
        do
        {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice)
            {
                case 1:
                    if(count<books.length) 
                    {
                        System.out.print("Enter book name: ");
                        books[count]=sc.nextLine();
                        issued[count]=false;
                        count++;
                        System.out.println("Book added successfully.");
                    }
                    else
                        System.out.println("Library is full.");
                    break;
                case 2:
                    if(count==0)
                        System.out.println("No books available.");
                    else
                    {
                        System.out.println("\nBooks in Library:");
                        for(int i=0;i<count;i++) 
                        {
                            System.out.print((i+1)+". "+books[i]);
                            if(issued[i])
                                System.out.println(" (Issued)");
                            else
                                System.out.println(" (Available)");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter book name to search: ");
                    String search=sc.nextLine();
                    boolean found=false;
                    for(int i=0;i<count;i++) 
                    {
                        if(books[i].equalsIgnoreCase(search)) 
                        {
                            found=true;
                            System.out.println("Book found.");
                            if(issued[i])
                                System.out.println("Status: Issued");
                            else
                                System.out.println("Status: Available");
                        }
                    }
                    if(!found)
                        System.out.println("Book not found.");
                    break;
                case 4:
                    System.out.print("Enter book name to issue: ");
                    String issue=sc.nextLine();
                    found=false;
                    for(int i=0;i<count;i++) 
                    {
                        if(books[i].equalsIgnoreCase(issue)) 
                        {
                            found=true;
                            if(!issued[i]) 
                            {
                                issued[i] = true;
                                System.out.println("Book issued successfully.");
                            } 
                            else
                                System.out.println("Book is already issued.");
                        }
                    }
                    if(!found)
                        System.out.println("Book not found.");
                    break;
                case 5:
                    System.out.print("Enter book name to return: ");
                    String ret=sc.nextLine();
                    found=false;
                    for(int i=0;i<count;i++) 
                    {
                        if(books[i].equalsIgnoreCase(ret)) 
                        {
                            found=true;
                            if(issued[i]) 
                            {
                                issued[i]=false;
                                System.out.println("Book returned successfully.");
                            } 
                            else
                                System.out.println("Book was not issued.");
                        }
                    }
                    if(!found)
                        System.out.println("Book not found.");
                    break;
                case 6:
                    System.out.println("Thank you for using Library Management System.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        while (choice!=6);
    }
}
