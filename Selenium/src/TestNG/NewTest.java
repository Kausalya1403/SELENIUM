package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("im @ test");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("im before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("im after test");
  }

}
