package nseit.training.problems;

import java.util.Scanner;

public class MaxMinDifference {
		int FindDifference(int[] a) {
			int MIN , MAX, Difference;
			NumberArraySort nm = new NumberArraySort();
			a = nm.sort(a);
			MIN = a[0];
			MAX = a[a.length-1];
			if(a.length > 1) {
				Difference = MAX - MIN;
				return Difference;
			}
			else {return a[0];}
		
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
		
		MaxMinDifference m = new MaxMinDifference();
		int diff = m.FindDifference(array);
		System.out.print("Differernce between Max and Min is = "+diff);
		
		
		sc.close();

	}

}
