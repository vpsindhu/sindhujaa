

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largest_no;
import java.util.Scanner;
/**
 *
 * @author Welcome
 */

public class Largest_no {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        // TODO code application logic here
       int a,b,c,d;
        System.out.println("enter three numbers");
        System.out.println("a=");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        System.out.println("b=");
        b=s.nextInt();
        System.out.println("c=");
        c=s.nextInt();
        d=c>(a>b?a:b)?c:(a>b?a:b);
        //d=(a>b?(a>c?3:4):(b>c?6:8));
        System.out.println("largest number="+d);
        
    }
    
}
