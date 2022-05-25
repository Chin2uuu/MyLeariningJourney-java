package bhaichalja;
import java.util.Scanner;
public class averagedemo {

	public static void main(String[] args) {
		Scanner c=new Scanner(System.in);
		int grade;
		int counter=0;
		int average;
		int total=0;
		
		
		while(counter<=10) {
			grade=c.nextInt();
			total=total+grade;
			counter++;
			
		}
		average=total/10;
		
		System.out.println("your average gradeis:"+ average);
		
		// TODO Auto-generated method stub

	}

}
