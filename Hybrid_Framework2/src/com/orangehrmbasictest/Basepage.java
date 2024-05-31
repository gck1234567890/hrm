package com.orangehrmbasictest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.orangehrmpageobjects.Addemp;
import com.orangehrmpageobjects.Homepage;
import com.orangehrmpageobjects.Loginpage;

public class Basepage implements Frameworkconstants{
public WebDriver driver;
Properties pro;
FileInputStream fis;
Loginpage lp;
public Homepage hp;
public  Addemp pim; 
@BeforeClass
public void open() throws IOException
{
	  
	System.setProperty(chrome_key, chrome_value);
	driver= new ChromeDriver();
	pro=new Properties();
     fis= new FileInputStream("./Test_property/Testdata.properties");
    pro.load(fis);
    driver.get(pro.getProperty("url"));
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    pim = new Addemp(driver);
    
  
}
@BeforeMethod

public void Login()
{
	lp=new Loginpage(driver);
    lp.EnterUsn().sendKeys(pro.getProperty("usn1"));
    lp.Enterpsw().sendKeys(pro.getProperty("psw1"));
    lp.ClkLgn().click();
    
   
	}

@AfterMethod
public void logout() throws InterruptedException
{
	 
//	hp=new Homepage(driver);
//	hp.clickdd().click();
//	 hp.logout().click();
	  
	
	  
}

@AfterClass
public void closebrowser()
{
	//driver.close();
}
}
