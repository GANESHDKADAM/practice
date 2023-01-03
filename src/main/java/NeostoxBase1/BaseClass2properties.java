package NeostoxBase1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import NeostoxUtility1.Utilitycommonmethod2properties;

public class BaseClass2properties 
{
	 protected static WebDriver driver;
		public void launchBrowser() throws InterruptedException, IOException
		{
	         System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(Utilitycommonmethod2properties.readdatafromPropertyFile("url"));
			driver.manage().window().maximize();
			Reporter.log("luanching the browser",true);
			
			
			
			
			
		    Thread.sleep(1000);
		    Thread.sleep(1000);
		    Thread.sleep(1000);
		    Thread.sleep(1000);
		    Thread.sleep(1000);
		    Thread.sleep(1000);
		    Thread.sleep(1000);
		    Thread.sleep(1000);
		    Thread.sleep(1000);
		    Thread.sleep(1000);
		}

}
