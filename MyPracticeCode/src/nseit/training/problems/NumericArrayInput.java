package nseit.training.problems;

import java.util.Scanner;

public class NumericArrayInput {
	int n ;
	int[] array;
	
	NumericArrayInput(){
		this.inputArray();
		this.printArray(array);
		
	}
	void inputArray() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter length of array : ");
		n = sc.nextInt();
		System.out.println("Enter array elements : ");
		for(int i = 0; i<n; i++) {
			array[i] = sc.nextInt();
		}	
		sc.close();
	}
	
	void printArray(int[] array){
		for(int index: array) {
			System.out.print(" "+index);
		}
	}

}
