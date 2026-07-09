package HandlingFrames;

 
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://automationwithpiyush.vercel.app/frames.html");

//		get into frame using id/name
		driver.switchTo().frame("frame_d");
		
//		get into frame using index
		driver.switchTo().frame(0);
		
		driver.switchTo().frame(0);
		
//		get into frame using webelement
		WebElement jFrame = driver.findElement(By.id("frame_j"));
		driver.switchTo().frame(jFrame);
		
		WebElement secretCode = driver.findElement(By.id("secret_code"));
		secretCode.sendKeys("1234567890");
		

//		come out of those frames by jumping
		driver.switchTo().defaultContent();
		
//		get into frame b
		driver.switchTo().frame(1);
		
		
		driver.findElement(By.id("critical_check")).click();

		Thread.sleep(3000);
		driver.quit();
	}
}