import java.util.*;
public class p16
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter starting number of range:");
        int n1=sc.nextInt();
        System.out.println("Enter ending number of range:");
        int n2=sc.nextInt();
        System.out.println("Armstrong numbers between "+n1+" and "+n2+" is:");
        for(int i=n1;i<=n2;i++)
        {
            int a=i;
            int t=i;
            int d=0;
            while(t>0)
            {
                d++;
                t=t/10;
            }
            t=i;
            int s=0;
            while(t>0)
            {
                int r=t%10;
                int p=1;
                for(int j=0;j<d;j++)
                {
                    p=p*r;
                }
                s=s+p;
                t=t/10;
            }
            if(s==a)
                System.out.print(a+" ");
        }
        System.out.println();
        
    }
}