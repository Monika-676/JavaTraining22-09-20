package nseit.training.problems.assignment3;

import java.util.Scanner;

public class ConstructString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = sc.next();
		
		if(str.length() > 1) {
			System.out.println("Enter a number : ");
			int n = sc.nextInt();
			char[] array = new char[n*2];
			
			char fc = str.charAt(0);
			char lc = str.charAt(str.length()-1);
			
			for(int i = 0 ; i<n;i++) {
				array[i] = fc;
			}
			for(int i = n ; i<n*2;i++) {
				array[i] = lc;
			}
					
			System.out.println("Your Final String is : ");
			for(int i = 0 ; i<n*2; i++) {
				System.out.print(array[i]);
			}
		}
		else {
			System.out.println("Your sring is : "+str);
		}
		
		
	}

}
