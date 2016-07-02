package power;
import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        
        int a,b;
        System.out.print("enter the num = ");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        System.out.print("enter the power value = ");
        b=s.nextInt();
        System.out.println(Math.pow(a,b));
    }
    
}
