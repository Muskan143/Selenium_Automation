package learning_we_methods;

 import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Navigation {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/");
//		get will wait until the page loads
		
		
		driver.navigate().to("https://www.instagram.com/");
//		navigate will not wait until the page loads

		
		driver.navigate().back();

		
		driver.navigate().forward();

		
		driver.navigate().refresh();
		
		
		String xUrl = "https://www.x.com/";
		URL url = new URL(xUrl);
		driver.navigate().to(url);
		
		driver.quit();
		
		
	}
}