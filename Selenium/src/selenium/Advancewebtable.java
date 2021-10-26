package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advancewebtable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chris\\OneDrive\\Documents\\chromedriver ver-94\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sorttable.html");

		//to store all the names in list

		List<WebElement> table1 = driver.findElements(By.xpath("//td[2]"));
		System.out.println("size : " +table1.size());
		
		System.out.print("Names in the table are : ");
		ArrayList<String> sorting = new ArrayList<>();
		for (WebElement table1names : table1) {
			String name1 = table1names.getText();
			System.out.print(name1+ " , ");
			sorting.add(name1);
		}
		System.out.println();
		System.out.println();
		System.out.println("The elements in the table after sorting it in alphabetical order are : ");
		Collections.sort(sorting);
		System.out.println(sorting);

		//to click on name header
		WebElement sort = driver.findElement(By.xpath("//*[@id=\"table_id\"]/thead/tr/th[2]"));
		sort.click();
		System.out.println();

		//sorting the names in the list after clicking on name header
		List<WebElement> table2 = driver.findElements(By.xpath("//td[2]"));
		System.out.println("After clicking on the name header, now the elements in the table are :");

		ArrayList<String> Aftersorting = new ArrayList<>();
		for (WebElement table2names : table2) {
			String name2 = table2names.getText();
			Aftersorting.add(name2);
		}
		Collections.sort(Aftersorting);
		System.out.println(Aftersorting);
		
		System.out.println();

		//compare both the array list
		if(sorting.equals(Aftersorting)) {
			System.out.println("Both the tables are equal");
		}
		else
			System.out.println("Both the tables are not equal");
	}

}
