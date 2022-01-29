import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class FunctionTest {

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
			
			CallableStatement cst = conn.prepareCall("? = call findEmpSalary(?,?,?)");
			
			cst.setInt(2, existingDeptNo);
			

			cst.registerOutParameter(1, Types.INTEGER);
			cst.registerOutParameter(3, Types.VARCHAR);
			cst.registerOutParameter(4, Types.VARCHAR);
			
			cst.execute(); // run the function;
			
			int netSal     = cst.getInt(1);
			String empName = cst.getString(3);
			String empJob  = cst.getString(4);
			
			System.out.println("EMP NAME : "+empName);
			System.out.println("EMP LOC  : "+empJob);
			System.out.println("EMP NET  : "+netSal);
			
			
			
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
 
 create table emp
  (
    empno number primary  key,
    ename varchar2(20),
    job  varchar2(20),
    sal number,
    comm number
   )
   
   insert into emp values ( 101,'Jack','Clerk',5000,200);
   insert into emp values ( 102,'Jane','Manager',7000,300);
   insert into emp values ( 103,'Julie','Steno',8000,500);
   insert into emp values ( 104,'Julia','Accountant',9000,300);
   
   commit;
   
   
  create or replace function findEmpSalary( eno IN number, e_name OUT varchar2, e_job OUT varchar2) return number
  as
     netsal number;
  begin
     select ename,job, sal+comm into e_name,e_job, netsal from emp where empno=eno; 
  	 return netsal; 
  	 exception
  	  when 
  	  	no_data_found then
  	 		e_name:=null;
  	 		e_job:=null;
  	 		
  end;
  / <- to run the script 
  
  --------
  
    
  how to call it at oracle prompt
  
  SQL> set serveroutput on
  SQL> declare
         x varchar2(20);
         y varchar2(20);
         n number;
       begin
       		n:=findEmpSalary(&no, x, y);
       		dbms_output.put_line(x);
       		dbms_output.put_line(y);
       		dbms_output.put_line(n);
       end;
       / <--- to run the script
         
        
       		
 */












