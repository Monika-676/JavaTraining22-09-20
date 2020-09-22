package nseit.training.problems.assignment2;

import java.util.Scanner;

public class IsPalindrome {
	boolean isPal(int n)
	{
		int sum = 0, rem = 0, n2 = n;
		while(n != 0) {
			rem = n%10;
			sum = (sum *10) +rem;
			n=n/10;
		}
		
		if(sum == n2) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		IsPalindrome p = new IsPalindrome();
		if(p.isPal(n)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");	
		}
		sc.close();
		
		
	}

}
