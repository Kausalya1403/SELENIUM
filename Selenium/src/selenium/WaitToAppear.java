package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitToAppear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chris\\OneDrive\\Documents\\chromedriver ver-94\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/appear.html");
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn")));
		System.out.println(driver.findElement(By.id("btn")).getText());
		System.out.println("");
		
		// significance of 30 seconds
		try {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("btn")));//throws error becoz the event never occurs
		}
		//try catch concept
		catch(Exception e)
		{
			System.out.println("Something went wrong - The element is still visible");
		}
	}

}
