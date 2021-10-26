package activites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demosite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chris\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

		// cancel alert
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement close = driver.findElement(By.id("at-cv-lightbox-close"));
		close.click();

		// to enter a message in the box and display it

		WebElement message = driver.findElement(By.id("user-message"));
		message.sendKeys("Kausalya");
		WebElement show = driver.findElement(By.xpath("//*[@id=\"get-input\"]/button"));
		show.click();
		WebElement display = driver.findElement(By.id("display"));
		System.out.println("The text entered is " +display.getText());

		// enter numbers and get total
		
		WebElement a = driver.findElement(By.id("sum1"));
		a.sendKeys("254");
		WebElement b = driver.findElement(By.id("sum2"));
		b.sendKeys("120");
		WebElement gettotal = driver.findElement(By.xpath("//*[@id=\"gettotal\"]/button"));
		gettotal.click();
		WebElement displayvalue = driver.findElement(By.id("displayvalue"));
		System.out.println("Total is " +displayvalue.getText());
		
	}

}
