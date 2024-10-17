import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        int n=1;
        //int row=sc.nextInt();
        int column=sc.nextInt();
        for(i=0;i<column;i++)
        {
            for(j=1;j<i+1;j++)
            {
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
    }
}