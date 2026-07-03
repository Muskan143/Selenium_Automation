package javascriptexecuter;


 

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JDK {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.oracle.com/java/technologies/javase-jdk24-doc-downloads.html");

		WebElement link = driver.findElement(By.linkText("jdk-24.0.2_doc-all.zip"));
		link.click();

		WebElement button = driver.findElement(By.linkText("Download jdk-24.0.2_doc-all.zip"));
//		button.click();

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", button);
		
		Thread.sleep(3000);
		driver.quit();
	}
}