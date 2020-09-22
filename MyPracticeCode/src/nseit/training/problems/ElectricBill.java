package nseit.training.problems;
import java.util.Scanner;

public class ElectricBill {
	
	double calculateTotalBill(String connType, int prevReading, int currReading) {
		int diff = currReading - prevReading;
		int TotalBill = 0;
		
		switch(connType.toLowerCase()) {
		case "domestic" :
			if(diff <= 100) {
				TotalBill = diff * 2;
			}
			else if(diff > 100 && diff <= 300) {
				TotalBill = diff * 3;
			}
			else {
				TotalBill = diff * 4;
			}
			break;
			
		case "agriculture" : 
			if(diff <= 100) {
				TotalBill = diff * 1;
			}
			else if(diff > 100 && diff <= 300) {
				TotalBill = diff * 2;
			}
			else {
				TotalBill = diff * 3;
			}
			break;
			
		case "commercial" : 
			if(diff <= 100) {
				TotalBill = diff * 3;
			}
			else if(diff > 100 && diff <= 300) {
				TotalBill = diff * 4;
			}
			else {
				TotalBill = diff * 5;
			}
			break;
			
		default : 
			System.out.println("Enter proper connection type !!!");
		
		}
		return TotalBill;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Current Reading : ");
		int currReading = sc.nextInt();
		System.out.println("Enter Previous Reading : ");
		int prevReading = sc.nextInt();
		System.out.println("Enter Your Connection Type : ");
		String connType = sc.next();
		ElectricBill e = new ElectricBill();
		Double TotalBill = e.calculateTotalBill(connType, prevReading, currReading);
		System.out.println("Your Total Bill is : "+ TotalBill);
		
		

	}

}
