package basics;
import java.util.Scanner;

public class IsStringPalindrome {

	public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a string = ");
	      String A=sc.next();
	       
	        char[] A_reverse = new char[A.length()];
	        try{
	            for(int i = A.length()-1, j=0 ; i>=0 ; i--,j++){
	            	A_reverse[j] = A.charAt(i);
	            }

	            String reverseString = new String(A_reverse);
	            System.out.println("Reverse String = "+ reverseString);
	            
	            if(A.equals(reverseString)){
	             System.out.println("Yes");
	            }
	            else {
	             System.out.println("No");
	            }
	        }
	        catch(Exception e){
	            System.out.println("Error Message = "+e.getMessage());

	        }
	}
}
