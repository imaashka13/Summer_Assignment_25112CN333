import java.util.*;
public class p116 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int maxSize = 100;
        int itemIds[] = new int[maxSize];
        String itemNames[] = new String[maxSize];
        int itemQuantities[] = new int[maxSize];
        double itemPrices[] = new double[maxSize];
        int count = 0;
        System.out.print("Welcome to the Inventory Management System!\n");
        while(true)
        {
            System.out.println("Menu:");
            System.out.println("1. Add Product");
            System.out.println("2. Update Stock/Price");
            System.out.println("3. Search Product");
            System.out.println("4. View Inventory Report");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice==5) 
            {
                System.out.println("Exiting...");
                break;
            }
            switch(choice)
            {
                case 1:
                    if(count>=maxSize) 
                    {
                        System.out.println("Inventory full!");
                        break;
                    }
                    System.out.print("Enter Product ID: ");
                    int id=sc.nextInt();
                    sc.nextLine(); 
                    boolean isDuplicate=false;
                    for (int i = 0; i < count; i++) 
                    {
                        if (itemIds[i] == id) 
                        {
                            isDuplicate = true;
                            break;
                        }
                    }
                    if (isDuplicate) 
                    {
                        System.out.println("Error: This Product ID already exists!");
                        break;
                    }
                    itemIds[count] = id;
                    System.out.print("Enter Product Name: ");
                    itemNames[count] = sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    itemQuantities[count] = sc.nextInt();
                    System.out.print("Enter Price: ");
                    itemPrices[count] = sc.nextDouble();
                    count++;
                    System.out.println("Product added successfully!");
                    break;
                case 2:
                    System.out.print("Enter Product ID to update: ");
                    int updateId = sc.nextInt();
                    int foundIndex = -1;
                    for (int i = 0; i < count; i++) 
                    {
                        if (itemIds[i] == updateId) 
                        {
                            foundIndex = i;
                            break;
                        }
                    }
                    if (foundIndex == -1)
                        System.out.println("Product not found!");
                    else
                    {
                        System.out.print("Update (1) Quantity or (2) Price?: ");
                        int subChoice = sc.nextInt();
                        if (subChoice == 1) 
                        {
                            System.out.print("Enter new quantity: ");
                            itemQuantities[foundIndex] = sc.nextInt();
                            System.out.println("Quantity updated!");
                        } 
                        else if (subChoice == 2) 
                        {
                            System.out.print("Enter new price: ");
                            itemPrices[foundIndex] = sc.nextDouble();
                            System.out.println("Price updated!");
                        } 
                        else
                            System.out.println("Invalid option.");
                    }
                    break;
                case 3:
                    System.out.print("Enter Product ID to search: ");
                    int searchId = sc.nextInt();
                    boolean itemFound = false;
                    for (int i = 0; i < count; i++) 
                    {
                        if (itemIds[i] == searchId) 
                        {
                            System.out.println("\nProduct Found:");
                            System.out.println("ID: " + itemIds[i] + " | Name: " + itemNames[i] + " | Qty: " + itemQuantities[i] + " | Price: $" + itemPrices[i]);
                            itemFound = true;
                            break;
                        }
                    }
                    if (!itemFound)
                        System.out.println("Product not found.");
                    break;
                case 4:
                    if (count == 0)
                        System.out.println("Inventory is empty.");
                    else 
                    {
                        double totalValuation = 0;
                        System.out.println("\n--- CURRENT INVENTORY ---");
                        for (int i = 0; i < count; i++) 
                        {
                            System.out.println("ID: " + itemIds[i] + " \t Name: " + itemNames[i] + " \t Stock: " + itemQuantities[i] + " \t Price: $" + itemPrices[i]);
                            totalValuation += (itemQuantities[i] * itemPrices[i]);
                        }
                        System.out.println("-------------------------");
                        System.out.println("Total Items: " + count);
                        System.out.println("Total Inventory Value: $" + totalValuation);
                    }
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
                    
            
            
