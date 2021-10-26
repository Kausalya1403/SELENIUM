package activites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Differentlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to open google
		long starttime = System.currentTimeMillis();
		System.out.println("google start-time : " +starttime);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chris\\OneDrive\\Documents\\chromedriver ver-94\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.google.com/");
		driver.close();
		long closetime = System.currentTimeMillis();
		System.out.println("google close-time : " +closetime);
		long totaltime = closetime-starttime;
		System.out.println("google total-time = " +totaltime);
		
		//open youtube
		System.out.println();
		long starttime1 = System.currentTimeMillis();
		System.out.println("youtube start-time : " +starttime1);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chris\\OneDrive\\Documents\\chromedriver ver-94\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver(); 
		driver1.get("https://www.youtube.com/");
		driver1.close();
		long closetime1 = System.currentTimeMillis();
		System.out.println("youtube close-time : " +closetime1);
		long totaltime1 = closetime1-starttime1;
		System.out.println("youtube total-time = " +totaltime1);
		
		
		//to open testleaf
		System.out.println();
		long starttime2 = System.currentTimeMillis();
		System.out.println("test-leaf start-time : " +starttime2);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chris\\OneDrive\\Documents\\chromedriver ver-94\\chromedriver.exe");
		WebDriver driver2 = new ChromeDriver(); 
		driver2.get("http://www.leafground.com/");
		driver2.close();
		long closetime2 = System.currentTimeMillis();
		System.out.println("test-leaf close-time : " +closetime2);
		long totaltime2 = closetime2-starttime2;
		System.out.println("test-leaf total-time = " +totaltime2);
		
        long total = totaltime+totaltime1+totaltime2;
        System.out.println(total);
	}

}
