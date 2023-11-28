package com.demo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test2 extends BaseTest {
	@Test
	public void banklogin()
	{
		driver.findElement(By.xpath(".//button[text()='Bank Manager Login']")).click();
		driver.findElement(By.xpath(".//button[@ng-class='btnClass1']")).click();
		driver.findElement(By.xpath(".//input[@placeholder='First Name']")).sendKeys("pratiksha");
		driver.findElement(By.xpath(".//input[@placeholder='Last Name']")).sendKeys("sasane");
		driver.findElement(By.xpath(".//input[@placeholder='Post Code']")).sendKeys("411028");
		driver.findElement(By.xpath(".//button[text()='Add Customer']")).click();
	}
	
	

}
