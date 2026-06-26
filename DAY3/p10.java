import java.util.*;
public class p10
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lower limit of range:");
        int lo=sc.nextInt();
        System.out.println("Enter upper limit of range:");
        int up=sc.nextInt();
        System.out.println("The prime numbers in this range are:");
        for(int i=lo; i<=up; i++)
        {
            int t=i;
            int count=0;
            
            for(int j=1; j<=t; j++)
            {
                if(t%j==0)
                    count++;

            }
            if(count==2)
                System.out.print(t +"  ");

        }

    }
}

     