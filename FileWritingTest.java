import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileWritingTest {
	public static void main(String[] args) {
		
		
		try {
			FileOutputStream fout = new FileOutputStream("princess.txt",true);
			System.out.println("file is created");
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("enter data : ");
			
			String str="";
			String data= "";
			while(!str.equals("EOF"))
			{
				str = scan.nextLine();
				data = data + str;
				
			}
			
			System.err.println("data is ready to be added to the file..");
			
			byte barry[]= data.getBytes();
			
			fout.write(barry);
			System.out.println("data is written...");
			
			fout.close();
			System.out.println("file is closed..");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
