import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import bank.SavingsAccount;

public class MultipleObjectsDeSerializationTest {
	public static void main(String[] args) {
		
		
		SavingsAccount saObj1 = null;
		SavingsAccount saObj2 = null;
		SavingsAccount saObj3 = null;
		SavingsAccount saObj4 = null;
		SavingsAccount saObj5 = null;
		
		System.out.println("Objects refs are ready....");
		
		try {
			FileInputStream fin = new FileInputStream("bankdataMany.txt");
			System.out.println("File is ready...");
			
			//you can transport object from it
			ObjectInputStream ois = new ObjectInputStream(fin);
			System.out.println("Object stream is ready...");
			
			System.out.println("Trying to de-serialize the object...");
			saObj1=(SavingsAccount) ois.readObject();
			saObj2=(SavingsAccount) ois.readObject();
			saObj3=(SavingsAccount) ois.readObject();
			saObj4=(SavingsAccount) ois.readObject();
			saObj5=(SavingsAccount) ois.readObject();
				
			System.out.println("Objects are serialized....");
			
			System.out.println("Object : "+saObj1);
			System.out.println("Object : "+saObj2);
			System.out.println("Object : "+saObj3);
			System.out.println("Object : "+saObj4);
			System.out.println("Object : "+saObj5);
						
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
