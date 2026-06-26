package DAY15;

import java.util.*;
public class p57 
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
        int s=0, t=n-1;
        while(s!=t)
        {
            int k=a[s];
            a[s]=a[t];
            a[t]=k;
            s++;
            t--;
        }
        System.out.println("Reversed array:");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }   
}
