import java.util.*;
public class p119 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int maxEmp=100;
        int empIds[]=new int[maxEmp];
        String empNames[]=new String[maxEmp];
        double empSalary[]=new double[maxEmp];
        int empcount=0;
        int choice;
        System.out.println("Welcome to the Mini Employee Management System:");
        do {
            System.out.println("Menu:");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Update Employee Salary");
            System.out.println("4. Search Employee");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) 
            {
                case 1:
                    if (empcount < maxEmp) 
                    {
                        System.out.print("Enter Employee ID: ");
                        empIds[empcount] = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Employee Name: ");
                        empNames[empcount] = sc.nextLine();
                        System.out.print("Enter Employee Salary: ");
                        empSalary[empcount] = sc.nextDouble();
                        empcount++;
                        System.out.println("Employee record added successfully!");
                    } 
                    else
                        System.out.println("Database is full! Cannot add more records.");
                    break;
                case 2:
                    if (empcount == 0)
                        System.out.println("No records found. Please add employees first.");
                    else 
                    {
                        System.out.println("\n--- Employee Database ---");
                        System.out.printf("%-12s %-25s %-12s\n", "Emp ID", "Name", "Salary");
                        System.out.println("--------------------------------------------------");
                        for (int i = 0; i < empcount; i++)
                            System.out.printf("%-12d %-25s %-12.2f\n", empIds[i], empNames[i], empSalary[i]);
                    }                   
                    break;
                case 3:
                    if (empcount == 0)
                        System.out.println("No records found to update.");
                    else 
                    {
                        System.out.print("Enter Employee ID to update salary: ");
                        int updateId = sc.nextInt();
                        boolean found = false;
                        for (int i = 0; i < empcount; i++) 
                        {
                            if (empIds[i] == updateId) 
                            {
                                System.out.print("Current Salary for " + empNames[i] + " is: " + empSalary[i]);
                                System.out.print("\nEnter New Salary: ");
                                empSalary[i] = sc.nextDouble();
                                System.out.println("Salary updated successfully!");
                                found = true;
                                break;
                            }
                        }
                        if (!found)
                            System.out.println("Employee with ID " + updateId + " not found.");    
                    }
                    break;
                case 4:
                    if (empcount == 0)
                        System.out.println("No records found to search.");
                    else 
                    {
                        System.out.print("Enter Employee ID to search: ");
                        int searchId = sc.nextInt();
                        boolean found = false;
                        for (int i = 0; i < empcount; i++) 
                        {
                            if (empIds[i] == searchId) 
                            {
                                System.out.println("\n--- Record Found ---");
                                System.out.println("ID    : " + empIds[i]);
                                System.out.println("Name  : " + empNames[i]);
                                System.out.println("Salary: " + empSalary[i]);
                                found = true;
                                break;
                            }
                        }
                        if (!found)
                            System.out.println("Employee with ID " + searchId + " not found.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
        while (choice != 5);
    }
}
