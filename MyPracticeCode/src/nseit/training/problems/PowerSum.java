package nseit.training.problems;

import java.util.Scanner;

public class PowerSum {
	
	int calculatePowerSum(int[] a) {
		int sum = 0,n = a.length;
		for(int i = 0;i<n; i++) {
			sum += Math.pow(a[i], i);
		}
		return sum;
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
		
		System.out.println((new PowerSum()).calculatePowerSum(array));
		sc.close();

	}

}
