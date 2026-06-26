package DAY6;

import java.util.*;
public class p23
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int c=0;
        int t=n;
        while(t>0)
        {
            if(t%2==1)
                c++;
            t=t/2;
        }
        System.out.println("The number of set bits in "+n+" is: "+c);
        
    }
}