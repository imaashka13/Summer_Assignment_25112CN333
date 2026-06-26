package DAY28;

// Write a program to create ticket booking system.

import java.util.*;
public class p111 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String passengerName="";
        int ticketNo=0;
        boolean isBooked=false;
        int choice;
        do
        {
            System.out.println("\nTicket Booking System");
            System.out.println("1. Book Ticket");
            System.out.println("2. Display Ticket Details");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice)
            {
                case 1:
                    if(isBooked)
                        System.out.println("Ticket already booked.");
                    else
                    {
                        System.out.print("Enter passenger name: ");
                        passengerName=sc.nextLine();
                        System.out.print("Enter ticket number: ");
                        ticketNo=sc.nextInt();
                        isBooked=true;
                        System.out.println("Ticket booked successfully.");
                    }
                    break;
                case 2:
                    if(!isBooked)
                        System.out.println("No ticket found.");
                    else
                    {
                        System.out.println("\nTicket Details:");
                        System.out.println("Passenger Name: "+passengerName);
                        System.out.println("Ticket Number: "+ticketNo);
                    }
                    break;
                case 3:
                    if(!isBooked)
                        System.out.println("No ticket found.");
                    else
                    {
                        isBooked=false;
                        passengerName="";
                        ticketNo=0;
                        System.out.println("Ticket cancelled successfully.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        while(choice!=4);
    }
}
