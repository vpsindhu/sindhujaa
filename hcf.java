package hcf;
import java.util.Scanner;
public class Hcf {
    public static void main(String[] args)  {
        
        int n1,n2;
        System.out.println("enter the first number");
        Scanner s=new Scanner(System.in);
          n1=s.nextInt();   
        System.out.print("Enter the Second number");
            n2=s.nextInt(); 
            int hcf=0;
            int min = Math.min(n1,n2);
             
            for(int i=min; i >= 1; i--)
            {
                if(n1%i == 0 && n2%i == 0)
                {
                    hcf = i;
                    break;
                }
            }        
            System.out.print("\nThe hcf of "+n1+" and "+n2+" = "+hcf);
}
    }
    
