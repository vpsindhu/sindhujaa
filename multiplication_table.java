package multiplication;
import java.util.Scanner;
public class Multiplication {

      public static void main(String[] args) {
        
        int n;
        System.out.println("enter a number");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
    
}
