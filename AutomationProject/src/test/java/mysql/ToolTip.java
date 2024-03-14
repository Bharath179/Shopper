package mysql;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://omayo.blogspot.com/");
	String tip = driver.findElement(By.xpath("//input[@type='submit']")).getAttribute("title");
	System.out.println(tip);
	driver.quit();
}
}
