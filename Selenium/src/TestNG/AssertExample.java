package TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class AssertExample {
	String result = "hello";
  @Test
  public void hello() {
	  assertEquals(result, "hello");// choose assertEquals actual abject, ecpected object
	  
  }
  
}
