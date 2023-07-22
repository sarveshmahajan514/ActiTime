package com.actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement taskbtn;
	
	@FindBy(id="logoutLink")
	private WebElement logoutbtn;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setTaskBtn()
	{
		taskbtn.click();
	}
	
	public void setLogoutbtn()
	{
		logoutbtn.click();
	}
}
