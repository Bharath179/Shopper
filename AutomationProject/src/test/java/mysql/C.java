package mysql;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.findElement(By.xpath("//span[text()='Appliances']")).click();
	List<WebElement> mobiles = driver.findElements(By.xpath("//div[@class='_37K3-p']"));
	int count = mobiles.size();
	System.out.println(count);
	for (WebElement ele : mobiles) {
		String text = ele.getText();
		System.out.println(text);
		
	}
	driver.quit();
}
}
