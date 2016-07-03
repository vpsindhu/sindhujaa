package gcd;
import java.util.Scanner;
public class Gcd {

    public static void main(String[] args) {
        int n1,n2;
        System.out.println("enter the first number");
        Scanner s=new Scanner(System.in);
          n1=s.nextInt();   
        System.out.println("Enter the Second number");
            n2=s.nextInt();
             while(n1!=n2)
    {
        if(n1 > n2)
            n1 -= n2;
        else
            n2 -= n1;
    }
System.out.println("GCD = "+n1);
    }
    
}
