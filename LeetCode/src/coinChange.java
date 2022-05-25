
public class coinChange {
	public static void main(String[] args) {
		int a[]= {2,3,5,6};
		int sum=10;
		int count = 0;
		int ans=sum%2;
		for (int i=0;i<a.length;i++) {
			if(sum%a[i]==0){
				count++;
			}
		}
		System.out.println(count);
		System.out.println(ans);
	}

}
