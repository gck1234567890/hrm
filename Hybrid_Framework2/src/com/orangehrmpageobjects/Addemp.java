package com.orangehrmpageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addemp {
	//declaration
			@FindBy(xpath="//span[.='PIM']")
			private WebElement pim;
			
			@FindBy(xpath="//a[.='Add Employee']")
			private WebElement addemp;
			
			@FindBy(name="firstName")
			private WebElement fn;
			
			@FindBy(name="middleName")
			private WebElement mn;
			
			@FindBy(name="lastName")
			private WebElement ln;
			
			@FindBy(xpath="//button[@type='submit']")
			private WebElement save;
			
	//initialization
			public Addemp(WebDriver driver)
			{
				PageFactory.initElements(driver,this);
			}
	
	//utilization
			public WebElement clickpim()
			{
		return	pim;
		
			}
			public WebElement addemp()
			{
				return addemp;
			}
			
			public WebElement firstname( )
			{
				return fn;
			}
			
			public WebElement middlename()
			{
				return mn;
			}
			public WebElement lastname()
			{
				return ln;			}
			
			public WebElement save()
			{
				return save;
			}


}
