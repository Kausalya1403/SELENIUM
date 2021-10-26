package selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chris\\OneDrive\\Documents\\chromedriver ver-94\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		
		// to click a button which is inside a frame
		driver.switchTo().frame(0);
		WebElement button1 = driver.findElement(By.id("Click"));
		button1.click();
		System.out.println(button1.getText());
		
		// to click a button inside a nested frame
		
		driver.switchTo().defaultContent(); // it switch to native html testleaf frame page
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2"); //use frame(string) // this is the nested frame present inside frame1
		WebElement button2  = driver.findElement(By.id("Click1"));
		button2.click();
		System.out.println(button2.getText());
		
		// to count number of frames
		
		driver.switchTo().defaultContent();
		List<WebElement> count = driver.findElements(By.tagName("iframe"));
		System.out.println("number of frames in native page :" +count.size());
		
		System.out.println("");
		
		// to count all the frames including nested frames
		
		System.out.println("NUMBER OF NESTED FRAMES IN EACH SINGLE FRAMES ARE");
		
		driver.switchTo().frame(0);
		List<WebElement> count1 = driver.findElements(By.tagName("iframe"));
		System.out.println("number of frames  in 1st frame :" +count1.size());
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		List<WebElement> count2 = driver.findElements(By.tagName("iframe"));
		System.out.println("number of frames  in 2nd frame :" +count2.size());
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2); // this is third frame
		List<WebElement> count3 = driver.findElements(By.tagName("iframe"));
		System.out.println("number of frames  in 3nd frame :" +count3.size());
		driver.switchTo().defaultContent();
		
		System.out.println("");
		System.out.println("Therefore TOTAL NUMBER OF FRAMES including nested frames are :" +(count.size()+count1.size()+count2.size()+count3.size()));
		
	
		
		
	}

}
