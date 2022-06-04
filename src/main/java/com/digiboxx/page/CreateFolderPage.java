package com.digiboxx.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.digiboxx.base.TestBase;

public class CreateFolderPage extends TestBase {
	
	@FindBy(xpath = "//span[@class='add-btn']")
	WebElement Addbutton;
	
	@FindBy(xpath = "//span[contains(text(),’+Add’)]")
	WebElement CreateFolder;
	
	@FindBy(xpath = "//input[@id='folderName']")
	WebElement Foldername;
	
	@FindBy(xpath = "//button[@class='start-btn log-btn my-1']")
	WebElement CreateButton;
	
	public CreateFolderPage() {
	PageFactory.initElements(driver, this);	
	}
	
	public void createfoldertest() {
		Addbutton.click();
		CreateFolder.click();
		Foldername.sendKeys("Jasmeen's first");
		CreateButton.click();
		
	}

}
