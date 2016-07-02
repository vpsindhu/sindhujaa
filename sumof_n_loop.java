package sumof_n_loop;
import java.util.Scanner;
public class Sumof_n_loop {

    public static void main(String[] args) {
        
        int n,i,sum=0;
        System.out.println("enter n value = ");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=1;i<=n;i++)
        {
            sum=sum+i;
          
        }
        System.out.println("sum of n natural no = "+sum);
    }
    
}
