package com.digiboxx.page;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.digiboxx.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath = "//a[@routerlink='landing-page/quick_access']")
	WebElement QuickAccess;
	
	@FindBy(xpath = "//a[@routerlink='landing-page/star']")
	WebElement starred;
	
	@FindBy(xpath= "//a[@routerlink='landing-page/assigned']")
	WebElement shared;

	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
		
	}
	public UploadFile clickOnQuickAccess() {
		QuickAccess.click();
		return new UploadFile();
		
		
	}
	
	public UploadFile  ClickOnStarred() {
		starred.click();
		return new UploadFile();
		
	}
	
	public UploadFile ClickOnShared() {
		shared.click();
		return new UploadFile();
		
	}
	
	
	
	
	
	

}
