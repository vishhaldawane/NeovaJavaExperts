import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {

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
			
			System.out.println("Trying to create a statement");
			Statement st = conn.createStatement();
			System.out.println("Statement made");
			
			ResultSet result = st.executeQuery("SELECT * FROM DEPT_NEOVA");
			
			while(result.next()) {
				int deptno = result.getInt(1); //let me be on mute, some noise here
				String dname = result.getString(2);
				String loc = result.getString(3);
				
				
				System.out.println("DEPT NO : "+deptno);
				System.out.println("DNAME   : "+dname);
				System.out.println("LOC     : "+loc);
				System.out.println("----------------------");
				
			}
			
			result.close();
			st.close();
			conn.close();
		}
		catch(SQLException e) {
			System.out.println("SQL Exception : "+e);
		}		
		catch(Exception e) {
			System.out.println("Exception : "+e);
		}
		
	}

}
