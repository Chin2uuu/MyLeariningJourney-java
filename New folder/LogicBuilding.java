package bhaichalja;
import java.util.Scanner;

public class LogicBuilding {
	//Implement a program to display the sum of two given numbers if the numbers are same.
	//If the numbers are not same, display the double of the sum.

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=0;
		if(a==b) {
			sum=a+b;
			System.out.println(sum);
		}else {
			sum=2*(a+b);
		System.out.println(sum);
		}

	}

}
