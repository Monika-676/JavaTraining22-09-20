package nseit.training.problems.assignment2;

import java.util.Scanner;

public class FindMiddleElement {
	
	void isMiddleElementPrime(int[] a) {
		int n = a.length;
		int me = a[n/2];
		System.out.print("Middle Element is : "+me);
		PrimeNumber pm = new PrimeNumber();
		if(pm.Prime(me)) {
			System.out.println(" and it is Prime Number");
		}
		else {
			System.out.println(" and it is Not Prime Number");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of array : ");
		int n = sc.nextInt();
		if(n % 2 == 0) {
			System.out.println("Array size should be EVEN only ");
		}
		else {
			System.out.println("Enter array elements : ");
			int[] array = new int[n];
			for(int i = 0; i<n; i++) {
				array[i] = sc.nextInt();
			}
			FindMiddleElement m = new FindMiddleElement();
			m.isMiddleElementPrime(array);
					
			
		}
		
	}

}
