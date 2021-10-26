package TestNG;

import org.testng.annotations.Test;

public class TestDependencies {
  @Test(dependsOnMethods = { "testTwo" , "testThree" }) // if any function fail to execute then depends method 
  public void testOne() {
	  System.out.println("Test method One");
  }
  @Test
  public void testTwo() {
	  System.out.println("Test method two");
  }
  @Test
  public void testThree() {
	  System.out.println("test method three");
  }
}
//order of execution will be testThree, testTwo, testOne (3,2,1) because it executes in Alphabetical order
//if any testcase either testTwo or testThree fails then throws error 