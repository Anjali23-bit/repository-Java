import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i=1,n=0;
        while(sc.hasNext())
        {
            String s1=sc.nextLine();
            System.out.println(i+" "+s1);
            i++;
        }
    }
    
}