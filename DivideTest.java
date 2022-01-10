import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideTest {
	public static void main(String[] args) {
		
		System.out.println("Begin main");
		
		//ctrl+shift+m <-- to auto import
		
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		
		try {
			String str = "Neova Solutions";
			System.out.println("10th letter is "+str.charAt(10));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("invalid string index...");
		}
		
		try {
			
			System.out.println("Enter number1 : "); int x = scan1.nextInt();
			System.out.println("x is "+x);
			
			System.out.println("Enter number2 : "); int y = scan2.nextInt() ;
			System.out.println("y is "+y);
			
			System.out.println("Trying to divide "+x+" by "+y);
	
			int z = x / y; 
			System.out.println("divided");
			System.out.println("z is "+z);
		}
		catch(ArithmeticException e) {
			System.out.println("cannot divide by zero...............");
		}
		catch(InputMismatchException e) {
			System.out.println("Please supply number...");
		}
		// if y is 0 then
		//JVM does the following code
		// ArithmeticException e = new ArithmeticException("/ by zero");
		// throw e;
		
		//this thrown e is supposed to be caught by us at line 14 in a try/catch
		//block, since it is uncaught, it is rethrown back to jvm which 
		//is dropped by it via "terminating your application"
		
		
		System.out.println("End main");
		
	}
}

/*	if(y !=0) { //BUSINESS LOGIC IN IF
int z = x / y; 
System.out.println("divided");
System.out.println("z is "+z);
}
else { // ERROR HANDLING LOGIC IN ELSE
System.out.println("Cannot divide by zero...");
}
*/
