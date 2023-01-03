package Neostoxpomclasses1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import NeostoxUtility1.Utilitycommonmethod2properties;
public class NeostoxHomePage1 
{
	
	
	
	
	@FindBy(xpath="(//a[text()='OK'])[2]")private WebElement okbutton;
	@FindBy(xpath="(//a[text()='Close'])[5]") private WebElement closebutton;
	@FindBy(id="lbl_username") private WebElement username;
	@FindBy(xpath="(//span[@class='righttopmenu1'])[2]") private WebElement accbalance;
	@FindBy(xpath="//span[text()='Logout']") private WebElement logoutbutton;
	
	public NeostoxHomePage1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void popup(WebDriver driver) throws InterruptedException
	{
		if(okbutton.isDisplayed())
		{
			Thread.sleep(1000);
		okbutton.click();
		Reporter.log("clicking on ok button of Popup",true);
		Utilitycommonmethod2properties.wait(driver, 1000);
		closebutton.click();
		Reporter.log("clicking on Close button of Popup",true);
		Utilitycommonmethod2properties.wait(driver, 1000);
		}
		else
		{
			Reporter.log("there is no Popup", true);
			Thread.sleep(1000);
		}
	}
	public String getActualUserID(WebDriver driver)
	{
		Utilitycommonmethod2properties.wait(driver, 1000);
		String actualUserName = username.getText();
		//String realname = actualUserName.substring(3);
		Reporter.log("getting actual user name is "+actualUserName,true);
		return actualUserName;
	}
	public String getActualBalance(WebDriver driver)
	{
		Utilitycommonmethod2properties.wait(driver, 1000);
		String AccBalance = accbalance.getText();
		//String onlyamount = AccBalance.substring(13);
	//	Reporter.log("getting account balance",true);
		Reporter.log("account balance is "+AccBalance,true);
		return AccBalance;
	}
	public void logout(WebDriver driver)
	{
		Utilitycommonmethod2properties.wait(driver, 1000);
		username.click();
		Utilitycommonmethod2properties.wait(driver, 1000);
		logoutbutton.click();
		Reporter.log("loging out neostox",true);
		
	}

}
