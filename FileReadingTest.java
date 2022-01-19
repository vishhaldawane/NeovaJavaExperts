import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class MyFrame extends JFrame {
	JTextField t = new JTextField();
	
	MyFrame(String msg) {
		t.setText(msg);
		add(t);
		setSize(100,100);
		
	}
}
public class FileReadingTest {
	public static void main(String[] args) {
		
		
		try {
			System.out.println("Trying to open a file...");
			FileInputStream fin = new FileInputStream("ThreadingNotes.txt");
			System.out.println("File is ready for reading...");
			
			System.out.println("Trying to print the content....");
			
			byte theLetter = (byte) fin.read();
			while(theLetter != -1 ) {
				
				System.out.print((char)theLetter);
				theLetter = (byte) fin.read();
				
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			
			fin.close();
			
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
