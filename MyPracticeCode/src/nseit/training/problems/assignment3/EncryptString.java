package nseit.training.problems.assignment3;

import java.util.Scanner;

public class EncryptString {
	
	static void encryptString(char[] str) {
		int n = str.length;
		int ascii ;
		for(int i = 1; i<n; i++) {
			if(i%2 != 0) {
				ascii = str[i];
				str[i] = (char) ++ascii;	
			}
		}
		for(int index = 1; index < n; index++) {
			System.out.print(str[index]);
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.next();
		int n =str.length();
		char[] str2 = new char[n+1];
		str2[0] = '#';
		for(int i = 1; i<n;i++) {
			str2[i] = str.charAt(i-1);
		}
		str2[n] = str.charAt(n-1);
	
	
		
		encryptString(str2);
		sc.close();
	}

}
