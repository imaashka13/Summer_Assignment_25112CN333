package DAY27;

// Write a program to create employee management system.

import java.util.*;
public class p106 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int empId[]=new int[100];
        String empName[]=new String[100];
        double Salary[]=new double[100];
        int count=0;
        int choice;
        do
        {
            System.out.println("Employee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    empId[count]=sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter Employee Name: ");
                    empName[count]=sc.nextLine();
                    System.out.print("Enter Salary: ");
                    Salary[count]=sc.nextDouble();
                    count++;
                    System.out.println("Employee Added!");
                    break;
                case 2:
                    if(count==0)
                        System.out.println("No Records Found");
                    else
                    {
                        System.out.println("Employee Records:");
                        System.out.println("ID\tName\tSalary");
                        for(int i=0;i<count;i++)
                            System.out.println(empId[i]+"\t"+empName[i]+"\t"+Salary[i]);
                    }
                    break;
                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    int id=sc.nextInt();
                    boolean found=false;
                    for(int i=0;i<count;i++)
                    {
                        if(empId[i]==id)
                        {
                            System.out.println("Record Found:");
                            System.out.println("ID\tName\tSalary");
                            System.out.println(empId[i]+"\t"+empName[i]+"\t"+Salary[i]);
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
