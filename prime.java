package check_prime;
import java.util.Scanner;
public class Check_prime {
    public static void main(String[] args) {
                int n,temp,c=0;
	System.out.println("Enter a number");
	Scanner s=new Scanner(System.in);
        n=s.nextInt();
	temp=n;
	for(int i=temp;i>0;i--)
	{
		if((n%i)==0)
		c++;
	}
	if(c==2)
	{
	System.out.println("prime number");
	}	
	else
	{
		System.out.println("not a prime number");
	}

}
    }
    

