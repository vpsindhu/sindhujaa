package factorialno;
import java.util.Scanner;
public class Factorialno {
    public static void main(String[] args) {
       int n,c,fact=1;
        System.out.println("enter a number");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        if(n<0)
        {
            System.out.println("munber should be non negative");
        }
        else
        {
            for(c=1;c<=n;c++)
            {
                fact=fact*c;
            }
            System.out.println("factorial of a number is "+fact);
        
        }
    }
    
}
