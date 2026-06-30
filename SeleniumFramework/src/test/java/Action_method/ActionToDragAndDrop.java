package Action_method;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionToDragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://automationwithpiyush.vercel.app/actions.html");

		Thread.sleep(3000);

		Actions act = new Actions(driver);

//		drag and drop
		WebElement source = driver.findElement(By.id("prod-laptop"));
		WebElement destination = driver.findElement(By.id("cart-zone"));
//		
////		approach 1 
		act.dragAndDrop(source, destination).build().perform();
//		approach 2	
	//	act.dragAndDropBy(source, 230, 0).build().perform();
		
		Thread.sleep(3000);
		driver.quit();
	}
}	
	
