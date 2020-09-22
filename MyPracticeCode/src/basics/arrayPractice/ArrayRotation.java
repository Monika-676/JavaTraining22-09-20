package basics.arrayPractice;

import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements in arrays : ");
		int n = sc.nextInt();
		int array[] = new int[n];
		for(int i=0; i<n; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter by what position you have to rotate array : ");
		int k = sc.nextInt();
		int Last;
			for(int i = 0 ; i<k;i++) {
				Last = array[n-1];
				for(int j = n-2; j>=0; j--) {
					array[j+1] = array[j];				
				}
				array[0] = Last;
				System.out.print("After "+ i +" Roation : ");
				for(int l : array) {
					System.out.print(l + " ");
				}
				System.out.println();
			}
			
		

	}

}
