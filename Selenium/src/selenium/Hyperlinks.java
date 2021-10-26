package selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chris\\OneDrive\\Documents\\chromedriver ver-94\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");

		//By clicking this link we are going to home page
		/*WebElement link = driver.findElement(By.linkText("Go to Home Page"));
		link.click();*/

		//by Partial link text
		WebElement partiallink= driver.findElement(By.partialLinkText("Home Page"));
		partiallink.click();

		//to get the url which is linked to the particular text
		driver.navigate().back();
		WebElement url = driver.findElement(By.linkText("Find where am supposed to go without clicking me?"));
		String URL= url.getAttribute("href");
		System.out.println(URL);

		//To go the home page with same name

		WebElement page = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/a"));
		page.click();
		//WebElement page=driver.findElement(By.cssSelector("color:#CC0000"));
		//page.click();	


		//to verify link is broken

		driver.navigate().back(); // earlier it was in home page 

		WebElement broken = driver.findElement(By.partialLinkText("Verify am I broken?"));
		broken.click();

		String result = driver.getTitle();
		if (result.contains("404")) {
			System.out.println("Link is broken");
		}
		else {
			System.out.println("Link is not broken");
		}


		// To count number of links present on particular page

		driver.navigate().back();
		List<WebElement> count = driver.findElements(By.tagName("a"));
		System.out.println(count.size());

		// To display all the links/url present in that page using ITERATOR interface

		String urllink;
		int num = 0;
		Iterator<WebElement> i = count.iterator();
		while(i.hasNext())
		{
			urllink = i.next().getAttribute("href");
			System.out.println(urllink);
			num++;
		
		}
		System.out.println("your total links are: " +num);

		//to display all the url/link using for EACH loop
		
		int t =0;
		for (WebElement b : count) // b is like int i = 0
		{
			t++;
			System.out.println(t);
			System.out.println( "link text = " +b.getText());
			System.out.println("href value = " +b.getAttribute("href"));
			
		}

	}

}
