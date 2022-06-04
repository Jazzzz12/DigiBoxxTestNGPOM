package com.digiboxx.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.digiboxx.base.TestBase;
import com.digiboxx.page.HomePage;
import com.digiboxx.page.LoginPage;

import junit.framework.Assert;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homepage;
	
	public LoginPageTest(){
		super();
	}
	
	
	@BeforeMethod
	public void SetUP() {
		initialization();
		loginPage = new LoginPage();
	
	}
	
	@Test(priority = 2)
	public void DigiBoxxLogoTest() {
		boolean Boxx = loginPage.validateDigiBoxxlogo();
		Assert.assertTrue(Boxx);
	}
	
	

 
 @Test(priority = 1)
 public void loginTest() {
	homepage = loginPage.loginTest(prop.getProperty("workspace"), prop.getProperty("Username"), prop.getProperty("Password"));
	 
	 
	 

			 
//	WebElement Digispace = driver.findElement(By.xpath("//input[@id='workspace']"));
//	Digispace.sendKeys("intern 3");
//	 driver.findElement(By.xpath("//input[@id='Username']")).sendKeys("testing2510932@gmail.com");
//	 driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Gaurav@123");
//	 driver.findElement(By.xpath("//button[contains(text(),'Login Now')]")).click();
//	 driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
//	

 }
 
	
@AfterMethod
public void tearDown() {
	driver.quit();
}
}
