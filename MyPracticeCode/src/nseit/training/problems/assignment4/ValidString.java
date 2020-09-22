package nseit.training.problems.assignment4;

import java.util.Scanner;

public class ValidString {

	public static void main(String[] args) {

		String[] s = {"Gujrat", "Maharashtra", "Tamilnadu","Delhi","Karnataka"};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n element : ");
		int n = sc.nextInt();
		
		
		for(String i : s) {
			try {
				char c= i.charAt(n);
				System.out.print(c);
			}
			catch(StringIndexOutOfBoundsException e) {
				System.out.print("$");
			}
		}
		
		sc.close();
	}

}
