package no_of_digits_in_int;
import java.util.Scanner;
public class No_of_digits_in_int {
 public static void main(String[] args) {
        int n,i=0;
        System.out.println("enter the number");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        
        while(n>0)
        {
            n=n/10;
            i++;
        }
                System.out.println("output="+i);
    }
    
}
