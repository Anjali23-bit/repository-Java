import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        int rem,sum=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0)
        {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println(sum);
    }
}