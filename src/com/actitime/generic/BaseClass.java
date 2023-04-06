package com.actitime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.actitime.pom.HomePage;
import com.actitime.pom.LogIn;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}

	public  WebDriver driver;
	public Filelib f=new Filelib();

	@Parameters("browser")
	@BeforeTest
	public void openBrowser(String browser) {
		Reporter.log("openbrowser",true);
		if(browser.equals("chrome")) {
		driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}

	@AfterTest
	public void logOut() {
		Reporter.log("closebrowser",true);
		driver.close();
	}
	
	@BeforeMethod
	public void lgin() throws IOException {
		Reporter.log("login",true);
		String url = f.getPropertyData("url");
		String un = f.getPropertyData("username");
		String pwd = f.getPropertyData("password");
		driver.get(url);
		LogIn l=new LogIn();
		l.setLogin(un, pwd);
		
	}
@AfterMethod
public void lgout() {
	Reporter.log("closebrowser",true);
	HomePage h=new HomePage();
	h.setLogout();
}
}
