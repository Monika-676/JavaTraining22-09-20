package nseit.training.problems;
import java.util.Scanner;

public class Combinations {
	public double findCombinations(int n, int r) {
		int res = fact(n) / fact(r) * fact(n-r);
		return res;
	}
	
	int fact(int c) {
		if(c==1 || c==0) 
			return 1;
		else
		{ return c*fact(c-1);}
	}
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n : ");
		int n = sc.nextInt();
		System.out.println("Enter value of r : ");
		int r = sc.nextInt();
		
		Combinations cs = new Combinations();
		double res = cs.findCombinations(n, r);
		
		System.out.println("Your ans is  : "+res);
		sc.close();
		
		
	}

	

}
