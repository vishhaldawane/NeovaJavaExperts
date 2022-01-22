import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

import bank.SavingsAccount;

public class ArrayListDeSerializationTest {
	public static void main(String[] args) {
		
				
		ArrayList<SavingsAccount> accountBunch = new ArrayList<SavingsAccount>();
		
		System.out.println("Empty array list is ....");
		
		try {
			FileInputStream fin = new FileInputStream("bankdataManyArrayList.txt");
			System.out.println("File is ready...");
			
			//you can transport object from it
			ObjectInputStream ois = new ObjectInputStream(fin);
			System.out.println("Object stream is ready...");
			
			System.out.println("Trying to de-serialize the object...");
			accountBunch= (ArrayList<SavingsAccount>) ois.readObject();
					
			System.out.println("Objects are serialized....");
			
			Iterator <SavingsAccount> savIter = accountBunch.iterator();
			while(savIter.hasNext()) {
				SavingsAccount savObj = savIter.next();
				System.out.println("sav obj : "+savObj);
			}
						
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
