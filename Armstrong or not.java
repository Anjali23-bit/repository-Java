import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        int rem,sum=0,temp;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        temp=n;
        while(n>0)
        {
            rem=n%10;
            sum=sum+rem*rem*rem;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println(temp+" is armstrong");
        }
        else
        {
            System.out.println(temp+" is not an armstrong");
        }
    }
}