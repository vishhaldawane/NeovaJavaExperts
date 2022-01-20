import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


class MyFrame2 extends JFrame implements ActionListener //1
{
	JLabel lbl1 = new JLabel("Enter filename");
	JLabel lbl2 = new JLabel("Enter filename data ");
	
	JTextArea jt = new JTextArea(5,10);
	JTextField filename = new JTextField(20);
	JButton ok = new JButton("SAVE");
	JButton clear = new JButton("Clear");
	
	MyFrame2() {
		setLocation(100,100);
		setSize(400,400);
		setTitle("MyNotepad");
		setLayout(new FlowLayout()); 
		add(lbl1); add(filename);
		add(lbl2); add(jt);
		add(ok);
		add(clear);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		ok.addActionListener(this); //3
		clear.addActionListener(this); //3
	}

	@Override
	public void actionPerformed(ActionEvent ae) { //2
		
		if(ae.getSource()==ok) {
			System.out.println("Save Button is clicked..."+ae.getSource());
		
			try {
				FileOutputStream fout = new FileOutputStream(filename.getText());
				String data = jt.getText();
				byte array[] = data.getBytes();
				fout.write(array);
				JOptionPane.showMessageDialog(this, "File is saved");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(this, e.getMessage());
				e.printStackTrace();
			}
			
			
		}
		else if(ae.getSource()==clear) {
			System.out.println("Clear Button is clicked..."+ae.getSource());
			
		}
	}
	
}
public class FileWritingTest2 {
	public static void main(String[] args) {
	
			MyFrame2 mfr = new MyFrame2();
			mfr.setVisible(true);
		
		
			
//			FileOutputStream fout = new FileOutputStream("/Users/apple/Minal/Queen.txt",true);
//			System.out.println("file is created");
//			
//			Scanner scan = new Scanner(System.in);
//			
//			System.out.println("enter data : ");
//			
//			String str="";
//			String data= "";
//			
//			str = scan.nextLine();
//			
//			while(!str.equals("EOF"))
//			{
//				data = data + str;
//				str = scan.nextLine();
//					
//			}
//			
//			System.err.println("data is ready to be added to the file..");
//			
//			byte barry[]= data.getBytes();
//			
//			fout.write(barry);
//			System.out.println("data is written...");
//			
//			fout.close();
//			System.out.println("file is closed..");

		
	}
}
