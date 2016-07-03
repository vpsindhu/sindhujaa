package string_to_int;
import java.util.Scanner;
public class String_to_int {
  public static void main(String[] args) {
        String n=new String();
        System.out.println("enter a string");
        Scanner s=new Scanner(System.in);
        n=s.next();
        int i=Integer.parseInt(n);
        System.out.println("output"+i);
    }
    
}
