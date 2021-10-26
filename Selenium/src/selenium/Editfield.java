package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Editfield {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chris\\OneDrive\\Documents\\chromedriver ver-94\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");

		//enter value to a edit box
		
		WebElement email =  driver.findElement(By.id("email"));
		email.sendKeys("kausalya.k1403@gmail.com");

		////append values in a edit box and enter tab to go to the next field
		
		WebElement append= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		append.sendKeys("Hello"+Keys.TAB);

		//to get default text entered
		/*String sh = driver.findElement(By.name("username")).getAttribute("value");
		System.out.println(sh); */
							
							//or

		WebElement getAttr = driver.findElement(By.name("username"));
		String sh= getAttr.getAttribute("value");
		System.out.println(sh);
		
		//to clear box
		
		WebElement clearbox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		clearbox.clear();
		
		//confirm that editfield is disabled
		
		Boolean result = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input")).isEnabled();
		if(result)
			System.out.println("editbox is enabled");
		else
			System.out.println("editbox is disabled");
		
		              //or
		
		//store it in some variable
		
		
			
			
	}

}
