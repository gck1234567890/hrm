package com.orangehrmpageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage
{
	//declaration
		@FindBy(xpath="//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
		private WebElement dd;
		
		@FindBy(xpath="//a[.='Logout']")
		private WebElement logout;
		
		//initialization
		public Homepage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		//utilization
		public WebElement clickdd() throws InterruptedException
		{
			return dd;
		}
		
		public WebElement logout() throws InterruptedException
		{
			return logout;
		}
}
