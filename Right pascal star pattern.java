import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i,j,k;
        //int n=1;
        //int row=sc.nextInt();
        int column=sc.nextInt();
        for(i=0;i<column;i++)
        {
            for(j=0;j<i+1;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(i=0;i<column;i++)
        {
            for(j=0;j<column-i-1;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}