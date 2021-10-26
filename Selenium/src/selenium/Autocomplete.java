package selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Autocomplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chris\\OneDrive\\Documents\\chromedriver ver-94\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		WebElement box = driver.findElement(By.id("tags"));
		Actions act = new Actions(driver);

		//normal method

		/*act.moveToElement(box).click().perform();
		act.sendKeys("s").perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform(); */

		//reliable method for dynamic elements

		act.moveToElement(box).click().perform();
		act.sendKeys("s").perform();
		Thread.sleep(5000);
		List<WebElement> result = driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));//click on s copy the xpath of all elements
		System.out.println("Total result is : " +result.size());
		for(WebElement finalresult : result) {
			if(finalresult.getText().equals("Selenium")) {
				finalresult.click();
				System.out.println("Selenium is selected");
				break;
			}
		}
	}

}
