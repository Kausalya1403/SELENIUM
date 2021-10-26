package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chris\\OneDrive\\Documents\\chromedriver ver-94\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");

		//Clicking the radio button
		WebElement yes = driver.findElement(By.id("yes"));
		yes.click();

		//To check which is by default selected

		WebElement unchecked = driver.findElement(By.name("news"));
		boolean result1 = unchecked.isSelected();
		System.out.println(result1);
		WebElement checked=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[3]/input"));
		boolean result2=checked.isSelected();
		System.out.println(result2);
		
		if (!result1)
			System.out.println("unchecked is not selected");
		else
			System.out.println("unchecked is selected");
		if (result2)
			System.out.println("checked is selected");
		else
			System.out.println("checked is not selected");

		//this block will validate whether button is selected or not

		WebElement age1=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[1]"));
		Boolean age1result=age1.isSelected();
		System.out.println(age1result);

		WebElement age2=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[2]"));
		Boolean age2result=age2.isSelected();
		System.out.println(age2result);

		WebElement age3=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[3]"));
		Boolean age3result=age3.isSelected();
		System.out.println(age3result);

		/*if(!age1result && !age2result && !age3result)
			System.out.println("please select the relavant age button");
		else
			System.out.println("the relavant age is selected");*/
                 
		
		      //or
		int n=0;
		if (age1result) {
			n++;
		}
		if (age2result) {
			n++;
		}
		if (age3result) {
			n++;
		}
		if (n>0) {
			System.out.println("some checkbox is selected");
			}
			else {
		    System.out.println("checkbox is not selected");
			age1.click();
			}
		}
		
}

