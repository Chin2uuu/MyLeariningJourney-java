import java.lang.reflect.Array;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int count=0;
        for(char singleChar='y';singleChar=='y'||singleChar=='Y';)
        {
            System.out.println("Enter the Number:");
            int num=sc.nextInt();
            count++;
            System.out.println("Y for Continue N for Exit:");
            singleChar =sc.next().charAt(0);
            
        }
        System.out.println(sum/count);
    }
    
}
