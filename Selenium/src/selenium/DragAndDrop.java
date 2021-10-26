package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chris\\OneDrive\\Documents\\chromedriver ver-94\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		
		//drag an element and drop inside the box
		
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.clickAndHold(from);
		act.moveToElement(to);
		act.release();
		act.build().perform(); //when more actions need to be performed we use build function
		WebElement dropped = driver.findElement(By.xpath("//*[@id=\"droppable\"]/p"));
		System.out.println(dropped.getText());
		
		//or
		
		act.clickAndHold(from).moveToElement(to).release(to).build().perform();
		
		// or simply
		
		act.dragAndDrop(from, to).perform();
		
	}

}
