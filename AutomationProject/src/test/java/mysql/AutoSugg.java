package mysql;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugg {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.google.com");
	driver.switchTo().activeElement().sendKeys("Iphone");
	List<WebElement> sugg = driver.findElements(By.xpath("//span[contains(.,'iPhone')]"));
	for (WebElement autosugg : sugg) {
		String text = autosugg.getText();
		System.out.println(text);
	}
	driver.quit();
}
}
