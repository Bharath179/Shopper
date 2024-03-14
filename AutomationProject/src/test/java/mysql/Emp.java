package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Emp {
public static void main(String[] args) throws SQLException {
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","tiger@12");
	Statement stmt = con.createStatement();
	//String s="create table dept(DEPTNO INT,DNAME VARCHAR(45),LOC VARCHAR(20))";
	//stmt.executeUpdate(s);
	
	
	/*String s1="Insert into Emp values(7369,'SMITH','CLERK',7902,'17-DEC-80',800,NULL,20)";
	stmt.execute(s1);
	
	String s2="Insert into Emp values(7499,'ALLEN','SALESMAN',7698,'20-FEB-81',1600,300,30)";
	stmt.execute(s2);
	
	String s3="Insert into Emp values(7521,'WARD','SALESMAN',7698,'22-FEB-81',1250,500,30)";
	stmt.execute(s3);
	
	String s4="Insert into Emp values(7566,'JONES','MANAGER',7839,'02-APR-81',2975,NULL,20)";
	stmt.execute(s4);
	
	String s5="Insert into Emp values(7654,'MARTIN','SALESMAN',7698,'28-SEP-81',1250,NULL,30)";
	stmt.execute(s5);
	
	String s6="Insert into Emp values(7698,'BLAKE','MANAGER',7839,'01-MAY-81',2850,NULL,30)";
	stmt.execute(s6);
	
	String s7="Insert into Emp values(7782,'CLARK','MANAGER',7839,'09-JUN-81',2450,NULL,10)";
	stmt.execute(s7);
	
	String s8="Insert into Emp values(7788,'SCOTT','ANALYST',7566,'19-APR-87',3000,NULL,20)";
	stmt.execute(s8);
	
	String s9="Insert into Emp values(7839,'KING','PRESIDENT',NULL,'17-NOV-81',5000,NULL,10)";
	stmt.execute(s9);
	
	String s10="Insert into Emp values(7844,'TURNER','SALESMAN',7698,'08-SEP-81',1500,0,30)";
	stmt.execute(s10);
	
	String s11="Insert into Emp values(7876,'ADAMS','CLERK',7788,'23-MAY-87',1100,NULL,20)";
	stmt.execute(s11);
	
	String s12="Insert into Emp values(7900,'JAMES','CLERK',7698,'03-DEC-81',950,NULL,30)";
	stmt.execute(s12);
	
	String s13="Insert into Emp values(7902,'FORD','ANALYST',7566,'17-DEC-81',3000,NULL,20)";
	stmt.execute(s13);
	
	String s14="Insert into Emp values(7934,'MILLER','CLERK',7782,'23-JAN-80',1300,NULL,10)";
	stmt.execute(s14);*/
	
	//String s="Update emp set hiredate='23-JAN-80' where ename='MILLER'";
	//stmt.execute(s);
			
	/*String d1="Insert into dept values(10,'ACCOUNTING','NEW YORK')";
	stmt.execute(d1);
	
	String d2="Insert into dept values(20,'RESEARCH','DALLAS')";
	stmt.execute(d2);
	
	String d3="Insert into dept values(30,'SALES','CHICAGO')";
	stmt.execute(d3);
	
	String d4="Insert into dept values(40,'OPERATIONS','BOSTON')";
	stmt.execute(d4);*/
	
	String s1="(select hiredate from emp where hiredate>(select hiredate from emp where ename='miller'))";
	ResultSet rs = stmt.executeQuery(s1);
	
	while(rs.next()) {
		String name = rs.getString("hiredate");
		System.out.println(name);
	}
	con.close();
	System.out.println("Table is created");
}
}
