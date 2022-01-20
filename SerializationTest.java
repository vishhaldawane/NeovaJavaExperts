import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import bank.SavingsAccount;

public class SerializationTest {
	public static void main(String[] args) {
		
		
		SavingsAccount saObj = new SavingsAccount(101, "Ravi", 50000, 1234);
		System.out.println("Object is ready....");
		
		try {
			FileOutputStream fout = new FileOutputStream("bankdata.txt");
			System.out.println("File is ready...");
			
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			System.out.println("Object stream is ready...");
			
			System.out.println("Trying to serialize the object...");
			oos.writeObject(saObj);
			System.out.println("Object serialized....");
			
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
