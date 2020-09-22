package nseit.training.problems.exception;

public class ExceptionTest {

	public static void main(String[] args) {
		
		        int a=20,b=10,c;
		        try {
		        	c=a/b;
		            String str ="Hello";
		            System.out.println("The result is : "+str.charAt(2));
		            
		        }
		        catch(ArithmeticException e) {
		            System.out.println("Inside the arthmetic exception catach block");
		        }
		        catch(ArrayIndexOutOfBoundsException e) {
		            System.out.println("Inside the array index out of bounds exception");
		        }
//		        catch(Exception e) {
//		        	System.out.println("Both exceptions accured!!! "+e.getMessage());
//		        }
		        finally {
		            System.out.println("Inside the finally block");
		        }
		        System.out.println("After the finally block...");
		    }

		}
