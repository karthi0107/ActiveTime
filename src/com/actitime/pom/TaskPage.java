package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {


	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addbtn;

	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement createcu;

	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement entcusname;

	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement cudesc;

	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectcus;

	@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
	private WebElement ourcom;

	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createcus;

	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualcustomer;


	public TaskPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public WebElement getAddbtn() {
		return addbtn;
	}


	public WebElement getCreatecu() {
		return createcu;
	}


	public WebElement getEntcusname() {
		return entcusname;
	}


	public WebElement getCudesc() {
		return cudesc;
	}


	public WebElement getSelectcus() {
		return selectcus;
	}


	public WebElement getOurcom() {
		return ourcom;
	}


	public WebElement getCreatecus() {
		return createcus;
	}


	public WebElement getActualcustomer() {
		return actualcustomer;
	}

}