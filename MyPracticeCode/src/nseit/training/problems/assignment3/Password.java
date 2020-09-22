package nseit.training.problems.assignment3;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Password : ");
		String password = sc.next();
		
		ValidatePassword vp = new ValidatePassword();
		try {
			vp.validatePass(password);
		}
		catch(InvalidPasswordException e){
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
