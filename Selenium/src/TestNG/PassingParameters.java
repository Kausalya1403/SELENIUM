package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class PassingParameters {
	//String name123 = "Kausalya"; // value is given in xml code eventhough we didnt give any value 
	
	@Test
	@Parameters("name123")
	public void hello(String a) {
		System.out.println("Hello Everyone");
		System.out.println(a);
	}

}
