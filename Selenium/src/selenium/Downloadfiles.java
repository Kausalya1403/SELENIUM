package selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Downloadfiles {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chris\\OneDrive\\Documents\\chromedriver ver-94\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		// to download excel file
		//WebElement excel = driver.findElement(By.partialLinkText("Excel"));
		WebElement excel = driver.findElement(By.linkText("Download Excel"));
		excel.click();

		//to wait till the download is complete
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		//to validate the file is downloaded or not

		File location = new File("C:\\Users\\chris\\Downloads");//using file class
		File[] totalFilesInlocation = location.listFiles();  //store files in array
		for(File checkExcel : totalFilesInlocation) { //it checks all the files in the location
			if(checkExcel.getName().equals("testleaf.xlsx")) 
			{
				System.out.println("File is downloaded successfully and present in the downloads folder");
				break;
			}
		}

		// To download pdf
		WebElement pdf = driver.findElement(By.linkText("Download PDF"));
		pdf.click();
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//to take screenshot
		Thread.sleep(3000);
		TakeSnapshot(driver, "img");

		//to download text

		driver.navigate().back(); 
		WebElement text = driver.findElement(By.linkText("Download Text"));
		text.click();

		WebElement text1 = driver.findElement(By.xpath("/html/body/pre"));
		//System.out.println(text1.getText());
		String actualDownload = "You have downloaded the file.";
		String validate = text1.getText();
		if(actualDownload.equals(validate))
			System.out.println("File downloaded");
		else
			System.out.println("Not downloaded");
	}


	private static void TakeSnapshot(WebDriver driver, String string) throws IOException {
		// TODO Auto-generated method stub
		TakesScreenshot screenshot1=((TakesScreenshot)driver);
		File img = screenshot1.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(img, new File("C:\\Users\\chris\\OneDrive\\Documents\\selenium screenshots\\seleniumpics2.png"));
	}
}

