import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateTestWithException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			//1. load the driver
			System.out.println("Trying to load the driver...");
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver is loaded...");
			
			//2 acquire the connection
			System.out.println("Trying to connect to the db");
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb", "SA", "");
			System.out.println("Connected to the dB");
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter existing deptno : ");
			int newDeptNo = scan.nextInt();

			Scanner scan1 = new Scanner(System.in);
			System.out.println("Enter new dept name : ");
			String newDeptName = scan.next();

			Scanner scan2 = new Scanner(System.in);
			System.out.println("Enter new dept loc : ");
			String newDeptLoc = scan.next();

			Statement st = conn.createStatement();
			ResultSet result = st.executeQuery("select * from dept_neova where deptno="+newDeptNo);
			
			if(result.next()) { //if the record found - then modify it
				System.out.println("Trying to create a PreparedStatement");
				PreparedStatement pst = conn.prepareStatement("update dept_neova set deptname=?, deptloc=? where deptno=?");
				
				pst.setString(1,newDeptName);
				pst.setString(2, newDeptLoc);
				pst.setInt(3, newDeptNo); 
				
				System.out.println("PreparedStatement made");
				
				int rows  = pst.executeUpdate(); //auto commit on
				
				System.out.println("Rows updated : "+rows);
				pst.close();
				conn.close();
			}
			else {
			
				DepartmentNotFoundException deptNotFoundEx  = new DepartmentNotFoundException("Department NOT found : "+newDeptNo);
				throw deptNotFoundEx;
			}
			
		}
		catch(SQLException e) {
			System.out.println("SQL Exception : "+e);
		}		
		catch(Exception e) {
			System.out.println("Exception : "+e);
		}
		
	}

}
