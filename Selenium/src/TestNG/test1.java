package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class test1 {
  @Test
  public void f() {
	  System.out.println("I'm @ test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I'm in before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I'm in after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("I'm at before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I'm at after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("I'm @ before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("I'm @ after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I'm before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("I'm after suite");
  }

}
