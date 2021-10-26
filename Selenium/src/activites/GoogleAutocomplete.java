package activites;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleAutocomplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chris\\OneDrive\\Documents\\chromedriver ver-94\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement search = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		Actions act = new Actions(driver);
		act.sendKeys("seleni").perform();
		//act.sendKeys(Keys.ARROW_DOWN);
		//act.sendKeys(Keys.ENTER);
		//act.build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();

	}

}
