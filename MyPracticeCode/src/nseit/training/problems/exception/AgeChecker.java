package nseit.training.problems.exception;

public class AgeChecker {

	public void checkAge(int age) {
        if(age<0 || age >100) {
            throw new InvalidAgeException("Age cannot be <0 or >100");
        }
        if(age >0 && age <18)
            System.out.println("Insufficient age to vote");
        else
            System.out.println("Eligible for Voting...");
    }
}
