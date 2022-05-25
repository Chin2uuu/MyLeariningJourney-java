package bhaichalja;

import java.util.Scanner;

public class productOnCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =new Scanner(System.in).nextInt(),b =new Scanner(System.in).nextInt(),c=new Scanner(System.in).nextInt();
		int p=0;
		if (a==7) {
			System.out.println(p=b*c);
		}
		else if(b==7) {
			System.out.println(c);
		}
		else if(c==7) {
			System.out.println("-1");
		}
		else
			System.out.println(p=a*b*c);
	}

}
