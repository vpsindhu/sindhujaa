
package natural_no;
import java.util.Scanner;

public class Natural_no {

  public static void main(String[] args) {
        
        int n,i=1,sum=0;
        System.out.println("enter the no of items");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        while(i<=n)
        {
            sum=sum+i;
            i++;
        }
        System.out.println("natural no="+sum);
    }
    
}
