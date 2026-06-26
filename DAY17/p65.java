package DAY17;


import java.util.*;
public class p65
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of first array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements of first array:");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.print("Enter size of second array: ");
        int m=sc.nextInt();
        int b[]=new int[m];
        System.out.println("Enter the elements of second array:");
        for(int i=0;i<m;i++)
            b[i]=sc.nextInt();
        int c[]=new int[n+m];
        for(int i=0;i<n;i++)
            c[i]=a[i];
        for(int i=0;i<m;i++)
            c[n+i]=b[i];
        System.out.println("Merged array:");
        for(int i=0;i<c.length;i++)
            System.out.print(c[i]+" ");
    }
}