import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    
    public static void main(String[] args)
    {
        int[] a=new int[20];
        //int[] b=new int[20];
        int i,sum1=0,sum2=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                sum1+=a[i];
            }
            else
            {
                sum2+=a[i];
            }
        }
        System.out.println(sum1+" "+sum2);
        if(sum1<sum2)
        {
            System.out.println(sum2-sum1);
        }
        else if(sum1>sum2)
        {
            System.out.println(sum1-sum2);
        }
        else
        {
            System.out.println("0");
        }
    }
    
}