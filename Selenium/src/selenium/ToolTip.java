package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chris\\OneDrive\\Documents\\chromedriver ver-94\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/tooltip.html");
		
		Actions act = new Actions(driver);
		
		// to enter a name
		
		WebElement name = driver.findElement(By.id("age"));
		System.out.println(name.getAttribute("title"));
		act.moveToElement(name).perform();
		name.sendKeys("Kausalya" +Keys.ENTER);
		//String a = name.getAttribute("title");
		//System.out.println(a);
	}

}
