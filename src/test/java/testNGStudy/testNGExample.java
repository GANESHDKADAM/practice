package testNGStudy;

import org.openqa.selenium.By.Remotable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import bsh.Remote;


public class testNGExample {
  @Test
  public void practicepage() 
  {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
	  System.out.println("The 1st Method is pass only show the output in console only");  // only show the output in console window
	  Reporter.log("The 1st Method is pass only show the output in console only >> only string use");  // only show the output in testNG report only
	  Reporter.log("my first method pass using string and boolean type", true);  // showing the output in both console and testNG report
	  Reporter.log("my first method pass", false); // only show the output in testNG report only
		
  }
  @Test
  public void flipcardpage() 
  {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	  System.out.println("The 2nd Method is pass only show the output in console only");  // only show the output in console window
	  Reporter.log("The 1st Method is pass only show the output in console only>> only string use");  // only show the output in testNG report only
	  Reporter.log("my second method pass using string and boolean type", true);  // showing the output in both console and testNG report
	  Reporter.log("my second method pass", false);  // only show the output in testNG report only
		
  }
  
}
