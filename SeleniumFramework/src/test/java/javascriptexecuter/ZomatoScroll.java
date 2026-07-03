package javascriptexecuter;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoScroll {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//		downcasting
		JavascriptExecutor jse = (JavascriptExecutor) driver;

//		navigate to url
		String url = "https://www.zomato.com/";
		jse.executeScript("window.location=arguments[0]", url);
		Thread.sleep(2000);

//		scroll to 0, 500 then add 200px more
		jse.executeScript("window.scrollTo(0,500)"); // absolute scrolling
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,700)"); // Relative scrolling
		Thread.sleep(1000);

		WebElement blinkit = driver.findElement(By.xpath("//div[text()='blinkit']"));
		
//		new Actions(driver).scrollToElement(blinkit).build().perform();
		
		jse.executeScript("arguments[0].scrollIntoView(false);", blinkit);
		
		Thread.sleep(1000);

		jse.executeScript("arguments[0].scrollIntoView(true);", blinkit);
		
		Thread.sleep(3000);
		driver.quit();
	}
}
