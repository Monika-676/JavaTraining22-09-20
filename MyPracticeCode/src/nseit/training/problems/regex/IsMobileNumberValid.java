package nseit.training.problems.regex;
import java.util.Scanner;
import java.util.regex.Pattern;

public class IsMobileNumberValid {

	public static void main(String[] args) {
//		Write a program to read a string of 10 digit number , 
//		check whether the string contains a 10 digit number in the format XXX-XXX-XXXX where 'X' is a digit.
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Phone Number : ");
		String str = sc.next();
		String regex = "[0-9]{3}-[0-9]{3}-[0-9]{4}";
		System.out.println(Pattern.matches(regex, str));
	}
	
}
