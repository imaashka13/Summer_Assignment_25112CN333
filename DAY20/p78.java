package DAY20;

// Write a program to Check symmetric matrix. 

import java.util.*;
public class p78 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the order of matrix: ");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        System.out.println("Enter the elements of matrix:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                a[i][j]=sc.nextInt();
        }
        boolean s=true;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]!=a[j][i])
                {
                    s=false;
                    break;
                }
            }
            if(!s)
                break;
        }
        if(s)
            System.out.println("The matrix is symmetric.");
        else
            System.out.println("The matrix is not symmetric.");        
    }
}
