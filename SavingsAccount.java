package bank;

import java.io.Serializable;

public class SavingsAccount implements Serializable //marker interfaces 
{
	private int accountNumber;
	private String accountHolder;
	private double accountBalance;
	private transient int accountPinNumber; // can never be serialized
	private static float interestRate; //being shared data, cannot be serialized
	
	public SavingsAccount(int accountNumber, String accountHolder, double accountBalance, int accountPinNumber) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
		this.accountPinNumber = accountPinNumber;
	}

	@Override
	public String toString() {
		return "SavingsAccount [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder
				+ ", accountBalance=" + accountBalance + "]";
	}
	
	
}
