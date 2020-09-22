package nseit.training.problems;

import java.util.Scanner;

public class StringContainsVowels {
	String CheckVowelPresence(String str){
		if(str.contains("a") && str.contains("e") && str.contains("i") && str.contains("o") && str.contains("u")) {
			return "Yes";
		}
		else {
			return "No";	
		}
	}	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.next();
		
		StringContainsVowels s = new StringContainsVowels();
		System.out.println(s.CheckVowelPresence(str));
		sc.close();
	}

}
