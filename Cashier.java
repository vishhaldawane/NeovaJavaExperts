
public class Cashier  {
	void dispenseCash(
			BankAccount ref,
			float amt) {
		System.out.println("Cashier is dispensing cash..."+amt);
		ref.withdraw(amt);
	}
}
