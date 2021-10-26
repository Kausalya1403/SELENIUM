package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//contextClick()
		//doubleClick()
		//moveToElement()
		//contextClick
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chris\\OneDrive\\Documents\\chromedriver ver-94\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/mouseOver.html");
		
		Actions act = new Actions(driver);
		
		WebElement courses = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div[5]/ul/li/a"));
		act.moveToElement(courses).perform();
		
		// to select selenium
		WebElement selenium = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div[5]/ul/li/ul/li[1]/a"));
		act.moveToElement(selenium);
		selenium.click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert1.accept();
		
		// to select RPA
		WebElement RPA = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div[5]/ul/li/ul/li[2]/a"));
		act.moveToElement(RPA);
		RPA.click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.accept();
		
		// to select WebServices
		WebElement WebServices = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div[5]/ul/li/ul/li[3]/a"));
		act.moveToElement(WebServices);
		WebServices.click();
		Alert alert3 = driver.switchTo().alert();
		System.out.println(alert3.getText());
		alert3.accept();
		

	}

}
