import java.io.*;
import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double r;
        double area;
        int d=sc.nextInt();
        r=d/2;
        System.out.println("Radius is: "+r);
        area=3.14*r*r;
        System.out.println("Area is: "+area);
    }
}
