package DAY20;

// Write a program to Find row-wise sum.

import java.util.*;
public class p79 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n=sc.nextInt();
        System.out.print("Enter no. of columns: ");
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        System.out.println("Enter the elements of matrix:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
                a[i][j]=sc.nextInt();
        }
        System.out.println("Row-wise Sum:");
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=0;j<m;j++)
                sum=sum+ a[i][j];
            System.out.println("Sum of row "+(i+1)+": "+sum);
        }
    }
}
