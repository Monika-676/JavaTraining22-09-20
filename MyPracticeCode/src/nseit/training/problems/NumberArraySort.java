package nseit.training.problems;

import java.util.Scanner;

public class NumberArraySort {
	int[] sort(int[] array) {
		int temp;
		int len = array.length;
		for(int i = 0; i<len; i++) {
			for(int j = i ; j<len;j++) {
				if(array[j]< array[i]) {
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		return array;
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
		
		System.out.print("Befor Sorting : ");
		for(int index : array) {
			System.out.print(" "+index);
		}
		System.out.println();
		
		NumberArraySort ns = new NumberArraySort();
		array = ns.sort(array);
		
		System.out.print("After Sorting : ");
		for(int index : array) {
			System.out.print(" "+index);
		}
		sc.close();
	}

}
