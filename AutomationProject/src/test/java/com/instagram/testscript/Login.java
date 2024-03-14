package com.instagram.testscript;

import java.awt.AWTException;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.instagram.generic.BaseClass;
import com.instagram.pom.LoginPage;


@Listeners(com.instagram.generic.ListenerImplementation.class)
public class Login extends BaseClass {
	@Test
	public void verifyLogin() throws AWTException, InterruptedException {
		Reporter.log("verifyLogin",true);
		LoginPage l = new LoginPage(driver);
		l.getNotNow().click();
		Thread.sleep(2000);
		l.getNotNow1().click();
		Thread.sleep(2000);
		l.getProfile().click();
		Thread.sleep(2000);
		l.getClickonMessages().click();
		Thread.sleep(2000);
		l.getPerson().click();
		Thread.sleep(2000);
		l.getTypemessage().sendKeys("Hi");
		Thread.sleep(4000);
		l.getMessage().click();
	
		
	}

}
