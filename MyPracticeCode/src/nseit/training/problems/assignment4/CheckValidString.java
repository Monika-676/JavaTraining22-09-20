package nseit.training.problems.assignment4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckValidString {
	
	public boolean checkString(String str) {
		String regex = "[a-zA-Z0-9]R[0-9][a-zA-Z]{1}";
		if(Pattern.matches(regex, str)) {
			return true;	
		}
		else {
			if(str.length() > 4) {
				System.out.println("String should be only four characters long.");
			}
			else if(str.charAt(1) != 'R') {
				System.out.println("Second character must be uppercase 'R'.");
			}
			else if(Pattern.matches("[^0-9]",str.substring(2, 3))) {
				System.out.println("Third character must be a number between 0-9.");
			}
			return false;
		}
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.next();
		System.out.println(new CheckValidString().checkString(str));
	}

}
