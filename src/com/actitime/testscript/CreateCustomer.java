package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.Filelib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)

public class CreateCustomer extends BaseClass{
	@Test
	public void createCus() throws EncryptedDocumentException, IOException, InterruptedException {
		Reporter.log("CREATE CUSTOMER");
		/*Filelib f=new Filelib();
		String customername = f.getExcelData("CreateCustomer", 1, 2);
		String customerdesp = f.getExcelData("CreateCustomer", 1, 3);
		HomePage h=new HomePage();
		h.setTask();
		TaskPage t=new TaskPage(driver);
		t.getAddbtn().click();
		t.getCreatecu().click();
		t.getEntcusname().sendKeys(customername);
		t.getCudesc().sendKeys(customerdesp);
		t.getSelectcus().click();
		t.getOurcom().click();
		t.getCreatecus().click();
		Thread.sleep(5000);
		String actuatext = t.getActualcustomer().getText();
		
		Assert.assertEquals(actuatext, customername);*/
		
	}

	
}
