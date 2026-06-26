package DAY17;


import java.util.*;
public class p68 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements of first array:");
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        System.out.print("Enter size of second array: ");
        int m=sc.nextInt();
        int b[]=new int[m];
        System.out.println("Enter elements of second array:");
        for(int i=0;i<m;i++)
            b[i]=sc.nextInt();
        System.out.println("Common Elements:");
        for(int i=0;i<n;i++) 
        {
            boolean f=false;
            for(int j=0;j<m;j++) 
            {
                if(a[i]==b[j]) 
                {
                    f=true;
                    break;
                }
            }
            if(f)
                System.out.print(a[i]+" ");
        }
    }
}
    
