package primeno;
import java.util.Scanner;
public class Primeno {
    public static void main(String[] args) {
         int i,n1,n2,j,flag;
        System.out.println("enter the low limit number");
        Scanner s=new Scanner(System.in);
        n1=s.nextInt();
        System.out.println("enter the high limit number");
        n2=s.nextInt();
      for(i=n1+1;i<n2;i++)
  {
      flag=0;
      for(j=2;j<=i/2;j++)
      {
        if(i%j==0)
        {
          flag=1;
          break;
        }
      }
      if(flag==0)
        System.out.println(" "+i);
}
     System.out.println("prime numbers are");
        
     }
}
    
