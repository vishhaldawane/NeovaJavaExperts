import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import bank.SavingsAccount;

public class DeSerializationTest {
	public static void main(String[] args) {
		
		
		SavingsAccount saObj = null;
		
		System.out.println("Object ref is ready....");
		
		try {
			FileInputStream fin = new FileInputStream("bankdata.txt");
			System.out.println("File is ready.for reading..");
			
			//you can transport object from it
			ObjectInputStream ois = new ObjectInputStream(fin);
			System.out.println("Object stream is ready...");
			
			System.out.println("Trying to de-serialize the object...");
			saObj = (SavingsAccount) ois.readObject();
			System.out.println("Object de-serialized....");
			
			System.out.println("saObj : "+saObj );
			
			ois.close();
			fin.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
