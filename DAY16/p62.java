package DAY16;


import java.util.*;
public class p62 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of elements: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements:");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int max=0;
        int m=a[0];
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j])
                    c++;
            }
            if(c>max)
            {
                max=c;
                m=a[i];
            }
        }
        System.out.println("Maximum frequency element: "+m);
        System.out.println("Frequency: "+max);
    }
} 
    
