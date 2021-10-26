package selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chris\\OneDrive\\Documents\\chromedriver ver-94\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");

		//to open home page using new window

		String parentwindow = driver.getWindowHandle();
		WebElement button = driver.findElement(By.id("home"));
		button.click();
		Set<String> handle = driver.getWindowHandles();
		for (String newwindow : handle) {
			driver.switchTo().window(newwindow);
		}

		//by next two commands we are working on different window or child window

		WebElement one = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a"));// to open edit window
		one.click();

		driver.switchTo().window(parentwindow);// to go to parent window
		System.out.println(parentwindow);
		//back in home page
		WebElement countwindow = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		countwindow.click();

		//to count all opened windows
		int countofwindows = driver.getWindowHandles().size();// with the help of size command we are getting count
		System.out.println("no. of windows opened : " +countofwindows);
		driver.switchTo().window(parentwindow);

		//to close all opened windows

		WebElement button4 = driver.findElement(By.id("color"));
		button4.click();
		int n=0;
		Set<String> handle2 = driver.getWindowHandles();
		for (String window : handle2) {
			if(!window.equals(parentwindow))
			{
				driver.switchTo().window(window);
				driver.close();
				n++;
			}
		}
		System.out.println("Total closed windows are : " +n);

		//waiting and closing all opened windows

		driver.switchTo().window(parentwindow);
		WebElement button5 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div/div/button"));//its full xpath
		button5.click();
		System.out.println("clicking successful");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);// even if u don't give this it is working
		Set<String> handle3 = driver.getWindowHandles();
		for (String window : handle3) {
			if(!window.equals(parentwindow))
			{
				driver.switchTo().window(window);
				driver.close();
				System.out.println("closing");
			}
		}
	}

}
