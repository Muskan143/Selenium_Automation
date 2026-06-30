package Action_method;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionToRightclick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://automationwithpiyush.vercel.app/actions.html");

		Thread.sleep(3000);

		Actions act = new Actions(driver);

	     WebElement rightclick = driver.findElement(By.id("right-click-area"));
		act.moveToElement(rightclick).contextClick().build().perform();
	//   act.contextClick(rightclick).build().perform();

		
		Thread.sleep(3000);
		driver.quit();
	}
	
}
