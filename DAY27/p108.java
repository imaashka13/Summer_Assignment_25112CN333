package DAY27;

// Write a program to create marksheet generation system.


import java.util.*;
public class p108 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("Marksheet Generation System");
            System.out.println("1. Generate Marksheet");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter Student Name: ");
                    sc.nextLine(); 
                    String name = sc.nextLine();
                    System.out.print("Enter Roll Number: ");
                    int roll = sc.nextInt();
                    System.out.print("Enter Marks in Subject 1: ");
                    int sub1 = sc.nextInt();
                    System.out.print("Enter Marks in Subject 2: ");
                    int sub2 = sc.nextInt();
                    System.out.print("Enter Marks in Subject 3: ");
                    int sub3 = sc.nextInt();
                    int total = sub1 + sub2 + sub3;
                    double percentage = (total / 3.0);
                    String grade;
                    if(percentage >= 90)
                        grade = "A";
                    else if(percentage >= 80)
                        grade = "B";
                    else if(percentage >= 70)
                        grade = "C";
                    else if(percentage >= 60)
                        grade = "D";
                    else
                        grade = "F";
                    
                    System.out.println("\nMarksheet");
                    System.out.println("Name: " + name);
                    System.out.println("Roll Number: " + roll);
                    System.out.println("Subject 1: " + sub1);
                    System.out.println("Subject 2: " + sub2);
                    System.out.println("Subject 3: " + sub3);
                    System.out.println("Total Marks: " + total);
                    System.out.printf("Percentage: %.2f%%\n", percentage);
                    System.out.println("Grade: " + grade);
                    break;
                case 2:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
        while(choice != 2);
    }
}
