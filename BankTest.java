/*
 * 
 * 
 * 				stack							heap
 * 
 * 										|<-------------BankAccount ----------------->
 * 										accountNumber	accountHolder	accountBalance
 * 										+-------------------------------------------+
 * 										|	101		|	Minal		|	5000		|
 * 										+-------------------------------------------+
 * 			--------------------------->100 
 * 			|
 * 			|
 * 			100
 * 			baObj1
 * 
 * 													METHOD AREA of Object class
 * 													--------------
 * 													11 methods from Object class
 * 
 * 													METHOD AREA of BankAccount class
 * 													--------------
 * 													toString() // redefined
 * 													void setBankAccount(x,y,z);
 * 													BankAccount();
 * 													withdraw(.);
 * 													deposit(..);
 * 													fundTransfer();
 * 
 * 
 * 
 * 										|<-------------BankAccount ----------------->
 * 										accountNumber	accountHolder	accountBalance
 * 										+-------------------------------------------+
 * 										|	102		|	Bhushan		|	6000		|
 * 										+-------------------------------------------+
 * 			--------------------------->200 
 * 			|
 * 			|
 * 			200
 * 			baObj2
 * 
 * 
 * 										|<-------------BankAccount ----------------->
 * 										accountNumber	accountHolder	accountBalance
 * 										+-------------------------------------------+
 * 										|	103		|	Ruhi		|	7000		|
 * 										+-------------------------------------------+
 * 			--------------------------->300 
 * 			|
 * 			|
 * 			300
 * 			baObj3
 * 													
 * 													
 * 			BankAccount baObj1 		= 	new 		BankAccount();
 * 			|			|				|				|
 *    classname		ref to an object	Allocator	constructor 
 *    
 *    
 *    	CONSTRUCTOR : is a special code block
 *    				  it has the same name as of the enclosing class
 *    				  every class has a default constructor provided by JPL
 *    
 *    
 *    				 A CONSTRUCTOR DOESNT HAVE RETURN TYPE
 *    				 BUT IT CAN TAKE PARAMETERS
 *    
 *    				 IT IS AUTOMATICALLY EXECUTED DURING THE INSTANTIATION PROCESS OF THE CLASS
 *    				 HENCE IT CAN BE USED TO INITIALIZE THE STATE OF THE OBJECT
 *    
 *    				 
 *    
 *    class Flight
 *    {
 *    		Flight() { } <---- constructor
 *    }
 *    
 *    class Point
 *    {
 *    		Point() { } <---- constructor
 *    
 *    }
 * 
 */
public class BankTest {
	public static void main(String[] args) {
		
		BankAccount baObj1 = new BankAccount(201, "Jack",7000);
		BankAccount baObj2 = new BankAccount(301, "Janet",8000);
		BankAccount baObj3 = new BankAccount(401, "Julie",5000);		
		
		baObj1.showBankAccount();
		baObj2.showBankAccount();
		baObj3.showBankAccount();
		
		System.out.println("baObj1 "+baObj1);//indirect call to toString()
		System.out.println("baObj2 "+baObj2);
		System.out.println("baObj3 "+baObj3);
		
		/*
		 * 
		baObj1.setBankAccount(101, "Minal",5000);
		baObj2.setBankAccount(102, "Bhushan",6000);
		baObj3.setBankAccount(103, "Ruhi",7000);
		
		//System.out.println("baObj1 "+baObj1);//indirect call to toString()
		//System.out.println("baObj2 "+baObj2);
		//System.out.println("baObj3 "+baObj3);
		
		baObj1.showBankAccount();
		baObj2.showBankAccount();
		baObj3.showBankAccount();
		
		baObj1.withdraw(-2000);
		baObj2.deposit(7000);
		baObj3.withdraw(4000);
		baObj1.withdraw(1500);
		baObj1.withdraw(3500);
		
		
		baObj1.showBankAccount();
		baObj2.showBankAccount();
		baObj3.showBankAccount();*/
		
	}
}
/*
//String str = baObj1.toString();		
		//System.out.println("str   "+str);
System.out.println(10+"Minal"+20);
int x=90;
String name="80";
float sal=9999; //in $
float ans = x+Integer.parseInt(name)+sal;
System.out.println(ans);
*/
