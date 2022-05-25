//package bhaichalja;

public class BillAcToFoodandDist {
 public static void main(String arg[]) {
	 String foodType="N";
	 int quantity=2;
	 int distance=2;
	 int bill=0;
	switch(foodType) {
	case "N":
		if (distance==0||quantity==0) {
			System.out.println("-1");
		}
		else if(distance<=3) {
			bill=quantity*12;
					System.out.println("the bill for veg is "+ bill);
		}
		else if (distance>3 && distance<=6) {
			bill=quantity*12+(distance-3)*1;
			System.out.println("the bill for veg & greater distance than 3 is "+bill);
			
		}else {
			bill=quantity*12+(distance-3)*1+(distance-6)*2;
			System.out.println("the bill for veg is for greateer distance than 6 is "+bill);
		}
			break;
		
	case "V":
		if (distance==0||quantity==0) {
			System.out.println("-1");
		}
		else if(distance<=3) {
			bill=quantity*15;
					System.out.println("the bill is "+ bill);
		}
		else if (distance>3 && distance<=6) {
			bill=quantity*15+(distance-3)*1;
			System.out.println("the bill is "+bill);
			
		}
		else {
			bill=quantity*15+(distance-3)*1+(distance-6)*2;
			System.out.println("the bill is "+bill);
		}
			break;
	default:
		return ;
		 
	 }
 }
}
