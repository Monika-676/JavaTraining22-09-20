package basics.arrayPractice;
import java.util.Scanner;

public class ArrayManipulation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter length of array = ");
		int n = in.nextInt();
		
		int[] arrayOfInt = new int[n];
		
		for(int i = 0; i<n; i++){
		        arrayOfInt[i] = in.nextInt();
		}
		
		System.out.println("Enter number to check whether it is present in array or not = ");
		int k = in.nextInt();
		boolean flag = false;
		
		for(int i=0;i<n;i++){
//			flag = (k == arrayOfInt[i]) ? true : false;
			if(k == arrayOfInt[i]){
				flag=true;
			}
			else {flag = false;}
		}
		
	
		String x = (flag) ? "Present" : "Absent";
		System.out.println(x);
		in.close();

	}

}
