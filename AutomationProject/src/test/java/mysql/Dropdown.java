package mysql;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	WebElement dropdown = driver.findElement(By.xpath("//select[@id='month']"));
	Select s=new Select(dropdown);
	List<WebElement> allOpt = s.getOptions();
	int count = allOpt.size();
	System.out.println(count);
	for(int i=0;i<count;i++) {
		String text = allOpt.get(i).getText();
		System.out.println(text);
		
	}
	driver.quit();
}
}
