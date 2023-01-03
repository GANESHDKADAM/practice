package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGallAnnotationsUse 
{
  @Test
  public void myTest() 
  {
	  Reporter.log("this is my test case method running", true);
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  Reporter.log("this is my before method running", true);
  }
  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("this is my after method running", true);
  }
  @BeforeClass
  public void beforeClass()
  {
	  Reporter.log("this is my before class running", true);
  }
  @AfterClass
  public void afterClass()
  {
	  Reporter.log("this is my after class running", true);
  }
}
