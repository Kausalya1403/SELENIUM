package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chris\\OneDrive\\Documents\\chromedriver ver-94\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		//WebElement box = driver.findElement(By.className("ui-autocomplete-input"));
		//box.sendKeys("s");
		
		//syntax = <HTML tag><[attribute=Value of attribute]>
		
		WebElement cssSeletor = driver.findElement(By.cssSelector("input[id='tags']"));
		cssSeletor.sendKeys("c");
	
	}

}
