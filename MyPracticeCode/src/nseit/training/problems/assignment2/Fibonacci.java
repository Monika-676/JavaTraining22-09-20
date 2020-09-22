package nseit.training.problems.assignment2;

import java.util.Scanner;

public class Fibonacci {
	
	int[] fibonacci(int n) {
		int[] a = new int[n];
		int i = 3, f1 = 2 , f2 = 3,sum;
		a[0] = f1;
		a[1] = f2;
		sum = f1 + f2;
		a[2] = sum;
	
		while(i<n) {
			f1 = f2;
			f2 = sum;
			sum = f1 + f2;
			a[i] = sum;
			i++;
		}
		
		return a;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number :");
		int n = sc.nextInt();
		Fibonacci f = new Fibonacci();
		int sum = 0;
		int[] array = f.fibonacci(n);
		System.out.print("Fiboaccci Series is :");
		for(int i = 0; i< n; i++) {
			System.out.print(array[i]+" ");
			sum += array[i];
		}
		System.out.println();
		System.out.println("Sum is : "+sum);
	}

}
