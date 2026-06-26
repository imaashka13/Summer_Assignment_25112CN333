package DAY14;

import java.util.*;
public class p56 
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
        System.out.println("Duplicate elements are: ");
        boolean f=false;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.println(a[i]);
                    f=true;
                    break;
                }
            }
        }
        if(f==false)
            System.out.println("No duplicate element found.");
    }
}
