package palindrome;
import java.util.Scanner;
public class Palindrome {
public static void main(String[] args) {
              String original, reverse="";
      int i,length;
     System.out.print("Enter a string = ");
       Scanner s = new Scanner(System.in);
      original = s.nextLine();
      length = original.length();
      for (i = length - 1; i >= 0; i-- )
         reverse = reverse + original.charAt(i);
      if (original.equals(reverse))
         System.out.println("Entered string is a palindrome.");
      else
         System.out.println("Entered string is not a palindrome.");
 
   }
} 
    
    
    

