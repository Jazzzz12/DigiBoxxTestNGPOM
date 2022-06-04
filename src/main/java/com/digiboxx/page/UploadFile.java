package com.digiboxx.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.digiboxx.base.TestBase;

public class UploadFile extends TestBase{
	
	@FindBy(xpath = "//span[@class='add-btn']")
	WebElement Addbutton;
	
	@FindBy(xpath= "//input[@name='new_folder_upload']")
	WebElement Uploadfile;
	
	public UploadFile() {
		PageFactory.initElements(driver, this);
		
	}
	
	public UploadFolder addbuttonclick() {
		Addbutton.click();
		return new UploadFolder();
	}
	
	public UploadFolder UploadImage() {
		Uploadfile.sendKeys("/Users/gaganbajwa/Downloads/photo-1500485035595-cbe6f645feb1.jpeg");
		return new UploadFolder();
	}
	
	public UploadFolder UploadPDF() {
		Uploadfile.sendKeys("/Users/gaganbajwa/Downloads/Actions (4).pdf");
		return new UploadFolder();
	}
	
	public UploadFolder UploadVideo() {
		Uploadfile.sendKeys("/Users/gaganbajwa/Downloads/WhatsApp Video 2021-12-09 at 8.01.27 PM.mp4");
		return new UploadFolder();
	}
	
	public UploadFolder UploadXlSheet() {
		Uploadfile.sendKeys("/Users/gaganbajwa/Downloads/Sanity Testcases_Digiboxx.xlsx");
		return new UploadFolder();
	}

}
