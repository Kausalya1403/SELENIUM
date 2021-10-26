package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Differentsites {

	long startTime;
	long closeTime;
	long totalTime;
	WebDriver driver;
	@BeforeSuite
	public void a() {
		startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chris\\OneDrive\\Documents\\chromedriver ver-94\\chromedriver.exe");
		driver = new ChromeDriver();   
	}
	@Test
	public void OpenGoogle() {
		startTime = System.currentTimeMillis();
		driver.get("https://www.google.com/");
		closeTime = System.currentTimeMillis();
	}

	@Test
	public void OpenyouTube() {
		startTime = System.currentTimeMillis(); 
		driver.get("https://www.youtube.com/");
		closeTime = System.currentTimeMillis();
	}
	@Test
	public void OpenTestLeaf() {
		startTime = System.currentTimeMillis();
		driver.get("http://www.leafground.com/");
		closeTime = System.currentTimeMillis();
	}

	@AfterSuite
	public void b() {
		driver.quit();
		totalTime = closeTime - startTime ;
		System.out.println("total time taken is : " +totalTime);  
	} 
}
