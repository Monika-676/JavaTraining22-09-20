package nseit.training.problems.assignment2;

public class PrimeNumber {
	
	boolean Prime(int n) {
		
		boolean flag = true;
		if(n == 0 || n == 1) {
			flag = false;
		}
		else {
			for(int i=2 ; i < n; i++) {
				
				if(n%i == 0) {
					flag = false;
					break;
				}
			}	
		}
		
		return flag;
	}
}
