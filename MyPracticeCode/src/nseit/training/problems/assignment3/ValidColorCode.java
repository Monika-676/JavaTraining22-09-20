package nseit.training.problems.assignment3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidColorCode {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter color code : ");
		String str = sc.next();
		String regex = "#[A-F(0-9)]{6}";
		if(Pattern.matches(regex, str)) {
			System.out.println("Valid Color Code");
		}
		else {
			System.out.println("Invalid Color Code");
		}
	}

}
