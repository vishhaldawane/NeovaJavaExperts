
public class PromotionDemotionTest {
	public static void main(String[] args) {
		BankAccount baRef;
		
		Savings sav = new Savings();
		
		Current curr = new Current();
		
		Credit cre = new Credit();
		
		sav.saveMoney();
		curr.overdraftMoney();
		cre.spendBeforeEarn();
		System.out.println("-----------");
		
		int n = 10;
		int d = 3;
		double i =  (double) n / d;
		System.out.println(" i "+i);
		
		baRef = cre; //it can point to curr or cre
		
		if(baRef instanceof Savings) {
			System.out.println("Yes baRef Pointing at Savings...");
			baRef.withdraw();
			Savings savRef = (Savings) baRef;
			savRef.saveMoney();
		}
		else if(baRef instanceof Current) {
			System.out.println("Yes baRef Pointing at Current..");
			baRef.withdraw();
			Current currRef = (Current) baRef;
			currRef.overdraftMoney();
		}
		else if(baRef instanceof Credit) {
			System.out.println("Yes baRef Pointing at Credit..");
			baRef.withdraw();
			Credit creRef = (Credit) baRef;
			creRef.spendBeforeEarn();
		}
	}
}

interface Banking
{
	void bank();
}

class BankAccount implements Banking
{
	public void bank() { //4. implemented
		System.out.println("banking....");
	}
	void withdraw() { // 1. exclusive <- inherited
		System.out.println("BankAccount withdraw()...");
	}
	void showBalance() { //1. exclusive <- inherited
		System.out.println("Showing balance...");
	}
}

class Savings extends BankAccount {
	void saveMoney() {
		System.out.println("Savings account saving money...");
	}
	void withdraw() { //inherited thats why overridden
		System.out.println("Savings withdraw()...");
	}
}

class Current extends BankAccount {
	void overdraftMoney() {
		System.out.println("Current account over draft money...");
	}
	void withdraw() { //overriding
		System.out.println("Current withdraw()...");
	}
}

class Credit extends BankAccount {
	void spendBeforeEarn() { //1. exclusive
		System.out.println("Spending money before earning...");
	}
	void withdraw() { //2. overriding
		System.out.println("Credit withdraw()...");
	}
}

