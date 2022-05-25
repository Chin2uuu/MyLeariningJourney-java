import java.util.Scanner;

public class BinarytoDecimal {
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt();
        int count=0;
        int h=0;
        int m=0;
        

            while(n%2==0){
                 h=n/2;
                 n=h;
                 

                count=count+1;
                
                
            System.out.println(count);

            }
            for(int i=0;i<=count;i++){
             Math.pow(10, i);
                
            }
            System.out.println(m);

          //  System.out.println(h);
        }

   
    }
    
    

