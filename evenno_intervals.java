package evenno_bw;
import java.util.Scanner;
public class Evenno_bw {
    public static void main(String[] args) {
        int low,high,c=0;
        System.out.println("enter the low limit number");
	Scanner s=new Scanner(System.in);
        low=s.nextInt();
        System.out.println("enter the high limit number");
        high=s.nextInt();
        System.out.println("odd numbers are");
	for(int i=low;i<=high;i++)
	{
		if((i%2)==0)
                {
		System.out.println(""+i);
}
    }
    }
    
}

