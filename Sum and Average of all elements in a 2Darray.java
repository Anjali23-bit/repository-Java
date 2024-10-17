import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    
    public static void main(String[] args)
    {
        int i,j,sum=0;
        float avg=0;
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int column=sc.nextInt();
        int array[][]=new int[row][column];
        for(i=0;i<row;i++)
        {
            for(j=0;j<column;j++)
            {
                array[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<row;i++)
        {
            for(j=0;j<column;j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        for(i=0;i<row;i++)
        {
            for(j=0;j<column;j++)
            {
                sum+=array[i][j];
            }
        }
        avg=sum/(row+column);
        System.out.println("average is: "+avg);
    }
}