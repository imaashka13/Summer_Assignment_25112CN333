package DAY16;

import java.util.*;
public class p64 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println("Array after removing duplicates:");
        for(int i=0;i<n;i++)
        {
            boolean d=false;
            for(int j=0;j<i;j++)
            {
                if(a[i]==a[j])
                {
                    d=true;
                    break;
                }
            }
            if(!d)
                System.out.print(a[i]+" ");
        }
    }
}
