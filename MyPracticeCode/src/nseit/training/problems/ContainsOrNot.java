package nseit.training.problems;

import java.util.Scanner;

public class ContainsOrNot {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
//		System.out.println("Enter String : ");
//		String str = sc.next();
//		System.out.println("Enter element to check : ");
//		String ch = sc.next();
//		if(str.indexOf(ch) == -1) {
//			System.out.println("Not present");
//		}
//		else {
//			System.out.println("Present");
//		}
		
		System.out.println("Enter length of array : ");
		int n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("Enter array elements : ");
		for(int i = 0; i<array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter element to check : ");
		int t= sc.nextInt();
		boolean flag = false;
		for(int i = 0 ; i<n ; i++) {
			if(array[i] == t) {
				flag = true;
				break;
			}
		}
		String res = (flag) ? "Present" : "Not present";
		System.out.println(res);
		sc.close();

	}

}
