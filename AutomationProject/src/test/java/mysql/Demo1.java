package mysql;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://127.0.0.1:8000/home");
	driver.findElement(By.name("username")).sendKeys("bharath");
	driver.findElement(By.name("password")).sendKeys("12345");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.linkText("Company")).click();
	driver.findElement(By.xpath("//input[@type='search']")).sendKeys("accetion");
	driver.findElement(By.id("button")).click();
	String data = driver.findElement(By.id("tab")).getText();
	System.out.println(data);
}
}
