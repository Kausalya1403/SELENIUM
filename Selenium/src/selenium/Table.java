package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chris\\OneDrive\\Documents\\chromedriver ver-94\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");

		//count number of columns and rows by tag name
		List<WebElement> column = driver.findElements(By.tagName("th"));
		System.out.println("Total number of columns : " +column.size());

		List<WebElement> row = driver.findElements(By.tagName("tr"));
		System.out.println("Total number of rows : " +row.size());

		//count rows and columns using xpath
		List<WebElement> column1 = driver.findElements(By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/th"));//copy xpath which is pointing only to headings
		System.out.println("count of columns : " +column1.size());

		List<WebElement> row1 = driver.findElements(By.xpath("//*[@id=\"table_id\"]/tbody/tr"));
		System.out.println("count of rows : " +row1.size());


		// get the progress value of "learn to interact with elements" (get value from particular row and column)
		WebElement progress = driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		System.out.println("Progress is : " +progress.getText());

		//similarly to get mentor name of "learn to interact with Elements"
		// td[4]
		WebElement mentor = driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[4]"));
		System.out.println("Mentor name is : " +mentor.getText());
        
		
		//check the vital task for least progress
		
		//Comparing string value after converting to int and get value
		//here percentage value is string so convert
		List<WebElement> percentage = driver.findElements(By.xpath("//td[2]")); //all the tabledata which is corresponding to index[2]
		List<Integer> number = new ArrayList<>(); //to store the string elements in integer array
		for (WebElement tabledata : percentage) {
			String progressvalue = tabledata.getText().replace("%", ""); // % is overwritten by whitespace
			number.add(Integer.parseInt(progressvalue)); //convert string to integer syntax= name of listarray.add
		}
		System.out.println("The percentage values Present in progress column : "  +number);
        int smallnum = Collections.min(number);
        System.out.println("The least progress value is : " +smallnum);
        
        //custom x path to check the vital column which has least progress value
        
        String custom = "//td[normalize-space()='"+smallnum+"%']//following::td[1]//input[@type='checkbox']";
        System.out.println(custom);
        
        WebElement check = driver.findElement(By.xpath(custom));
        check.click();
        
        
	}

}
