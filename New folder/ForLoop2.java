package bhaichalja;
import java.util.Scanner;
public class ForLoop2 {
	
		public static void main(String[] args) {
			// The below code generates customerId
			Scanner sc=new Scanner(System.in);
			int totalNoOfCustomers =sc.nextInt();
			String customerId = "";
			for (int counter = 1; counter <= totalNoOfCustomers; counter++) {
				if (counter <= 9)
					customerId = "C0" + counter;
				else
					customerId = "C" + counter;
				System.out.println("Customer Id for customer " + counter + " is "
						+ customerId);
			}
		}
	}
