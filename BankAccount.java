
//Object class is the ROOT of the java class hierarchy
//there are 11 methods which are inherited to your class

public class BankAccount { // every class is the child of java.lang.Object class
	
	private int accountNumber;		// FIELD1	
	private String accountHolder;	// FIELD2
	private double accountBalance;	// FIELD3
	
	//METHOD AREA + member functions
	
	public String toString() { //redefine it - override
		return "ACNO : "+accountNumber +"\nNAME : "+ accountHolder +"\nBAL : "+ accountBalance+"\n----------";
	}
	
	public void showBankAccount() {
		System.out.println("Account Number  : "+accountNumber);
		System.out.println("Account Holder  : "+accountHolder);
		System.out.println("Account Balance : "+accountBalance);
		System.out.println("---------------------");
	}
	
	BankAccount() {
		System.out.println("BankAccount() constructor...." );
	}
	
	public BankAccount(int x, String y, double z) {
		System.out.println("BankAccount(int,String,double)....constuctor...");
		accountNumber = x;
		accountHolder = y;
		accountBalance = z;
	}
	
	public void setBankAccount(int x, String y, double z) {
		System.out.println("setBankAccount(int,String,double)....");
		accountNumber = x;
		accountHolder = y;
		accountBalance = z;
	}
	
	public void withdraw(double amountToWithdraw) { //2nd 
		System.out.println(accountHolder+" is Withdrawing....."+amountToWithdraw);
		if(amountToWithdraw < 0 ) {
			RuntimeException rte = new RuntimeException("Withdraw amount cannot be in negative...");
			throw rte;
		}
		
		if(amountToWithdraw > accountBalance) {
			RuntimeException rte = new RuntimeException("Cannot withdraw...insufficient balance...");
			throw rte;
		}
		else 
			accountBalance = accountBalance - amountToWithdraw;
	}
	
	public void deposit(double amountToDeposit) { //2nd 
		System.out.println(accountHolder+" is Depositing....."+amountToDeposit);
		accountBalance = accountBalance + amountToDeposit;
	}
	public void transfer(double amountToTransfer) {
		System.out.println(accountHolder+" transferring amount "+amountToTransfer);
		// .... the logic to transfer here... 
	}
	
}
