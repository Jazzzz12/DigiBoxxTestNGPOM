package com.digiboxx.testcases;

import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.digiboxx.base.TestBase;
import com.digiboxx.page.HomePage;
import com.digiboxx.page.LoginPage;
import com.digiboxx.page.UploadFile;
import com.digiboxx.page.UploadFolder;
import com.digiboxx.util.TestUtil;

public class UploadFileTest extends TestBase{
	private static final UploadFileTest AddButton = null;
	LoginPage loginPage;
	HomePage homepage;
	TestUtil testutil;
	UploadFile uploadfile;
	UploadFolder uploadfolder;

public UploadFileTest(){
	super();
}


@BeforeMethod
public void SetUP() {
	initialization();
	testutil = new TestUtil();
	loginPage = new LoginPage();
	uploadfile = new UploadFile();
	uploadfolder = new UploadFolder();
	homepage = loginPage.loginTest(prop.getProperty("workspace"), prop.getProperty("Username"), prop.getProperty("Password"));
	}

@Test (priority = 1)
public void VerifyclickAddButton() throws Exception {
	uploadfile.addbuttonclick();
	Thread.sleep(5000);
	
}

@Test (priority = 2)
	public void VerifyImageUpload() throws Exception {
	uploadfile.UploadImage();
	Thread.sleep(5000);
	 
	
}
	@Test(priority = 3)
    public void VerifyUploadPDF() {
	uploadfile.UploadPDF();
}
	@Test(priority = 4)
    public void VerifyUploadVideo() {
	uploadfile.UploadVideo();
}
	@Test(priority = 5)
    public void VerifyUploadXlSheet() {
    	uploadfile.UploadXlSheet();
    }



@AfterMethod
public void tearDown() {
	driver.quit();
}
}