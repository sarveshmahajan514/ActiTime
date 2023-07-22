package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.POM.HomePage;
import com.actitime.POM.TaskList;
import com.actitime.generics.BaseClass;
import com.actitime.generics.FileLib;

@Listeners(com.actitime.generics.ListnerImplementation.class)
public class CreateCustomerMain extends BaseClass
{
	@Test
	public void createCustomer() throws EncryptedDocumentException, IOException, InterruptedException
	{
		HomePage h=new HomePage(driver);
		h.setTaskBtn();
		
		TaskList t=new TaskList(driver);
		t.getAddnewbtn().click();
		t.getNewcust().click();
		
		FileLib l=new FileLib();
		String cn = l.getExcelData("CreateCustomer", 1, 2);
		String cd = l.getExcelData("CreateCustomer", 1, 3);
		
		t.getCustname().sendKeys(cn);
		t.getCustdesc().sendKeys(cd);
		t.getSelectcust().click();
		t.getOurcomp().click();
		t.getCreateCust().click();
		
		Thread.sleep(4000);
		
		String actual = t.getActual().getText();
		
		Assert.assertEquals(actual, cn);
	}
}
