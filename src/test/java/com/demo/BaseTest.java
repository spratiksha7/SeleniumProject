package com.demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
	WebDriver driver;
	 @Parameters("BrowserName")
	 @BeforeClass
	 public void OpenBrowser(String BrowserName)
	 {
		 if(BrowserName.equals("Firefox"))
		 {
			 driver=new FirefoxDriver();//here Webdriver alredy glbally decalred
		 }
		 else if(BrowserName.equals("chrome"))
		 {
			 driver=new ChromeDriver();
			 }
		 else
		 {
			 driver=new EdgeDriver();
		 }
	 }
@BeforeMethod
public void openApp()
{
	driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}

@AfterClass
public void closebrowser()
{
	driver.close();
}
	

}

