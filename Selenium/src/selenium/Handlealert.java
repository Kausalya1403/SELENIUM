package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlealert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chris\\OneDrive\\Documents\\chromedriver ver-94\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		// click the button to display a alert box
		
		WebElement button = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
		button.click();
		// To click ok in alert box
		// still the control will be in that html page
		/*Alert alert1 = driver.switchTo().alert(); */  // control will go to alert window and we can do action there
		/*alert1.accept(); */    // it clicks on ok
		
		              //or
		
		driver.switchTo().alert().accept();
		
		// To click on button to display confirm box
		WebElement confirm = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		confirm.click();
		//driver.switchTo().alert().dismiss();
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		
		// to validate that you pressed cancel message
		
		WebElement result = driver.findElement(By.id("result"));
		System.out.println(result.getText());
		
		// to click on button to display prompt box
		
		WebElement prompt = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		prompt.click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Kausalya"); // already there is a text called testleaf overwrite it
		alert3.accept();
		
		// to click on button to learn line breaks in alert
		
		WebElement linebreak = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/button"));
		linebreak.click();
		Alert alert4 = driver.switchTo().alert();
		System.out.println(alert4.getText());
		alert4.dismiss();
		
		// to click on sweet alert
		
		WebElement sweet = driver.findElement(By.id("btn"));
		sweet.click();
		
		/*Alert alert5 = driver.switchTo().alert();
		alert5.accept();*/  // will get exceptions
		//sweet.sendKeys(Keys.ESCAPE); //sweet alert is not a proper alert so its not accepting accept(), so use escape
		//System.out.println(sweet.getText());
		
		// or ( if its sweet alert the control automatically goes to the alert, so try noemal method )
		WebElement text = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]"));
		System.out.println(text.getText());
		WebElement OK = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/button"));
		OK.click();
		
		
		
	
	}

}
