package NeostoxUtility1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.testng.Reporter;

public class Utilitycommonmethod2properties 
{
	
	
	//  scroll into view , excel reading, wait, screenshoot
		
		// for excel sheet reading purpose common method
	// scroll into view , excel reading, wait, screenshoot
		
		// for excel sheet reading purpose common method
		
		public static String readdatafromPropertyFile(String key) throws IOException
		{
			//create object of Properties class--> java
			Properties pro= new Properties();
			
			//create object of FileInputStream and pass properties file path as a parameter
			FileInputStream myfile= new FileInputStream("C:\\Users\\User\\eclipse-workspace\\16JulyAEveningMaven\\NeoStoxNew.Properties");
			pro.load(myfile);
			String value = pro.getProperty(key);
		//	Reporter.log("Reading " +key+ " from property file", true);
			return value;
			
		}
		
		// for screenshoot purpose common method
		
		public static void Takescreenshot(WebDriver driver, String screenshotname) throws IOException
		{
			wait(driver, 1000);
			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File distination= new File("C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\screenshort\\"+screenshotname+".png");
			org.openqa.selenium.io.FileHandler.copy(source, distination);
			//Reporter.log("Taking screenshot",true);
		}
		
		// for scroll into view purpose
		
		public static void scrollintoview(WebDriver driver, WebElement element)
		{
			wait(driver, 1000);
			 JavascriptExecutor js = (JavascriptExecutor)driver;
			 js.executeScript("arguments[0].scrollIntoView(true)", element);
			 //Reporter.log("scrolling into view",true);

		}
		
		// for wait purpose
		
		public static void wait(WebDriver driver, int waittime)
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waittime));
			//Reporter.log("waiting for"+waittime+ " ms",true);
		}
		
		


	}



