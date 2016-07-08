package palindrome;

import java.util.Scanner;

public class Palin {


	public static void main(String[] args) {
	
		int sum=0;
		System.out.println("enter the digits");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int c=n;
		
		for(;n>0;)
		{
			sum+=n%10;
			n=n/10;
		}
		if(c==n)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
			}

	}
