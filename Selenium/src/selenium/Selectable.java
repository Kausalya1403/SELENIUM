package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chris\\OneDrive\\Documents\\chromedriver ver-94\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/selectable.html");

		//escape sequence to print hi with double quotes
		//System.out.println(" \" Hi\" ");

		// to select multiple items

		/*WebElement item1 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
		item1.click();
		WebElement item2 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[3]"));
		item2.click();
		WebElement item3 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[4]"));
		item3.click();*/

		//syntax for custom x path
		//*[@id=\"sortable\"]

		// example ol[@id="selectable"]/li

		// to select items using custom xpath list and action class

		List<WebElement> Elements = driver.findElements(By.xpath("//ol[@id=\"selectable\"]/li"));
		System.out.println("Total number of Elements in the List are : " +Elements.size());
		Actions act = new Actions(driver);

		//using click & hold function

		act.clickAndHold(Elements.get(2));
		act.clickAndHold(Elements.get(5));
		act.release();
		act.build().perform();// it selects the elements from index 2 to 5
		
		//using control function to select RANDOM elements
		
		act.keyDown(Keys.CONTROL).click(Elements.get(0)).click(Elements.get(3)).click(Elements.get(6)).build().perform();

	}

}
