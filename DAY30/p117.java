import java.util.*;
public class p117 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int maxstudents=100;
        int studentIds[]=new int[maxstudents];
        String studentNames[]=new String[maxstudents];
        double studentmarks[]=new double[maxstudents];
        int count=0;
        int choice;
        System.out.println("Welcome to the Student Record System");
        do {
            System.out.println("Menu:");
            System.out.println("1. Add Student Record");
            System.out.println("2. Display Student Records");
            System.out.println("3. Search Student Record");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) 
            {
                case 1:
                    if(count<maxstudents)
                    {
                        System.out.print("Enter Student ID: ");
                        studentIds[count]=sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Student Name: ");
                        studentNames[count]=sc.nextLine();
                        System.out.print("Enter Student Marks: ");
                        studentmarks[count]=sc.nextDouble();
                        count++;
                        System.out.println("Record added successfully!");
                    }
                    else
                        System.out.println("System is full! Cannot add more students.");
                    break;
                case 2:
                    if(count==0)
                        System.out.println("No records found. Please add students first.");
                    else
                    {
                        System.out.println("All Students Records:");
                        System.out.printf("%-10s %-20s %-10s\n", "ID", "Name", "Marks");
                        System.out.println("------------------------------------------");
                        for(int i=0;i<count;i++)
                            System.out.printf("%-10d %-20s %-10.2f\n",studentIds[i],studentNames[i],studentmarks[i]);
                    }
                    break;
                case 3:
                    if(count==0)
                        System.out.println("No records found to search.");
                    else
                    {
                        System.out.print("Enter the ID of the student to search: ");
                        int searchId=sc.nextInt();
                        boolean found=false;
                        for(int i=0;i<count;i++)
                        {
                            if(studentIds[i]==searchId)
                            {
                                System.out.println("\nStudent Found!");
                                System.out.println("ID: " + studentIds[i]);
                                System.out.println("Name: " + studentNames[i]);
                                System.out.println("Marks: " + studentmarks[i]);
                                found = true;
                                break;
                            }
                        }
                        if(!found)
                            System.out.println("Student with ID " + searchId + " not found.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);
    }
}
