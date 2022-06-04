package com.digiboxx.page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.digiboxx.base.TestBase;



public class LoginPage extends TestBase {
	

	
	

	@FindBy(name = "workspace")
	WebElement workspace;
	
	@FindBy(name = "Username")
	WebElement Username;
	
	@FindBy(name = "Password")
    WebElement Password;
	
	@FindBy(xpath="//button[@class='start-btn']")
	WebElement loginBtn;
	
	@FindBy(xpath= "//a[contains(text(),'Click Here')]")
	WebElement ClickHere;
	
	@FindBy(xpath = "//img[@title='Digiboxx']")
	WebElement DigiBoxxLogo;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
		
	public boolean validateDigiBoxxlogo() {
		return DigiBoxxLogo.isDisplayed();
	}

 public HomePage loginTest(String work, String un, String pwd) {
	workspace.sendKeys(work);
	Username.sendKeys(un);
	Password.sendKeys(pwd);
	loginBtn.click();
	ClickHere.click();
	 
//	 WebElement digispace = driver.findElement(By.xpath("//input[@id='workspace']"));
//	 digispace.sendKeys("intern 3");
//	 WebElement email = driver.findElement(By.xpath("//input[@id='Username']"));
//	 email.sendKeys("Email");
//	 WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
//	 password.sendKeys("Password");
//	 WebElement loginBtn = driver.findElement(By.xpath("//button[contains(text(),'Login Now')]"));
//	 loginBtn.click();
	 
	 return new HomePage();
	 
    
 
 
 

 }
}


	


