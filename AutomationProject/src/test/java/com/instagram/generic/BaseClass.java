package com.instagram.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.instagram.pom.LoginPage;
import com.instagram.pom.Logout;

public class BaseClass {
public static WebDriver driver;

@BeforeClass
public void openBrowser() {
	Reporter.log("openBrowser"+true);
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@BeforeMethod
public void login() throws IOException {
	Reporter.log("login",true);
	FileLib f=new FileLib();
	String url = f.getPropertyData("url");
	String un = f.getPropertyData("username");
	String pw = f.getPropertyData("password");
	driver.get(url);
	LoginPage lp=new LoginPage(driver);
	lp.setLogin(un, pw);	
}
@AfterClass
public void closeBrowser() {
	Reporter.log("closeBrowser",true);
	driver.quit();
}

@AfterMethod
public void logout() {
	Reporter.log("logout",true);
	Logout l = new Logout(driver);
	l.getLogout();
}


}
