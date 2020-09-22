package nseit.training.problems.assignment3;

import java.util.regex.Pattern;

public class ValidatePassword {
	void validatePass(String str) {
		//boolean flag = true;
		
		String regex = "[^@_#(0-9)][a-z(A-Z)(0-9)((@_#)+)]{6,}[^@_#]";
		if(Pattern.matches(regex, str)) {
			System.out.println("Valid Password");
		}
		else {
			int n = str.length();
			String LastChar = str.substring(n-1,n);
			String FirstChar = str.substring(0, 1);
						
			if(n <= 7) {
				throw new InvalidPasswordException("Minimum length should be 8 of characters");
//				System.out.println("Minimum length should be 8 of characters");
//				flag = false;
			}
			else if(Pattern.matches("[@#_(0-9)]", FirstChar )) {
				throw new InvalidPasswordException("Should not start with special character @, #, _  and numbers");
				// System.out.println("First char is : "+FirstChar);
				/*
				 * System.out.
				 * println("Should not start with special character @, #, _  and numbers ");
				 * flag = false;
				 */
			}
			else if(Pattern.matches("[@#_]", LastChar)) {
				throw new InvalidPasswordException("Should not end with special character @, #, _ ");
				// System.out.println("Last char is : "+LastChar);
				/*
				 * System.out.println("Should not end with special character @, #, _ "); flag =
				 * false;
				 */
			}
			else {
				throw new InvalidPasswordException("Must contain any one of these three special characters @ or _ or #");
				/*
				 * System.out.
				 * println("Must contain any one of these three special characters @ or _ or #"
				 * ); flag = false;
				 */
			}
			
		}
	}

}
