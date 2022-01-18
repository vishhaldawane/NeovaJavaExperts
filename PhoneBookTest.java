import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
/*
 * PhoneLog 			=> ArrayList
 * PhoneContact 		=> LinkedList
 * ChemicalElement 		=> TreeSet <-- Comparable interface
 * Book  				=> HashSet <-- equals() and hashCode()
 * 
 * 
 */
public class PhoneBookTest {
	public static void main(String[] args) {
		
		//Lets create few logs
		
		PhoneContact contact1 = new PhoneContact("Ravi","9822556633","ravi@gmail.com");
		PhoneContact contact2 = new PhoneContact("Ruhi","8822556633","ruhi@gmail.com");
		PhoneContact contact3 = new PhoneContact("Minal","7722556633","minal@gmail.com");
		PhoneContact contact4 = new PhoneContact("Darshana","6622556633","darshana@gmail.com");
		PhoneContact contact5 = new PhoneContact("Isha","3322556633","isha@gmail.com");
		PhoneContact contact6 = new PhoneContact("Akshay","2222556633","akshay@gmail.com");
		PhoneContact contact7 = new PhoneContact("Rushikesh","1122556633","rushikesh@gmail.com");
		PhoneContact contact8 = new PhoneContact("Vinay","7722557633","vinay@gmail.com");
				
		System.out.println("Content [PhoneContact] is ready...");	
		
		LinkedList<PhoneContact> logList = new LinkedList<PhoneContact>();
		System.out.println("Container is also ready...");
		
		System.out.println("Adding the content....");
		logList.add(contact1);
		logList.add(contact2);
		logList.add(contact3);
		logList.add(contact4);
		logList.add(contact5);
		logList.add(contact6);
		logList.add(contact7);
		logList.add(contact8);
		
		
		System.out.println("Content is added.....");
		
		
		Iterator<PhoneContact> phoneLogIter = logList.iterator();
		
		while(phoneLogIter.hasNext()) {
			PhoneContact theLog = phoneLogIter.next();
			System.out.println("Contact is : "+theLog);
		}
		
		
	}
}

class PhoneContact
{
	String contactName;  
	String phoneNumber;
	String emailAddress;
	public PhoneContact(String contactName, String phoneNumber, String emailAddress) {
		super();
		this.contactName = contactName;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}
	@Override
	public String toString() {
		return "PhoneContact [contactName=" + contactName + ", phoneNumber=" + phoneNumber + ", emailAddress="
				+ emailAddress + "]";
	}
	
	
	
	
}
