package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class ConnectToDataBase {
public static void main(String[] args) throws SQLException, InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","tiger@12");
	
	Statement stat = connection.createStatement();    //It is used to create the query
	
	String s="select username,password from orangehrm";
	
	ResultSet rs = stat.executeQuery(s);   //It is used to execute the query
	
	while(rs.next()) {
		String un = rs.getString("username");
		String pw = rs.getString("password");
		
		System.out.println(un);
		System.out.println(pw);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(pw);
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		
		
		
		String actualTitle="Swag Labs";
		
		String expectedTitle=driver.getTitle();
		
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		System.out.println("actualTitle:"+actualTitle);
		
		System.out.println("expectedTitle:"+expectedTitle);
		
		if(actualTitle.equals(expectedTitle)) {
			
			Reporter.log("Test case is passed");
		}else {
			Reporter.log("Test case is failed");
		}
		Thread.sleep(2000);
		//driver.navigate().back();
	}
	
	connection.close();
	System.out.println("program is executed");
	Thread.sleep(2000);
	driver.quit();
}
}

