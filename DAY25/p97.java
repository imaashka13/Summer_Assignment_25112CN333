package DAY25;

// Write a program to merge two sorted arrays.

import java.util.*;
public class p97 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter sorted elements of first array: ");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.print("Enter size of second array: ");
        int m=sc.nextInt();
        int b[]=new int[m];
        System.out.println("Enter sorted elements of second array: ");
        for(int i=0;i<m;i++)
            b[i]=sc.nextInt();
        int c[]=new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m)
        {
            if(a[i]<b[j])
                c[k++]=a[i++];
            else
                c[k++]=b[j++];
        }
        while(i<n)
            c[k++]=a[i++];
        while(j<m)
            c[k++]=b[j++];
        System.out.println("Merged sorted array: ");
        for(i=0;i<n+m;i++)
            System.out.print(c[i]+" ");
    }
}
