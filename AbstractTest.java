
public class AbstractTest {
	public static void main(String[] args) {
		
	//	BankAccount baObj = new BankAccount();
	
		SavingsAccount saObj = new SavingsAccount(101,"Julie",5000,3.5f);
		saObj.showBankAccount();
		saObj.withdraw(500);
		saObj.showBankAccount();
		saObj.deposit(900);
		saObj.showBankAccount();
		
	}
}

//Abstraction = hide the complexity - provide the simple usage

//abstract = incomplete

//abstract images painted by an artist
//		|
//	----------------------
//	|		|	|		|
//Cloud	Forest  God   Face 

abstract class Mammal
{
	
}
class Tiger extends Mammal
{
	
}

abstract class God
{
	//may not have abstract method
}

abstract class Angel extends God
{
//The abstract method boon in type Angel can only be defined by an abstract class
	abstract void boon();
}

//The type Michael must implement the inherited abstract method Angel.boon()
class Michael extends Angel
{
	void boon() { 
		
	}
}

abstract class BankAccount // meant for inheritance
{
	private int accountNumber;
	private String accountHolder;
	protected double accountBalance;
	
	//mandate to be developed by the immediate non-abstract child class
	abstract void withdraw(double amountToWithdraw); //no body
	abstract void deposit(double amountToDeposit); //no body
	
	public BankAccount(int accountNumber, String accountHolder, double accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
	}

	void showBankAccount() {
		
		System.out.println("AC NO      : "+accountNumber);
		System.out.println("AC HOLDER  : "+accountHolder);
		System.out.println("AC BALANCE : "+accountBalance);
		
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
}

class SavingsAccount extends BankAccount //isA
{
	private float rateOfInterest;

	public SavingsAccount(int accountNumber, String accountHolder, double accountBalance, float rateOfInterest) {
		super(accountNumber, accountHolder, accountBalance);
		this.rateOfInterest = rateOfInterest;
	}
	
	void showBankAccount() {
		super.showBankAccount();
		System.out.println("AC RATE    : "+rateOfInterest);
	}

	@Override
	void withdraw(double amountToWithdraw) {
		System.out.println("withdrawing....");
		accountBalance = accountBalance - amountToWithdraw;
		//setAccountBalance( getAccountBalance() - amountToWithdraw);
		
	}

	@Override
	void deposit(double amountToDeposit) {
		System.out.println("Depositing....");
		accountBalance = accountBalance + amountToDeposit;
		//setAccountBalance( getAccountBalance() + amountToDeposit);
	}
}

/*
class CurrentAccount extends BankAccount
{

	@Override
	void withdraw(double amountToWithdraw) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void deposit(double amountToDeposit) {
		// TODO Auto-generated method stub
		
	}
	
}
class CreditAccount extends BankAccount
{

	@Override
	void withdraw(double amountToWithdraw) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void deposit(double amountToDeposit) {
		// TODO Auto-generated method stub
		
	}
	
}*/