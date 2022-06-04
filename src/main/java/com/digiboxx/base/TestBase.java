package com.digiboxx.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.digiboxx.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;

	public TestBase()  {
		
 try {
    prop = new Properties();
	FileInputStream ip = new FileInputStream("/Users/gaganbajwa/eclipse-workspace/DigiBoxxTestNGPOM/src/main/java/com/digiboxx/config/config.properties");
	
	prop.load(ip);
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	}
	 
	 public static void initialization() {
//		String browserName = prop.getProperty("browser");
//		if(browserName.equals("chrome")){
//			System.setProperty("webdriver.chrome.driver", "/Users/gaganbajwa/Downloads/chromedriver");
//		 driver = new ChromeDriver();
//		}else if (browserName.equals("FF")){
//			System.setProperty("webdriver.gecko.driver", "/Users/gaganbajwa/Downloads/geckodriver");
//		driver = new FirefoxDriver();
		
		 System.setProperty("webdriver.chrome.driver", "/Users/gaganbajwa/Downloads/chromedriver");		 
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get(prop.getProperty("url"));
	 }
	 }



