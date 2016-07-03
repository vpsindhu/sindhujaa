package reverse_num;

import java.util.Scanner;

public class Reverse_num {

    public static void main(String[] args) {
      
        int n,reverse=0;
        System.out.println("enter the number to reverse");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        while(n!=0)
        {
            reverse=reverse*10;
            reverse=reverse+n%10;
            n=n/10;
        }
        System.out.println("reverse of a no = "+reverse);
    }
    
}
