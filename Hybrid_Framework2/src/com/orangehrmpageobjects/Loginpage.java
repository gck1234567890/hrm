package com.orangehrmpageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
	//declaration
	@FindBy(name="username")
	private WebElement usn;
	
	@FindBy(name="password")
	private WebElement pwd;
	
	@FindBy(tagName="button")
	private WebElement lgn;
	
	//initialization
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	
	public WebElement EnterUsn()
	{
		return usn;
	}
	
	public WebElement Enterpsw()
	{
		return pwd;
	}
	
	public WebElement ClkLgn()
	{
		return lgn;
	}
	}

	

