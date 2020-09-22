package nseit.training.problems.exception;

import java.util.Scanner;

public class FundChecker {
	int balance;
	FundChecker(){
		balance = 5000;
	}
	
	void checkFund(int amount){
		balance = balance - amount;
		if(balance < 2000) {
			throw new InsufficientFundsExceptions("Insufficient Balance!!!");
		}
		else {
			System.out.println("Withdraw successful! Your Total Balance is "+balance);
		}
	}

	public static void main(String[] args) {
		FundChecker fc = new FundChecker();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to withdraw");
		int amount = sc.nextInt();
		try {
			fc.checkFund(amount);
		}
		catch(InsufficientFundsExceptions e) {
			System.out.println(e.getMessage());
		}
	}
}
