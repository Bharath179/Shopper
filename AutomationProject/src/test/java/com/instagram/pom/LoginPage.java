package com.instagram.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(name="username")
	private WebElement usernameTextfield;
	
	@FindBy(name="password")
	private WebElement passwordTextfield;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginBtn;
	
	@FindBy(xpath="//div[text()='Not now']")
	private WebElement notnow;
	
	@FindBy(xpath="//button[text()='Not Now']")
	private WebElement notnow1;
	
	@FindBy(linkText = "bharath_.reddys")
	private WebElement profile;
	
	@FindBy(xpath = "//div//span[text()='Messages']")
	private WebElement ClickonMessages;
	
	@FindBy(xpath = "//div//span[text()='Prabhakar reddy']")
	private WebElement selectPerson;
	
	@FindBy(xpath = "//div//div[@role='textbox']")
	private WebElement typeMessage;
	
	@FindBy(xpath = "//div[text()='Sen']")
	private WebElement sendMessage;
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setLogin(String un,String pw) {
		usernameTextfield.sendKeys(un);
		passwordTextfield.sendKeys(pw);
		loginBtn.click();
	}
	public WebElement getNotNow() {
		return notnow;
		
	}
	public WebElement getNotNow1() {
		return notnow1;	
	}
	public WebElement getProfile() {
		return profile;	
	}
	public WebElement getClickonMessages() {
		return ClickonMessages;	
	}
	public WebElement getPerson() {
		return selectPerson;	
	}
	public WebElement getTypemessage() {
		return typeMessage;	
	}
	public WebElement getMessage() {
		return sendMessage;	
	}
	
}

