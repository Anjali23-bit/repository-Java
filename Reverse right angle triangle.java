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
            for(j=1;j<column-i;j++)
            {
                System.out.print(" "+" ");
            }
            //System.out.println();
            for(k=0;k<i+1;k++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}