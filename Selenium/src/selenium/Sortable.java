package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chris\\OneDrive\\Documents\\chromedriver ver-94\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/sortable.html");

		//sort elements in descending order

		List<WebElement> Elements = driver.findElements(By.xpath("//ul[@id=\"sortable\"]/li"));
		System.out.println("Total number of Elements in the List are : " +Elements.size());

		Actions act = new Actions(driver);

		// using drag and drop function

		act.dragAndDrop(Elements.get(6), Elements.get(0)).perform();
		act.dragAndDrop(Elements.get(5), Elements.get(0)).perform();
		act.dragAndDrop(Elements.get(4), Elements.get(0)).perform();
		act.dragAndDrop(Elements.get(3), Elements.get(0)).perform();
		act.dragAndDrop(Elements.get(2), Elements.get(0)).perform();
		act.dragAndDrop(Elements.get(1), Elements.get(0)).perform();


		// using for loop

		int i,j = 1;
		 for (i = 0;i<Elements.size()-1;i++) {
			WebElement from = Elements.get(j);
			String fromtext = Elements.get(j).getText();
			//System.out.println("from element is going to be " +fromtext);

			WebElement to = Elements.get(i);
			String totext = Elements.get(i).getText();
			//System.out.println("to element going to be " +totext);
			act.dragAndDrop(from, to).build().perform();
			System.out.println(fromtext + " is moved to " +totext);
			j++;
		}

	}

}
