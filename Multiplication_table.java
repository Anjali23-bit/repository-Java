import java.io.*;
import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i;
        int a=sc.nextInt();
        for(i=1;i<11;i++)
        {
            System.out.println(a+" * "+i+" = "+(a*i));
        }
    }
}
