import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    
    public static void main(String[] args)
    {
        int[] a=new int[20];
        int[] b=new int[20];
        int i,j,count=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(i=0;i<m;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            b[i]=sc.nextInt(); 
        }
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : a) {
            set1.add(num);
        }

        for (int num : b) {
            set2.add(num);
        }
        set1.retainAll(set2);
        int[] commonElements = new int[set1.size()];
        int index =1;
        for (int num : set1) {
            commonElements[index++] = num;
            count++;
        }
       int[] result=commonElements;
        System.out.println(count);
        for (int num : result)
        {
            System.out.print(num + " ");
        }
    }
    
}