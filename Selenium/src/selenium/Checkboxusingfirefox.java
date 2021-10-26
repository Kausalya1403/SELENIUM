package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkboxusingfirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\chris\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");

		// to select some checkbox
		WebElement java = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div[1]/input"));
		java.click();
		WebElement sql = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div[3]/input"));
		sql.click();
		WebElement c = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div[4]/input"));
		c.click();
		WebElement Cplus = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div[5]/input"));
		Cplus.click();

		//confirm selenium is selected

		WebElement selenium = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/input"));
		boolean result = selenium.isSelected();

		if(result) 
			System.out.println("selenium checkbox is selected");
		else
			System.out.println("selenium checkbox is not selected");

		//select all checkboxes

		WebElement option1 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div[1]/input"));
		option1.click();
		WebElement option2 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div[2]/input"));
		option2.click();
		WebElement option3 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div[3]/input"));
		option3.click();
		WebElement option4 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div[4]/input"));
		option4.click();
		WebElement option5 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div[5]/input"));
		option5.click();

		//deselect only checked

		WebElement notselected = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div[1]/input"));
		boolean result1 = notselected.isSelected();
		if(result1) {
			System.out.println("not selected option is checked so deselect it");
			notselected.click();}
		else 
			System.out.println("not selected option is unchecked");
		
		WebElement selected = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div[2]/input"));
		boolean result2 = selected.isSelected();
		if(result2) {
			System.out.println("I'm selected option was already checked so deselected it");
			selected.click();}
		else 
			System.out.println("not selected");
	}
}
