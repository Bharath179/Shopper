package mysql;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("http://127.0.0.1:8000/");
	WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
	Actions a=new Actions(driver);
	Thread.sleep(5000);
	a.moveToElement(loginBtn).build().perform();
	Thread.sleep(2000);
	driver.quit();

}
}
