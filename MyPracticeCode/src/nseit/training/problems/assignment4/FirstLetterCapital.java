package nseit.training.problems.assignment4;

import java.util.Scanner;

public class FirstLetterCapital {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a line : ");
		String sentence = sc.nextLine();
		char oldChar;
		String newChar;
		int n = sentence.length();
		for(int i =0 ;i<n;i++) {
			if(sentence.charAt(i) == ' ') {
				oldChar = sentence.charAt(i+1);
			}
		}
		System.out.println(sentence);
		sc.close();
		
				
	}

}
