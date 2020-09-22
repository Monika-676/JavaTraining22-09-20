package nseit.training.problems;

import java.util.Scanner;

public class SumAverage {
		void sumAndAverage(int[] a) {
			int sum = 0 , n =a.length;
			double avg = 0;
			for(int i=0; i<n; i++) {
				sum = sum + a[i];
			}
			System.out.println("Sum = "+sum);
			avg = sum /n;
			System.out.println("Average = "+avg);
			
			
		}
	
	
	

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter length of array : ");
		int n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("Enter array elements : ");
		for(int i = 0; i<array.length; i++) {
			array[i] = sc.nextInt();
		}
		SumAverage s = new SumAverage();
		s.sumAndAverage(array);
		sc.close();

	}

}
