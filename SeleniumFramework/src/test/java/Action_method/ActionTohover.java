package Action_method;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionTohover {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://automationwithpiyush.vercel.app/actions.html");

		Thread.sleep(3000);

		Actions act = new Actions(driver);

//		hover
		WebElement hover = driver.findElement(By.xpath("//button[contains(text(), 'Hover')]"));
		act.moveToElement(hover).perform();
		
		Thread.sleep(3000);
		driver.quit();
	}
}	
	
