package DAY17;



import java.util.*;
public class p66 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements of first array:");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.print("Enter size of second array: ");
        int m=sc.nextInt();
        int b[]=new int[m];
        System.out.println("Enter elements of second array:");
        for(int i=0;i<m;i++)
            b[i]=sc.nextInt();
        int u[]=new int[n+m];
        int k=0;
        for(int i=0;i<n;i++)
            u[k++]=a[i];
        for(int i=0;i<m;i++) 
        {
            boolean f=false;
            for(int j=0;j<k;j++) 
            {
                if (b[i]==u[j]) 
                {
                    f=true;
                    break;
                }
            }
            if(!f)
                u[k++]=b[i];
        }
        System.out.println("Union of Arrays:");
        for(int i=0;i<k;i++)
            System.out.print(u[i]+" ");
    }
}
