package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class Seleniumtesting {
	WebDriver driver;

	@Test(dependsOnMethods = "EditField") //EditField function will be executed First
	public void f() {
		WebElement email =  driver.findElement(By.id("email"));
		email.sendKeys("kausalya.k1403@gmail.com");

	}

	@Test
	public void EditField() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chris\\OneDrive\\Documents\\chromedriver ver-94\\chromedriver.exe");
		driver = new ChromeDriver();//WebDriver is already declared 
		driver.get("http://www.leafground.com/pages/Edit.html");
		
	}

}
