package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chris\\OneDrive\\Documents\\chromedriver ver-94\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drag.html");
		
		//drag the element and drop anywhere by giving the position
		 WebElement from = driver.findElement(By.id("draggable"));
		 Actions action = new Actions(driver);
		 action.dragAndDropBy(from, 400	, 50).perform(); // giving x and y positions
		
	}

}
