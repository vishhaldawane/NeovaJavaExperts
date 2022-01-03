
public class ObjectCommunicationTest {
	public static void main(String[] args) {
	
		BankAccount bankObj1 = new BankAccount(101, "Jack",5000);
		BankAccount bankObj2 = new BankAccount(102, "Jane",6000);
		BankAccount bankObj3 = new BankAccount(103, "Julie",7000);
		
		
		Cashier cashier = new Cashier();
		
		cashier.dispenseCash(bankObj1,500);
		
		bankObj1.showBankAccount();
		
		cashier.dispenseCash(bankObj2,700);
		
		bankObj2.showBankAccount();
		
		cashier.dispenseCash(bankObj3,800);
		
		bankObj3.showBankAccount();
		
		
		
	/*	bankObj.showBankAccount();
		
		BankAccount bankRef = bankObj;
		
		bankRef.showBankAccount();
		
		BankAccount x = bankRef;
		
		x.showBankAccount();
		
		BankAccount y = x;
		
		y.showBankAccount();
		
		System.out.println("y       "+y.hashCode());
		System.out.println("x       "+x.hashCode());
		System.out.println("bankRef "+bankRef.hashCode());
		System.out.println("bankObj "+bankObj.hashCode());
		
		x.withdraw(500);
		
		y.showBankAccount();
		
		bankRef.deposit(900);
		
		bankObj.showBankAccount();*/
		
		
	}
}
