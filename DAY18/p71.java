package DAY18;


import java.util.*;
public class p71 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements in sorted order:");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.print("Enter the element to search: ");
        int k=sc.nextInt();
        int l=0, u=n-1, f=-1;
        while(l<=u)
        {
            int m=(l+u)/2;
            if(a[m]==k)
            {
                f=m;
                break;
            }
            else if(a[m]<k)
                l=m+1;
            else
                u=m-1;
        }
        if(f!=-1)
            System.out.println("Element found at position: "+(f+1));
        else
            System.out.println("Element not found.");
    }
}
