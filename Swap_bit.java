class Swap_bit {
public static void main(String args[])throws Exception
{
int a = 89, b = 90;
System.out.println("Before swapping:");
 
System.out.println("A=" + a);
System.out.println("B=" + b);
 
a = a ^ b;  
b = a ^ b; 
a = a ^ b; 
 
System.out.println("After swapping:");
System.out.println("A=" + a);
System.out.println("B=" + b);
}
}
