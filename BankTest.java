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
 * 													
 * 													
 * 
 * 
 */
public class BankTest {
	public static void main(String[] args) {
		BankAccount baObj1 = new BankAccount();
		BankAccount baObj2 = new BankAccount();
		BankAccount baObj3 = new BankAccount();		
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
		baObj3.showBankAccount();
		
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
