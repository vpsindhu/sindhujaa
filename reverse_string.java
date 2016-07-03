package reverse;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
              String original,reverse="";
        int i;
         System.out.println("enter a string");
        Scanner s=new Scanner(System.in);
        original=s.nextLine();
        int length=original.length();
        for(i=length-1;i>=0;i--)
            reverse=reverse+original.charAt(i);
        System.out.println("reversed string = "+reverse);
       }
    
}
