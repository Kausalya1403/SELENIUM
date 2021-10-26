package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatingbrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chris\\OneDrive\\Documents\\chromedriver ver-94\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		/*driver.findElement(By.name("q")).sendKeys("edubridge" +Keys.ENTER);
		driver.navigate().to("https://www.youtube.com/"); //navigates to youtube page
		driver.navigate().back(); // again come back to edubridge page
		driver.navigate().forward();// youtube page
		driver.navigate().refresh(); // refresh the page of youtube
		driver.close();*/
		
		
		// to get current url of the page
		/*driver.navigate().to("https://www.youtube.com/");
		driver.getCurrentUrl(); //the function will be executed but wont be displayed
		System.out.println(driver.getCurrentUrl());*/
		
		                 //or
		driver.navigate().to("https://www.youtube.com/");
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
	}

}
