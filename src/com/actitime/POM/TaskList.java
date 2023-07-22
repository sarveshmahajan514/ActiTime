package com.actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskList 
{
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnewbtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newcust;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement custname;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement custdesc;
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectcust;
	
	@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
	private WebElement ourcomp;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createcust;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement actual;
	
	public TaskList(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddnewbtn() 
	{
		return addnewbtn;
	}

	public WebElement getNewcust() 
	{
		return newcust;
	}

	public WebElement getCustname() 
	{
		return custname;
	}

	public WebElement getCustdesc() 
	{
		return custdesc;
	}

	public WebElement getSelectcust() 
	{
		return selectcust;
	}

	public WebElement getOurcomp() 
	{
		return ourcomp;
	}
	
	public WebElement getCreateCust() 
	{
		return createcust;
	}
	
	public WebElement getActual() 
	{
		return actual;
	}
}
