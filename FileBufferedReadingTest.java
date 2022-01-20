import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class FileBufferedReadingTest {
	public static void main(String[] args) {
		
		
		try {
			System.out.println("Trying to open a file...");
			//FileInputStream fin = new FileInputStream("ThreadingNotes.txt");
			
			FileReader fin1 = new FileReader("princess2.txt");
			
			FileReader fin2 = new FileReader("princess2.txt");
			BufferedReader buff = new BufferedReader(fin2);
			
			
			System.out.println("Both the Files are ready for reading...");
			
			System.out.println("Trying to process the content....");
			
			Calendar cal = Calendar.getInstance();
			Date now = new Date(cal.getTimeInMillis());
					
			byte theLetter = (byte) fin1.read();
			while(theLetter != -1 ) {
		
				theLetter = (byte) fin1.read();
	
			}
			Calendar cal1 = Calendar.getInstance();
			Date then = new Date(cal1.getTimeInMillis());
			
			System.out.println("Reading without buffer : "+(then.getTime()-now.getTime())+ " ms");
			
			cal = Calendar.getInstance();
			now = new Date(cal.getTimeInMillis());
			theLetter = (byte) buff.read();
			while(theLetter != -1 ) {
		
				theLetter = (byte) buff.read();
	
			}
			cal1 = Calendar.getInstance();
			then = new Date(cal1.getTimeInMillis());
			System.out.println("Reading with buffer : "+(then.getTime()-now.getTime())+ " ms");
			
			
			
			fin1.close();
			fin2.close();
			buff.close();
			
			
			System.out.println("\n\nFile is closed....");
		} catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
			//MyFrame m = new MyFrame(e.getMessage());
			//m.setVisible(true);
			//JOptionPane.showMessageDialog(null, e.getMessage());
			//e.printStackTrace();
		} catch (IOException e) {
			
			//e.printStackTrace();
		}
		
	}
}
