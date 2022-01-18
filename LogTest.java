import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;

public class LogTest {
	public static void main(String[] args) {
		
		//Lets create few logs
		
		PhoneLog phLog1 = new PhoneLog("Ravi","Recieved",LocalDateTime.of(2022,1,18,17,20,45));
		PhoneLog phLog2 = new PhoneLog("Ruhi","Dialled",LocalDateTime.of(2022,1,19,18,40,15));
		PhoneLog phLog3 = new PhoneLog("Minal","Recieved",LocalDateTime.of(2022,1,19,10,30,25));
		PhoneLog phLog4 = new PhoneLog("Darshana","Missed",LocalDateTime.of(2022,1,20,11,10,35));
		PhoneLog phLog5 = new PhoneLog("Isha","Recieved",LocalDateTime.of(2022,1,21,11,30,45));
		PhoneLog phLog6 = new PhoneLog("Akshay","Dialled",LocalDateTime.of(2022,1,22,12,10,55));
		PhoneLog phLog7 = new PhoneLog("Rushkesh","Recieved",LocalDateTime.of(2022,1,15,13,15,35));
		PhoneLog phLog8 = new PhoneLog("Vinay","Missed",LocalDateTime.of(2022,1,14,15,45,15));
		System.out.println("Content [Log] is ready...");	
		
		ArrayList<PhoneLog> logList = new ArrayList<PhoneLog>();
		System.out.println("Container is also ready...");
		
		System.out.println("Adding the content....");
		logList.add(phLog1);
		logList.add(phLog2);
		logList.add(phLog3);
		logList.add(phLog4);
		logList.add(phLog5);
		logList.add(phLog6);
		logList.add(phLog7);
		logList.add(phLog8);
		System.out.println("Content is added.....");
		
		
		Iterator<PhoneLog> phoneLogIter = logList.iterator();
		
		while(phoneLogIter.hasNext()) {
			PhoneLog theLog = phoneLogIter.next();
			System.out.println("Log is : "+theLog);
		}
		
		
	}
}

class PhoneLog
{
	String message;  
	String logType; //missed,dialled, recieved
	LocalDateTime logDateTime;
	
	public PhoneLog(String message, String logType, LocalDateTime logDateTime) {
		super();
		this.message = message;
		this.logType = logType;
		this.logDateTime = logDateTime;
	}
	@Override
	public String toString() {
		return "PhoneLog [message=" + message + ", logType=" + logType + ", logDateTime=" + logDateTime + "]";
	}
	
	
	
}
