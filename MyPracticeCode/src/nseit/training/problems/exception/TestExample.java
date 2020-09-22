package nseit.training.problems.exception;

import java.util.Scanner;

public class TestExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        AgeChecker agc = new AgeChecker();
       
        System.out.println("Enter the age");
        int age = sc.nextInt();
//        agc.checkAge(age);
        try {
            agc.checkAge(age);
        }
        catch(InvalidAgeException e)
        {
            System.out.println(e);
        }
        sc.close();

	}

}
