package DAY19;


import java.util.*;
public class p75
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n=sc.nextInt();
        System.out.print("Enter no. of columns: ");
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        int t[][]=new int[m][n];
        System.out.println("Enter the elements of matrix:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
                a[i][j]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
                t[j][i]=a[i][j];
        }    
        System.out.println("Transpose of matrices:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(t[i][j]+" ");
            System.out.println();
        }
    }
}
        
