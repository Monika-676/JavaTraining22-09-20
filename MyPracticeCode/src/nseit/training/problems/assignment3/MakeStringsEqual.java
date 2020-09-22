package nseit.training.problems.assignment3;

import java.util.Scanner;

public class MakeStringsEqual {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first string : ");
		String str1 = sc.next();
		System.out.print("Enter second string : ");
		String str2 = sc.next();
		int n1 = str1.length();
		int n2 = str2.length();
		String res = null;
		int diff = 0;
		if(n1 == n2) {
			System.out.println(str1.concat(str2));
		}
		else if(n1 < n2) {
			diff = n2-n1;
			res = str1;
			str2 = str2.substring(diff);
			System.out.println(res.concat(str2));
		}
		else {
			diff = n1-n2;
			res = str2;
			str1 = str1.substring(diff);
			System.out.println(res.concat(str1));
		}
		sc.close();
	}

}
