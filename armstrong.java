package armstrong.number;
import static com.sun.org.apache.xalan.internal.lib.ExsltMath.power;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
               int n, sum = 0, temp, remainder, digits = 0;
          System.out.println("enter a number");
  Scanner s= new Scanner(System.in);
           n = s.nextInt();
 temp = n;
     while (temp != 0) {
         digits++;
         temp = temp/10;
      }
      temp = n;
 while (temp != 0) {
         remainder = temp%10;
         sum = (int) (sum + power(remainder, digits));
         temp = temp/10;
      }
      if (n == sum)
         System.out.println(n + " is an Armstrong number");
      else
         System.out.println(n + " is not an Armstrong number");         
   }
}
    
