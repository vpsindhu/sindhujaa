package char_is_vowel_or_cons;
import java.util.Scanner;
public class Char_is_vowel_or_cons {
    public static void main(String[] args) {
        
        char ch;
        Scanner s=new Scanner(System.in);
               System.out.println("enter a character");
                 ch=s.next().charAt(0);
                 if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
                 {
                     System.out.println("vowel");
                 }
                 else
                 {
                     System.out.println("consonant");
                 }
    }
    
}
