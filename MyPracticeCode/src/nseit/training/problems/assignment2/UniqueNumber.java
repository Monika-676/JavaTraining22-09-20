package nseit.training.problems.assignment2;

import java.util.Scanner;

public class UniqueNumber {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter an Integer : ");
		int n = sc.nextInt();
		boolean flag = true;
		
		if(n >= 0) {
			Integer N = new Integer(n);
			String str = N.toString();
		//	System.out.println(str);
			
			for(int i = 0; i<str.length();i++) {
				for(int j=i+1; j<str.length();j++) {
					if(str.charAt(i) == str.charAt(j)) {
						flag = false;
						break;
					}
				}
				
			}
		}
		else {
			flag = false;
		}
	
		String res = (flag) ? "Unique" : "Not Unique";
		System.out.println(res);
		
	}
}
