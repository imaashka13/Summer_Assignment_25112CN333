package DAY19;


import java.util.*;
public class p74 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n=sc.nextInt();
        System.out.print("Enter no. of columns: ");
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        int b[][]=new int[n][m];
        int diff[][]=new int[n][m];
        System.out.println("Enter the elements of first matrix:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
                a[i][j]=sc.nextInt();
        }
        System.out.println("Enter the elements of second matrix:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
                b[i][j]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
                diff[i][j]=a[i][j]-b[i][j];
        }    
        System.out.println("Difference of both matrices:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
                System.out.print(diff[i][j]+" ");
            System.out.println();
        }
    }
}
        
