import java.util.Scanner;
public class BinaryAddition {
	public static void main(String args[]){

	    int n=new Scanner(System.in).nextInt();
	    int m=new Scanner(System.in).nextInt();
	    int b=new Scanner(System.in).nextInt();
	    int c=0;
	    int o=0;
	    int p=0;
	    
	   
	    
	        while(n>0||m>0||c>0){
	        int s=n%10;
	        int t=m%10;
	        n=n/10;
	        m=m/10;
	     
	        int j=s+t+c;
	        c=j/b;
	        j=j%b;
	         
	      o+=j*p;
	      p=p*10;
	        }
	   
	        
	    System.out.println(o);

	    }
}
