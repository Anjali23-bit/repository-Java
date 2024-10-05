import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
      for(int i=0;i<3;i++)
    {
        
        String st;
        String num1;
        int num;
        st=sc.next();
        num=sc.nextInt();
        for(int j=st.length();j<15;j++)
        {
            st=st+" ";
        }
        num1=Integer.toString(num);
        if(num >=0 && num<=999)
        {
            
            if(num1.length()==3)
            {
                System.out.println(st+num1);
            }
            if(num1.length()==2)
            {
                num1="0"+num1;
                System.out.println(st+num1);
            }
            if(num1.length()==1)
            {
                num1="00"+num1;
                System.out.println(st+num1);
            }  
        }
    }
            System.out.println("================================");
   }
}