
package odd_or_even;

import java.util.Scanner;

 public class Odd_or_even {

   
    public static void main(String[] args) {
      
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        n=s.nextInt();
        if(n%2==0)
        {
            System.out.println("even number");
        }
        else
        {
            System.out.println("odd number");
            
        }
    }
    
}
