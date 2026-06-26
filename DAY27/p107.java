package DAY27;

// Write a program to create sales management system.

import java.util.*;
public class p107 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int productId[]=new int[100];
        String productName[]=new String[100];
        double price[]=new double[100];
        int quantity[]=new int[100];
        int count=0;
        int choice;
        do
        {
            System.out.println("Sales Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Search Product by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter Product ID: ");
                    productId[count]=sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter Product Name: ");
                    productName[count]=sc.nextLine();
                    System.out.print("Enter Price: ");
                    price[count]=sc.nextDouble();
                    System.out.print("Enter Quantity: ");
                    quantity[count]=sc.nextInt();
                    count++;
                    System.out.println("Product Added!");
                    break;
                case 2:
                    if(count==0)
                        System.out.println("No Records Found");
                    else
                    {
                        System.out.println("Product Records:");
                        System.out.println("Product ID\tName\tPrice\tQuantity");
                        for(int i=0;i<count;i++)
                            System.out.println(productId[i]+"\t\t"+productName[i]+"\t"+price[i]+"\t"+quantity[i]);
                    }
                    break;
                case 3:
                    boolean found=false;
                    System.out.print("Enter Product ID to search: ");
                    int id=sc.nextInt();
                    for(int i=0;i<count;i++)
                    {
                        if(productId[i]==id)
                        {
                            System.out.println("Record Found:");
                            System.out.println("Product ID\tName\tPrice\tQuantity");
                            System.out.println(productId[i]+"\t\t"+productName[i]+"\t"+price[i]+"\t"+quantity[i]);
                            found=true;
                        }
                    }
                    if(!found)
                        System.out.println("Record Not Found");
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
        while(choice!=4);
    }
    
}
