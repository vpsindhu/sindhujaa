package dec_to_binary;
public class Dec_to_binary {
    public void bin(int n)
    {
        int b[]=new int[25];
        int i=0;
       while(n>0)
        {
            b[i++]=n%2;
            n=n/2;
        }
        for(int j=i-1;j>=0;j--)
        {
            System.out.print(b[j]);
        }
    }
    public static void main(String[] args) {
         Dec_to_binary s=new Dec_to_binary();
         s.bin(5);
    }
        
    }
    

