package bhaichalja;

import java.util.Scanner;

public class ExcrelsheetColoumnNo {
	public static int titletoNum(String s) {
//		s= new Scanner(System.in).next();
		int ans=0;
		int p=0;
		for (int i=s.length()-1;i>=0;i--) {
			char c=s.charAt(i);
			int val=(int)c-65+1;
			ans+=val*Math.pow(26, p);
			p++;
		}
		return ans;		
		
	}
	public static void main(String[] args) {
//		titletoNum("AAB");
		System.out.println(titletoNum("AAB"));
	}

}
