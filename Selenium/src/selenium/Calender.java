package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chris\\OneDrive\\Documents\\chromedriver ver-94\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Calendar.html");
		
		// to select 10th day of following month
		WebElement calender = driver.findElement(By.id("datepicker"));
		//calender.sendKeys("10/10/2021" +Keys.ENTER);
		calender.click();
		WebElement forward = driver.findElement(By.xpath("//a[@title='Next']"));//it selects month//using attribute value = 'text'
		forward.click();
		
		WebElement date = driver.findElement(By.xpath("//a[contains(text(),'10')]"));//using function
		date.click();
	}

}
