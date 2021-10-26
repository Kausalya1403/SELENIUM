package TestNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertExample2 {
	
	WebDriver driver;
	
	@Test(dependsOnMethods = "EditField")
	
	public void email() {
		WebElement email =  driver.findElement(By.id("email"));
		String a = "kausalya.k1403@gamil.com";
		email.sendKeys(a);
		String b= email.getAttribute("value");
		System.out.println(b);
		assertEquals(a, b);
		//driver.close();
		
	}
	@Test
	public void EditField() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chris\\OneDrive\\Documents\\chromedriver ver-94\\chromedriver.exe");
		driver = new ChromeDriver();//WebDriver is already declared 
		driver.get("http://www.leafground.com/pages/Edit.html");
	}
}
