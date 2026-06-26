package DAY17;



import java.util.*;
public class p67 
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
        int b[]= new int[m];
        System.out.println("Enter elements of second array:");
        for(int i=0;i<m;i++)
            b[i]=sc.nextInt();
        System.out.println("Intersection of Arrays:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++) 
            {
                if(a[i]==b[j])
                {
                    System.out.print(a[i] + " ");
                    break;
                }
            }
        }
    }
}

