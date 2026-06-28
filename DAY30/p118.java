import java.util.*;
public class p118 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int maxBooks=100;
        int bookIds[]=new int[maxBooks];
        String bookTitles[]=new String[maxBooks];
        boolean isAvailable[]=new boolean[maxBooks];
        int bookCount=0;
        int choice;
        System.out.println("Welcome to the Mini Library System:");
        do {
            System.out.println("Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Borrow Books");
            System.out.println("4. Return Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) 
            {
                case 1:
                    if(bookCount<maxBooks) 
                    {
                        System.out.print("Enter Book ID: ");
                        bookIds[bookCount]=sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Book Title: ");
                        bookTitles[bookCount]=sc.nextLine();
                        isAvailable[bookCount]=true;
                        bookCount++;
                        System.out.println("Book added successfully!");
                    } 
                    else
                        System.out.println("Library storage is full!");
                    break;
                case 2:
                    if(bookCount==0)
                        System.out.println("No books available in the library yet.");
                    else 
                    {
                        System.out.println("\nLibrary Catalog");
                        System.out.printf("%-10s %-30s %-15s\n", "Book ID", "Title", "Status");
                        System.out.println("-----------------------------------------------------------");
                        for (int i = 0; i < bookCount; i++) 
                        {
                            String status = isAvailable[i] ? "Available" : "Borrowed";
                            System.out.printf("%-10d %-30s %-15s\n", bookIds[i], bookTitles[i], status);
                        }
                    }
                    break;
                case 3:
                    if (bookCount == 0)
                        System.out.println("No books available to borrow.");
                    else 
                    {
                        System.out.print("Enter the ID of the book you want to borrow: ");
                        int borrowId = sc.nextInt();
                        boolean found = false;
                        for (int i = 0; i < bookCount; i++) 
                        {
                            if (bookIds[i] == borrowId) 
                            {
                                found = true;
                                if (isAvailable[i]) 
                                {
                                    isAvailable[i] = false; 
                                    System.out.println("Success! You have borrowed: " + bookTitles[i]);
                                } 
                                else
                                    System.out.println("Sorry, this book is already borrowed by someone else.");
                                break;
                            }
                        }
                        if (!found)
                            System.out.println("Book ID not found in the system.");
                    }
                    break;
                case 4:
                    if (bookCount == 0)
                        System.out.println("No books registered to return.");
                    else 
                    {
                        System.out.print("Enter the ID of the book you want to return: ");
                        int returnId = sc.nextInt();
                        boolean found = false;
                        for (int i = 0; i < bookCount; i++) 
                        {
                            if (bookIds[i] == returnId) 
                            {
                                found = true;
                                if (!isAvailable[i]) 
                                {
                                    isAvailable[i] = true;
                                    System.out.println("Success! You have returned: " + bookTitles[i]);
                                } 
                                else
                                    System.out.println("This book is already present in the library catalog.");
                                break;
                            }
                        }
                        if (!found)
                            System.out.println("Book ID not found in the system.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } 
        while(choice!=5);
    }
}
