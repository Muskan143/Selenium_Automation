 package Action_method;
 
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsTohold {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://automationwithpiyush.vercel.app/actions.html");

		Thread.sleep(3000);

		Actions act = new Actions(driver);

//		WebElement rc = driver.findElement(By.id("right-click-area"));
////		act.moveToElement(rc).contextClick().build().perform();
//		act.contextClick(rc).build().perform();

		WebElement hold = driver.findElement(By.id("hold-icon"));

//		act.moveToElement(hold).clickAndHold().build().perform();
		act.clickAndHold(hold).build().perform();
		Thread.sleep(3000);
		act.release().build().perform();
		
		Thread.sleep(3000);
		driver.quit();
	}
} 