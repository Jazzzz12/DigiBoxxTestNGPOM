package com.digiboxx.testcases;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.digiboxx.base.TestBase;

import com.digiboxx.page.HomePage;
import com.digiboxx.page.LoginPage;
import com.digiboxx.page.UploadFile;
import com.digiboxx.util.TestUtil;

public class HomePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homepage;
	TestUtil testutil;
	UploadFile uploadfile;
	
	public HomePageTest(){
		super();
	}
	
	
	@BeforeMethod
	public void SetUP() {
		initialization();
		testutil = new TestUtil();
		loginPage = new LoginPage();
		uploadfile = new UploadFile();
		homepage = loginPage.loginTest(prop.getProperty("workspace"), prop.getProperty("Username"), prop.getProperty("Password"));
		
	
	}
	@Test(priority = 1)
	public void  VerifyQuickAccess() {
		homepage.clickOnQuickAccess();
	}
	@Test(priority = 2)
	public void VerifyStarred() {
		
		homepage.ClickOnStarred();
	}
	
	@Test(priority = 3)
	public void VerifyShared() {
		
		homepage.ClickOnShared();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
