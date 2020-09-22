package nseit.training.problems.assignment3;

import java.util.Scanner;

public class FirstLastCharacter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = sc.next().toLowerCase().trim();
		int n = str.length();
		if(str.charAt(0) == str.charAt(n-1)) {
			System.out.println("Valid String");
		}else {
			System.out.println("Invalid String");
		}
		sc.close();
		
	}

}
