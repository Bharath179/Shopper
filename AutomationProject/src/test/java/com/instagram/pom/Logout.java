package com.instagram.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

	@FindBy(xpath = "//div[@role='button']")
	private WebElement clickOnsettings;
	
	@FindBy(xpath = "//div[@class='_a9-z']/child::button[text()='Log out']")
	private WebElement clickOnlogout;
	
	public Logout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getSettings() {
		return clickOnsettings;
	}
	public WebElement getLogout() {
		return clickOnlogout;
	}
	public void setLogout() throws InterruptedException {
		clickOnsettings.click();
		Thread.sleep(2000);
		clickOnlogout.click();
		Thread.sleep(2000);
	}
}
