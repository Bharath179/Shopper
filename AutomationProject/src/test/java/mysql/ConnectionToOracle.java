package mysql;
import java.sql.*;

public class ConnectionToOracle {
public static void main(String[] args) {
	try {
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","tiger@12");
	Statement stmt = connection.createStatement();
	//String s="create table employee(id int,name varchar(45),location varchar(45))";
	
	/*String s1="Insert into employee values(001,'MSDhoni',30000,'Ranchi')";
	String s2="Insert into employee values(001,'SureshRaina',30000,'Muradnagar')";
	String s3="Insert into employee values(001,'YurajSingh',30000,'Chandigarh')";
	String s4="Insert into employee values(001,'ABD',30000,'SouthAfrica')";
	stmt.execute(s1);
	stmt.execute(s2);
	stmt.execute(s3);
	stmt.execute(s4);*/
	
	String u1="Update employee set salary=25000 where name='SureshRaina'";
	stmt.execute(u1);
	
	String u2="Update employee set salary=24000 where name='YurajSingh'";
	stmt.execute(u2);
	
	String u3="Update employee set salary=23000 where name='ABD'";
	stmt.execute(u3);
	
	String id="Update employee set id=002 where name='SureshRaina'";
	stmt.execute(id);
	
	String id1="Update employee set id=003 where name='YurajSingh'";
	stmt.execute(id1);
	
	String id2="Update employee set id=004 where name='ABD'";
	stmt.execute(id2);
	
	String s1="Insert into employee values(005,'Maxwel',20000,'Australia')";
	stmt.execute(s1);
	
	String s="Delete from employee where name='Maxwel'";
	stmt.execute(s);
	
	
	//stmt.executeUpdate(s);
	connection.close();
	System.out.println("Table Created Successfully");
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}

