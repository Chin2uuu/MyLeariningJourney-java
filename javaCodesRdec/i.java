
import java.util.Scanner;

public class i {
    public static void main(String[] args) {
        System.out.println("enter a no.");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
       
        double i,sum = 0;
        for( i =1 ; i <n ; i++){
            System.out.print("1/"+(int)i+" + ");
            sum = sum + 1/i;

        }
        System.out.println("1/"+n);
        System.out.println("sum is"+sum);
    }   
}