import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
public class TestCase {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount savObj1 = new SavingsAccount(50000);
		SavingsAccount savObj2 = new SavingsAccount(60000);
		SavingsAccount savObj3 = new SavingsAccount(70000);
		
		System.out.println("Before withdraw1 : "+savObj1.getBalance());
		System.out.println("Before withdraw2 : "+savObj2.getBalance());
		System.out.println("Before withdraw3 : "+savObj3.getBalance());
		
		
		double amountToWithdraw1=5000;
		double amountToWithdraw2=6000;
		double amountToWithdraw3=7000;
		
		
	
			WithdrawTest.testWithdraw(savObj1, amountToWithdraw1);
			WithdrawTest.testWithdraw(savObj2, amountToWithdraw2);
			WithdrawTest.testWithdraw(savObj3, amountToWithdraw3);
		
	
		
		System.out.println("After withdraw1 : "+savObj1.getBalance());
		System.out.println("After withdraw2 : "+savObj2.getBalance());
		System.out.println("After withdraw3 : "+savObj3.getBalance());
		
		

	}

}
*/
class Bank
{
	static SavingsAccount getObject() {
		return new SavingsAccount(50000);
	}
	static SavingsAccount getObject(int x, String y, double z) {
		return new SavingsAccount(x,y,z);
	}
}
public class SavingsAccountTest
{
	//TKI MODEL
	
	@Test
	public void withdrawTest() {
		SavingsAccount savObj1 = Bank.getObject();;
		
		Assertions.assertNotNull(savObj1);
		
			double currentBalance = savObj1.getBalance(); //50000
			double amountToWithdraw1=5000;
			savObj1.withdraw(amountToWithdraw1);
			double updatedBalance =savObj1.getBalance();
		 
		Assertions.assertEquals(currentBalance-amountToWithdraw1, updatedBalance);
			System.out.println("All is OK");
		
	}
	
	@Test
	public void depositTest() {
		SavingsAccount savObj1 = Bank.getObject();;
		
		Assertions.assertNotNull(savObj1);
		
			double currentBalance = savObj1.getBalance(); //50000
			double amountToWithdraw1=5000;
			savObj1.deposit(amountToWithdraw1);
			double updatedBalance =savObj1.getBalance();
		 
		Assertions.assertEquals(currentBalance+amountToWithdraw1, updatedBalance);
			System.out.println("All is OK");
		
	}
	@Test
	public void fundTransferTest() {
		SavingsAccount savObj1 = Bank.getObject(101,"Jack",50000);
		SavingsAccount savObj2 = Bank.getObject(102,"Jill",60000);
		
		Assertions.assertNotNull(savObj1);
		Assertions.assertNotNull(savObj2);

			double amountToTransfer=5000;
			
			double sourceBalance = savObj1.getBalance(); //50000
			double amountToWithdraw=amountToTransfer;
			savObj1.withdraw(amountToWithdraw);
			double updatedSourceBalance =savObj1.getBalance();
			
			double targetBalance = savObj2.getBalance(); //60000
			double amountToDeposit=amountToTransfer;
			savObj2.deposit(amountToDeposit);
			double updatedTargetBalance =savObj2.getBalance();
		 
		Assertions.assertEquals(sourceBalance-amountToWithdraw, updatedSourceBalance);
			System.out.println("Source is OK");
		
		Assertions.assertEquals(targetBalance+amountToDeposit, updatedTargetBalance);
		
			System.out.println("Target is OK");
		
	}
}

class WithdrawTest
{
	//TEST LOGIC OF THE DEVELOPED CODE - TESTING
	static void testWithdraw(SavingsAccount x, double amountToWithdraw) //throws Exception 
	{
		double currentBalance = x.getBalance();
		double updatedBalance = currentBalance - amountToWithdraw;
		
		x.withdraw(amountToWithdraw);
		
		double foundBalance = x.getBalance();
		
		if(foundBalance!=updatedBalance) {
			RuntimeException runTimeEx = new RuntimeException("Expected "+updatedBalance+ " But Found "+foundBalance+ " !!!");
			throw runTimeEx;
			
		}
		else {
			System.out.println("All is OK");
		}
	}
}

class SavingsAccount
{
	int acno;
	String acholder;
	double balance;
	

	public SavingsAccount(int acno, String acholder, double balance) {
		super();
		this.acno = acno;
		this.acholder = acholder;
		this.balance = balance;
	}

	public SavingsAccount(double balance) {
		super();
		this.balance = balance;
	}
	
	//DEVELOPMENT OF THE WITHDRAW - BUSINESS LOGIC
	void withdraw(double amountToWithdraw) {
		System.out.println("Withdrawing...."+amountToWithdraw);
		balance = balance - amountToWithdraw; 
		balance = balance - 1;
	}
	
	void deposit(double amountToDeposit) {
		System.out.println("Depositing...."+amountToDeposit);
		balance = balance + amountToDeposit; 
	//	balance = balance - 1;
	}
	double getBalance() {
		return balance;
	}
	
}