package DAY15;

import java.util.*;
public class p59 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int l=a[n-1];
        for(int i=n-1;i>0;i--)
            a[i]=a[i-1];
        a[0]=l;
        System.out.println("Array after right rotation:");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
    
}
