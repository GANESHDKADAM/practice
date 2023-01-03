package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class multipleTestCaseUseAllAnnotations 
{
  @Test
  public void myTest() 
  {
	  Reporter.log("this is my first test case", true);
	  
  }
  @Test
  public void myTest1()
  {
	  Reporter.log("this is my secound test case", true);  
  }
  @Test
  public void myTest2()
  {
	  Reporter.log("this is my third test case", true);
  }
  @Test
  public void myTest3()
  {
	  Reporter.log("this is my fourth test case", true);
  }
  @Test
  public void myTest4()
  {
	  Reporter.log("this is my fifth test case", true);
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	Reporter.log("before method running", true);  
  }
  @AfterMethod
  public void afterMethod()
  {
	  Reporter.log("after method running", true);
  }
  @BeforeClass
  public void beforeClass()
  {
	  Reporter.log("before class running", true);
  }
  @AfterClass
  public void afterClass()
  {
	  Reporter.log("after class running", true);
  }
  }
