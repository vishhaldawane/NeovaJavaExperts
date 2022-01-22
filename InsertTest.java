import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {

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
			
			System.out.println("Trying to create a PreparedStatement");
			PreparedStatement pst = conn.prepareStatement("insert into dept_neova values (?,?,?)");
			pst.setInt(1, 70); //accept from scanner or JFrame
			pst.setString(2,"HR");
			pst.setString(3, "Delhi");
			
			System.out.println("PreparedStatement made");
			
			int rows  = pst.executeUpdate(); //auto commit on
			
			System.out.println("Rows inserted : "+rows);
			
			pst.close();
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
