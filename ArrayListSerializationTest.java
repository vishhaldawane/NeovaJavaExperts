import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import bank.SavingsAccount;

public class ArrayListSerializationTest {
	public static void main(String[] args) {
		
		
		SavingsAccount saObj1 = new SavingsAccount(101, "Ravi", 50000, 1234);
		SavingsAccount saObj2 = new SavingsAccount(102, "Ruhi", 60000, 1234);
		SavingsAccount saObj3 = new SavingsAccount(103, "Vinay", 70000, 1234);
		SavingsAccount saObj4 = new SavingsAccount(104, "Isha", 80000, 1234);
		SavingsAccount saObj5 = new SavingsAccount(105, "Darshana", 90000, 1234);
		
		ArrayList<SavingsAccount> accountBunch = new ArrayList<SavingsAccount>();
		
		System.out.println("Objects are ready....");
		
		accountBunch.add(saObj1);
		accountBunch.add(saObj2);
		accountBunch.add(saObj3);
		accountBunch.add(saObj4);
		accountBunch.add(saObj5);
		System.out.println("Objects are added to the list....");
		
		try {
			FileOutputStream fout = new FileOutputStream("bankdataManyArrayList.txt");
			System.out.println("File is ready...");
			
			//you can transport object from it
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			System.out.println("Object stream is ready...");
			
			System.out.println("Trying to serialize the ArrayList object...");
			oos.writeObject(accountBunch);//
			System.out.println("Object are serialized....");
			
			oos.close();
			fout.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
