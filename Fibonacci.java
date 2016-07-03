package fibonacci;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
       
        int n;
        System.out.println("enter the number");
        Scanner s=new Scanner(System.in);
          n=s.nextInt();    
    if(n==0)
    {
        System.out.println("0");
    }
    else if(n==1)
    {
        System.out.println("0 1");
    }
    else
    {
        System.out.println("0");
        int a=0;
        int b=1;
        for(int i=1;i<n;i++)
        {
            int nextNumber=a+b;
            System.out.println(nextNumber +"");
            a=b;
            b=nextNumber;
        }
        }
    }
}
