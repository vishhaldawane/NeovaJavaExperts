
public class SyncTest {
	public static void main(String[] args) {
		System.out.println("Begin main");
		
		BankAccount baObj = new BankAccount(101,"Ruhi",50000);
		System.out.println("BEFORE : baObj : "+baObj);
		
		Teller teller1 = new Teller("Afsana",baObj,7000);
		//teller1.depositTheCash(baObj, 7000);
		
		Teller teller2 = new Teller("\tRuksana",baObj,8000);
		//teller2.depositTheCash(baObj, 8000);
		
		Teller teller3 = new Teller("\t\tSultana",baObj,5000);
		
		teller1.start();
		teller2.start();
		teller3.start();
		
		//teller3.depositTheCash(baObj, 5000);
		
		
		/*baObj.deposit(7000); //100 -> 70 notes
		System.out.println("baObj : "+baObj);
		
		baObj.deposit(8000); //2000 rs -> 4 notes
		System.out.println("baObj : "+baObj);
		
		baObj.deposit(5000); // 50 rs -> 100 notes
		System.out.println("baObj : "+baObj);
		*/
		
		try {
			teller1.join();
			teller2.join();
			teller3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("AFTER : baObj "+baObj);
		System.out.println("End main");
	}
}

class Teller extends Thread //I.a
{
	BankAccount baReference;
	double amountToBeDeposited;
	String tellerName;
	
	Teller(String tn, BankAccount baRef, double howMuchCash) {
		tellerName=tn;
		baReference = baRef;
		amountToBeDeposited = howMuchCash;
	}
	
	/*void depositTheCash(BankAccount baRef, double howMuchCash) {
		System.out.println("Teller is depositing cash...");
		baRef.deposit(howMuchCash);
		System.out.println("----------");
	}*/
	
	public void run() { //I.b
		//System.out.println(tellerName+" Teller is  depositing cash...");
		baReference.deposit(tellerName,amountToBeDeposited);
		//System.out.println(tellerName+" Teller has deposited cash...");
		//System.out.println();
	}
}

class BankAccount
{
	private int accountNumber;
	private String accountHolder;
	private double accountBalance;
	
	public BankAccount(int accountNumber, String accountHolder, double accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
	}
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder + ", accountBalance="
				+ accountBalance + "]";
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	private double getAccountBalance() { //CAN BE A SELECT QUERY TO THE DB
		return accountBalance; //MIGHT BE A DB CODE HERE
	}
	private void setAccountBalance(double accountBalance) {//CAN BE AN UPDATE QUERY TO THE DB
		this.accountBalance = accountBalance; //MIGHT BE A DB CODE HERE
	}
	
	public synchronized void deposit(String tn, double amountToDeposit) {
		System.out.println(tn+" Teller is  depositing cash...");

		System.out.println(tn+" Depositing....."+amountToDeposit);
		//BELOW LINE IS TO FETCH DATA FORM THE DB
		System.out.println(tn+" Fetching the balance...");
		this.accountBalance = getAccountBalance();
		
		//NOW CALCULATE THE NEW BALANCE - COUNT THE CASH
		System.out.println(tn+" Counting the cash...");
		double newAccountBalance = this.accountBalance + amountToDeposit;
		
		//BELOW LINE IS TO SET THE DATA TO THE DB
		System.out.println(tn+" Setting the balance...");
		setAccountBalance(newAccountBalance);
		
		System.out.println(tn+" Teller has deposited cash...");
		System.out.println();

	}
	
}
