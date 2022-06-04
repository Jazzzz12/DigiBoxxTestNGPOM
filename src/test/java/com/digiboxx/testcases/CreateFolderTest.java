package com.digiboxx.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.digiboxx.base.TestBase;
import com.digiboxx.page.CreateFolderPage;
import com.digiboxx.page.HomePage;
import com.digiboxx.page.LoginPage;
import com.digiboxx.page.UploadFile;


public class CreateFolderTest extends TestBase {
	
	CreateFolderPage createfolderpage;
	LoginPage loginPage;
	HomePage homepage;

	
	public CreateFolderTest(){
		super();
	}
	
	
	@BeforeMethod
	public void SetUP() {
		initialization();
		createfolderpage = new CreateFolderPage();
		loginPage = new LoginPage();
		homepage = loginPage.loginTest(prop.getProperty("workspace"), prop.getProperty("Username"), prop.getProperty("Password"));
		
	}
	
	@Test
	public void VerifyCreateFolder() throws Exception {
		
		createfolderpage.createfoldertest();
		Thread.sleep(4000);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}