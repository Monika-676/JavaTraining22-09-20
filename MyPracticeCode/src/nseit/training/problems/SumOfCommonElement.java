package nseit.training.problems;

import java.util.Scanner;

public class SumOfCommonElement {
	
	int sumOfCommonElements(int[] a1, int[] a2) {
		int sum = 0;
		int n1 = a1.length;
		int n2 = a2.length;
		
		for(int i=0; i<n1; i++) {
			for(int j=0 ; j<n2; j++) {
				if(a1[i] == a2[j]) {
					sum += a1[i];
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter length of array 1 : ");
		int n1 = sc.nextInt();
		System.out.println("Enter elements of array 1: ");
		int[] array1 = new int[n1];
		for(int i = 0; i<n1; i++) {
			array1[i] = sc.nextInt();
		}
		System.out.println("Enter length of array 2 : ");
		int n2 = sc.nextInt();
		int[] array2 = new int[n2];
		System.out.println("Enter elements of array 2: ");
		for(int i = 0; i<n2; i++) {
			array2[i] = sc.nextInt();
		}
		
		SumOfCommonElement se = new SumOfCommonElement();
		System.out.println("Sum of Common elements is = "+se.sumOfCommonElements(array1, array2));

	}

}
