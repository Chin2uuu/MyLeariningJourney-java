package dsa;

public class recusrion {
	
	
	
	
	
	public static int isArrayInSortedOrder(int A [],int index) {
		if (A.length==1)return 1;
		return (A[index-1]<A[index-2]?	0:isArrayInSortedOrder(A, index-1));
	}
//	public static int fact(int n) {
//		if(n==0)
//			return 1;
//		else
//			return n*fact(n-1);
//	}
//	public static void Towerofhanoii(int n, char fromA,char toB, char auxC) {
//		if(n==1) {
//			System.out.println("Move disk "+ n +" from source "+fromA+" to Destination "+toB);
//			return;
//		}
//		Towerofhanoii(n-1,fromA,auxC,toB);
//		
//		System.out.println("Move disk "+ n +" from source "+fromA+" to Destination"+toB);
//		
//		Towerofhanoii(n-1,auxC,toB,fromA);
//		
//	}
	public static void main(String[] args) {
		System.out.println(isArrayInSortedOrder(null, 2));
//		System.out.println(fact(1));
//		Towerofhanoii(3,'A','B','C');
//		
	}

}
//public int fact(int n) {
//	if(n==0)
//		return 1;
//	else
//		return n*fact(n-1);
//}