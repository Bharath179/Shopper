package mysql;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//span[text()='Mobiles']")).click();
	WebElement mobiles = driver.findElement(By.xpath("//div[@id='container']"));
	Dimension count = mobiles.getSize();
	System.out.println(count);
	String text = mobiles.getText();
	System.out.println(text);
	driver.quit();
	
}
}
