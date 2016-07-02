package alphabet_ornot;
import java.util.Scanner;
public class Alphabet_ornot {
    public static void main(String[] args) {
        
    char ch;
    
    System.out.println("enter the character");
   Scanner s=new Scanner(System.in);
    ch=s.next().charAt(0);
    if(((ch>='a')&&(ch<='z'))||((ch>='A')&&(ch<='Z')))
            {
                System.out.println("alphabets");
            }
    else
    {
        System.out.println("not alphabets");
    }
    }
    
}
