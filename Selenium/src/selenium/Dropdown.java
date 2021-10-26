package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chris\\OneDrive\\Documents\\chromedriver ver-94\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
	    
		// for dropdown select class is used
	// To select program using index by creating select class
		
		WebElement index =  driver.findElement(By.id("dropdown1"));
		Select select = new Select(index);
		select.selectByIndex(1);
		select.selectByIndex(2);
	
   // To select program using text by creating select class
		
		WebElement text = driver.findElement(By.name("dropdown2"));
		Select select1 = new Select(text);
		select1.selectByVisibleText("Loadrunner");
		
  // To select program using value using select class
		
		WebElement value = driver.findElement(By.id("dropdown3"));
		Select select2 = new Select(value);
		select2.selectByValue("3");
		
  // To know how many options are present
		
	   /*List<WebElement> optionlist = select2.getOptions();
	   int size = optionlist.size();
	   System.out.println(size);*/
		
	            //or
		
	   List<WebElement> optionlist = select2.getOptions();
	   System.out.println(optionlist.size());
	   
	   int size=optionlist.size(); 
	   for (int i= 0;i<size;i++)
	   {
		   System.out.println(optionlist.get(i).getText());
	   }
	   
     // Select using sendkeys
	
	WebElement element = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
	//element.sendKeys("Selenium"); // even if you write partial texts ex: "Sel" it still selects
	element.sendKeys("App");
	
	// to select program without using select class
	
	WebElement withoutselect = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
	withoutselect.sendKeys("Load");
	
	}
	

}
