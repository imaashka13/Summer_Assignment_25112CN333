package DAY14;

import java.util.*;
public class p53 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.print("Enter the element to search: ");
        int s=sc.nextInt();
        boolean f=false;
        for(int i=0;i<n;i++)
        {
            if(a[i]==s)
            {
                System.out.println("Element found at: "+(i+1));
                f=true;
                break;
            }
        }
        if(f==false)
            System.out.println("Element not found.");
    }
}

