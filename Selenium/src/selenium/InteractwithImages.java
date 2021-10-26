package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InteractwithImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chris\\OneDrive\\Documents\\chromedriver ver-94\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Image.html");

		//by clicking on image go to homepage

		WebElement image = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img"));
	    //to validate image is broken or not
		if(image.getAttribute("naturalHeight").equals("0"))
		{
			System.out.println("Image is broken");
		}
		else
			System.out.println("Image is not broken");

		image.click();
		
		//validate image is broken
		
		driver.navigate().back();
		WebElement brokenimg = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img"));
		if(brokenimg.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("Image is broken");
		}
		else
			System.out.println("Image is not broken");
		
		//click image using keyboard or mouse
		
		WebElement img3 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/img"));
		Actions act = new Actions(driver);
		act.moveToElement(img3).click().perform();
	}

}
