package Action_method;

 

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionSlider {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://jqueryui.com/slider/");

		driver.switchTo().frame(0);

		WebElement slider = driver.findElement(By.id("slider"));

		Thread.sleep(3000);
//		hover => move => click
		Actions act = new Actions(driver);

//		act.moveToElement(slider).moveByOffset(50, 0).click().build().perform();
//		Thread.sleep(2000);
//		act.moveByOffset(-50, 0).click().perform();

//		act.moveToElement(slider).moveByOffset(50, 0).click()
//			.pause(Duration.ofSeconds(1))
//			.moveByOffset(-50, 0).click()
//			.build().perform();
		
		act.moveToElement(slider, 50, 0).click().pause(Duration.ofSeconds(1)).moveToElement(slider,-50, 0).click().build().perform();
		
		Thread.sleep(3000);
		driver.quit();
	}
}