import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class ProcedureTest {

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
			System.out.println("Enter existing deptno to find  : ");
			int existingDeptNo = scan.nextInt();

			//first ? is the IN value
			//other 2 question marks are OUT values
			
			CallableStatement cst = conn.prepareCall("call findDeptDetails(?,?,?)");
			
			cst.setInt(1, existingDeptNo);
			
			cst.registerOutParameter(2, Types.VARCHAR);
			cst.registerOutParameter(3, Types.VARCHAR);
			
			cst.execute(); // run the procedure;
			
			String deptName = cst.getString(2);
			String deptLoc  = cst.getString(3);
			
			System.out.println("DEPT NAME : "+deptName);
			System.out.println("DEPT LOC  : "+deptLoc);
			
			
			
		}
		catch(SQLException e) {
			System.out.println("SQL Exception : "+e);
		}		
		catch(Exception e) {
			System.out.println("Exception : "+e);
		}
		
	}

}
/*
 
  create or replace procedure findDeptDetails( dno IN number, dname OUT varchar2, loc OUT varchar2)
  as
  begin
     select deptname,deptloc into dname,loc from dept_neova where deptno=dno;
  	 exception
  	  when 
  	  	no_data_found then
  	 		dname:=null;
  	 		loc:=null;
  end;
  / <- to run the script 
  
  --------
  how to call it at oracle prompt
  
  SQL> set serveroutput on
  SQL> declare
         x varchar2(20);
         y varchar2(20);
       begin
       		findDeptDetails(&no, x, y);
       		dbms_output.put_line(x);
       		dbms_output.put_line(y);
       end;
       / <--- to run the script
         
        
       		
 */












