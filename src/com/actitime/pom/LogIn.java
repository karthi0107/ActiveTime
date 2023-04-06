package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {
	
	@FindBy(id="username")
	private WebElement untbx;

	@FindBy(name="pwd")
	private WebElement ptbx;
	 
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgbt;
	
	public void Login(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
	}
	
	public void setLogin(String un,String pwd) {
		untbx.sendKeys(un);
		ptbx.sendKeys(pwd);
		lgbt.click();
	}
	
	
	
	
	
}
