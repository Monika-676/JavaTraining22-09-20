package nseit.training.problems.assignment2;

import java.util.Scanner;

public class PrimeIndexAverage {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of array : ");
		int n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("Enter array : ");
		for(int i=0; i<n; i++) {
			array[i] = sc.nextInt();
		}
		
		PrimeNumber pm = new PrimeNumber();
		
		int sum = 0, count = 0;
		float avg ;
		for(int i = 0; i< n; i++) {
			if(pm.Prime(i)) {
				sum += array[i];
				count++;
			}
		}
		try {
			avg = sum / count;
			System.out.println("Average : "+avg);
		}
		catch (Exception e) {
			
			System.out.print("Array size should be greater than 2!!");	
			
		}		
	}

}
