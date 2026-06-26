package DAY15;

import java.util.*;
public class p60 
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
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]!=0)
            {
                a[c]=a[i];
                c++;
            }
        }
        while(c<n)
        {
            a[c]=0;
            c++;
        }
        System.out.println("Array after moving zeros to the end:");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
    
}
