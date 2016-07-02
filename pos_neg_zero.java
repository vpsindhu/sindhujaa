package poistive_negative_zero;
import java.util.Scanner;
public class Poistive_negative_zero {
    
      public static void main(String[] args) {
        
        int n;
        
                System.out.println("enter the number");
                Scanner s=new Scanner(System.in);
                n=s.nextInt();
        if(n>0)
        {
            System.out.println("positive number");
        }
        else if(n<0)
                {
           System.out.println("negative number");
                }
        else
        {
            System.out.println("value is zero");
            }
    }
}
