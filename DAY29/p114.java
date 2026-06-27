import java.util.*;
public class p114 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int maxSize = 100;
        int a[]=new int[maxSize];
        int size=0;
        System.out.print("Welcome to the Array Operations System!\n");
        while(true)
        {
            System.out.println("Menu:");
            System.out.println("1. Insert Element");
            System.out.println("2. Delete Element");
            System.out.println("3. Search Element");
            System.out.println("4. Display Array");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice=sc.nextInt();
            if(choice==5)
            {
                System.out.println("Exiting...");
                break;
            }
            switch(choice) 
            {
                case 1:
                    if(size>=maxSize)
                        System.out.println("Array is full. Cannot insert more elements.");
                    else
                    {
                        System.out.print("Enter element to insert: ");
                        int element=sc.nextInt();
                        a[size]=element;
                        size++;
                        System.out.println("Element inserted successfully.");
                    }
                    break;
                case 2:
                    if(size<=0)
                        System.out.println("Array is empty. Cannot delete elements.");
                    else
                    {
                        System.out.print("Enter element to delete: ");
                        int element=sc.nextInt();
                        int index=-1;
                        for(int i=0;i<size;i++)
                        {
                            if(a[i]==element)
                            {
                                index=i;
                                break;
                            }
                        }
                        if(index==-1)
                            System.out.println("Element not found in the array.");
                        else
                        {
                            for(int i=index;i<size-1;i++)
                                a[i]=a[i+1];
                            size--;
                            System.out.println("Element deleted successfully.");
                        }
                    }
                    break;
                case 3:
                    if(size<=0)
                        System.out.println("Array is empty. Cannot search elements.");
                    else
                    {
                        System.out.print("Enter element to search: ");
                        int element=sc.nextInt();
                        int index=-1;
                        for(int i=0;i<size;i++)
                        {
                            if(a[i]==element)
                            {
                                index=i;
                                break;
                            }
                        }
                        if(index==-1)
                            System.out.println("Element not found in the array.");
                        else
                            System.out.println("Element found at index: "+index);
                    }
                    break;
                case 4:
                    if(size<=0)
                        System.out.println("Array is empty. Nothing to display.");
                    else
                    {
                        System.out.println("Array elements:");
                        for(int i=0;i<size;i++)
                            System.out.print(a[i]+" ");
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
