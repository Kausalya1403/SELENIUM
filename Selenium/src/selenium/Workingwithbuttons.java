package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithbuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chris\\OneDrive\\Documents\\chromedriver ver-94\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");

		//by this we are clicking on button and it goes again to homepage
		WebElement button = driver.findElement(By.id("home"));
		button.click();

		//to get position of the button 
		driver.navigate().back(); //goes back to button page and find element because previous code it will be in homepgae
		WebElement position= driver.findElement(By.id("position"));  
		position.getLocation(); 
		Point xycoordinates = position.getLocation(); 
		int x = xycoordinates.getX(); 
		int y = xycoordinates.getY(); 
		System.out.println("x and y coordinates are "+x+" "+y); 
		
		//to get colour of the button
		
		WebElement backgroundcolour=driver.findElement(By.id("color"));
		String color= backgroundcolour.getCssValue("background-color");
		System.out.println(color);
		
		//to get size of button
		
		WebElement size = driver.findElement(By.id("color"));
		int width = size.getSize().getWidth();
		int height = size.getSize().getHeight();
		System.out.println("height and width are " +height+ " " +width);


	}

}
