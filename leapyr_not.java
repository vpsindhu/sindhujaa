package leapyr_not;
import java.util.Scanner;

public class Leapyr_not {
    public static void main(String[] args) {
        
        int n;
        System.out.println("enter the number");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();        
        if(n%4==0)
        {
            System.out.println("leap year");
        }
        else
        {
            System.out.println("not a leap year");
        }
    }
    
}
