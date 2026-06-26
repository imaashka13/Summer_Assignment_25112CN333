package DAY6;

import java.util.*;
public class p21
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int dec=sc.nextInt();
        if(dec==0)
            System.out.println("Binary number: 0");
        else
        {
            String bin="";
            int t=dec;
            while(t>0)
            {
                int r=t%2;
                bin = r + bin;
                t=t/2;
            }
            System.out.println("Binary number: "+bin);
        }
        
    }
}