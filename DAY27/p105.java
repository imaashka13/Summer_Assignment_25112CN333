package DAY27;

// Write a program to create student record management system.

import java.util.*;
public class p105 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int roll[]=new int[100];
        String name[]=new String[100];
        int marks[]=new int[100];
        int count=0;
        int choice;
        do
        {
            System.out.println("1. Add Student Record");
            System.out.println("2. Display Student Record");
            System.out.println("3. Search Student Record");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter Roll Number: ");
                    roll[count]=sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter Name: ");
                    name[count]=sc.nextLine();
                    System.out.print("Enter Marks: ");
                    marks[count]=sc.nextInt();
                    count++;
                    System.out.println("Student Added!");
                    break;
                case 2:
                    if(count==0)
                        System.out.println("No Records Found");
                    else
                    {
                        System.out.println("Student Records:");
                        System.out.println("Roll Number\tName\tMarks");
                        for(int i=0;i<count;i++)
                            System.out.println(roll[i]+"\t\t"+name[i]+"\t"+marks[i]);
                    }
                    break;
                case 3:
                    System.out.print("Enter Roll Number to Search: ");
                    int r=sc.nextInt();
                    boolean found=false;
                    for(int i=0;i<count;i++)
                    {
                        if(roll[i]==r)
                        {
                            System.out.println("Record Found:");
                            System.out.println("Roll Number\tName\tMarks");
                            System.out.println(roll[i]+"\t\t"+name[i]+"\t"+marks[i]);
                            found=true;
                            break;
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
