import java.util.*;
public class p120 
{
    static int maxItems = 100;
    static int[] itemIds = new int[maxItems];
    static String[] itemNames = new String[maxItems];
    static double[] itemPrices = new double[maxItems];
    static int[] itemQuantities = new int[maxItems];
    static int itemCount = 0;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) 
    {
        int choice;
        System.out.println("Welcome to SmartStore Inventory System");
        do
        {
            System.out.println("1. Add New Item to Inventory");
            System.out.println("2. View Current Inventory");
            System.out.println("3. Update Item Stock / Quantity");
            System.out.println("4. Generate Customer Bill (Checkout)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            if (choice >= 1 && choice <= 4)
                manageInventory(choice);
            else if(choice==5)
                System.out.println("Exiting system. Thank you for using SmartStore!");
            else
                System.out.println("Invalid choice! Please pick an option between 1 and 5.");
        }
        while(choice!=5);
    }
    public static void manageInventory(int action)
    {
        if (action == 1) 
        {
            if (itemCount < maxItems) 
            {
                System.out.print("Enter Unique Item ID: ");
                itemIds[itemCount] = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Enter Item Name: ");
                itemNames[itemCount] = scanner.nextLine();
                System.out.print("Enter Price per Unit: ");
                itemPrices[itemCount] = scanner.nextDouble();
                System.out.print("Enter Initial Stock Quantity: ");
                itemQuantities[itemCount] = scanner.nextInt();
                itemCount++;
                System.out.println("\nItem successfully added to inventory!");
            } 
            else 
                System.out.println("Inventory storage capacity reached!");
        }
        else if (action == 2) 
        {
            if (itemCount == 0) 
            {
                System.out.println("No items in stock. Inventory is empty.");
                return;
            }
            System.out.println("\n------------------- CURRENT INVENTORY -------------------");
            System.out.printf("%-10s %-20s %-12s %-10s\n", "Item ID", "Item Name", "Price (INR)", "Quantity");
            System.out.println("---------------------------------------------------------");
            for (int i = 0; i < itemCount; i++)
                System.out.printf("%-10d %-20s %-12.2f %-10d\n", itemIds[i], itemNames[i], itemPrices[i], itemQuantities[i]);
            System.out.println("---------------------------------------------------------");
        }
        else if (action == 3 || action == 4) 
        {
            if (itemCount == 0) 
            {
                System.out.println("Inventory is empty. No items available to process.");
                return;
            }
            System.out.print("Enter the Item ID: ");
            int searchId = scanner.nextInt();
            int index = -1;
            for (int i = 0; i < itemCount; i++) 
            {
                if (itemIds[i] == searchId) 
                {
                    index = i;
                    break;
                }
            }
            if (index == -1) 
            {
                System.out.println("Item ID not found.");
                return;
            }
            if (action == 3) 
            {
                System.out.println("Current Stock for " + itemNames[index] + " is: " + itemQuantities[index]);
                System.out.print("Enter new added stock quantity: ");
                int newStock = scanner.nextInt();
                itemQuantities[index] += newStock;
                System.out.println("Stock updated successfully! New total quantity: " + itemQuantities[index]);
            }
            else if (action == 4) 
            {
                System.out.print("Enter quantity to buy: ");
                int buyQty = scanner.nextInt();
                if (buyQty <= itemQuantities[index]) {
                    double totalCost = buyQty * itemPrices[index];
                    itemQuantities[index] -= buyQty;
                    System.out.println("\n********* INVOICE *********");
                    System.out.println("Item Purchased : " + itemNames[index]);
                    System.out.println("Quantity       : " + buyQty);
                    System.out.println("Price per Unit : " + itemPrices[index]);
                    System.out.println("---------------------------");
                    System.out.printf("Total Amount   : %.2f INR\n", totalCost);
                    System.out.println("***************************");
                    System.out.println("Transaction successful!");
                } 
                else
                    System.out.println("Insufficient stock! Only " + itemQuantities[index] + " units available.");
            }
        }   
    }
}
