package activites;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Goibibo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chris\\OneDrive\\Documents\\chromedriver ver-94\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/hotels/");

		//to select India radio button
		WebElement India = driver.findElement(By.xpath("//input[@name='CountryType']"));
		India.click();
		boolean result = India.isSelected();
		if(result) 
			System.out.println("India is selected");
		else
			System.out.println("India is not selected");

		//select any city from where dropdown
		WebElement city = driver.findElement(By.xpath("//input[@placeholder='e.g. - Area, Landmark or Hotel Name']"));
		city.click();
		Actions act = new Actions(driver);
		act.sendKeys("Bangalore").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
		String s = city.getAttribute("value");
		System.out.println("The city selected is : " +s);

		//to select check in date
		WebElement date = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div/div[3]/div/div[1]/div/h4"));
		date.click();
		WebElement checkin = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/section/div/div[1]/div[2]/div/ul[2]/li[33]"));
		checkin.click();
		WebElement date1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div[2]/div[3]/div/div[4]/div/h4"));
		date1.click();
		WebElement checkout = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/section/div/div[2]/div[2]/div/ul[2]/li[2]"));
		checkout.click();
		System.out.println("check-in date : " +date.getText());
		System.out.println("check-out date : " +date1.getText());

		//check night counts
		WebElement nightcount = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div/div[3]/div/div[3]"));
		System.out.println("Total night counts : " +nightcount.getText());

		//select room 
		WebElement room = driver.findElement(By.xpath("//input[@type='text']"));
		room.click();
		WebElement rooms = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div[2]/div[4]/div/div/div/div[1]/div/span[2]"));
		rooms.click();
		WebElement adult = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div[2]/div[4]/div/div/div/div[2]/div/span[2]"));
		adult.click();
		WebElement children = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div[2]/div[4]/div/div/div/div[3]/div/span[2]"));
		children.click();
		WebElement age1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div[2]/div[4]/div/div/div/div[4]/div/span"));
		age1.click();
		WebElement childage1= driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div[2]/div[4]/div/div/div/div[4]/ul/li[6]"));
		childage1.click();
		children.click();
		WebElement age2= driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div[2]/div[4]/div/div/div/div[5]/div/span"));
		age2.click();
		WebElement childage2= driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div[2]/div[4]/div/div/div/div[5]/ul/li[12]"));
		childage2.click();
		
		
		//click on done
		WebElement done = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div[2]/div[4]/div/div/div/div[6]/button"));
		done.click();
		
		//click on search hotel button
		WebElement searchhotel = driver.findElement(By.xpath("//button[@data-testid='searchHotelBtn']"));
		searchhotel.click();	
	}

}
