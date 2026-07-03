package javascriptexecuter;

 

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomatojs2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

 

//		downcasting
		JavascriptExecutor jse = (JavascriptExecutor) driver;

 
		String url = "https://automationwithpiyush.vercel.app/locatorsSignin.html";
//		jse.executeScript("window.location='https://automationwithpiyush.vercel.app/locatorsSignin.html'");
		jse.executeScript("window.location=arguments[0]", url);

		Thread.sleep(2000);

		WebElement un = driver.findElement(By.id("email"));
//		jse.executeScript("arguments[0].value='admin'",un);
		String usernameValue = "admin";
		jse.executeScript("arguments[1].value=arguments[0]", usernameValue, un);

		Thread.sleep(1000);
		WebElement pwd = driver.findElement(By.id("password"));
		String passwordValue = "1234567890";
		jse.executeScript("arguments[0].value=arguments[1]", pwd, passwordValue);

		WebElement checkBox = driver.findElement(By.id("terms_checkbox"));
//		checkBox.click();
		jse.executeScript("arguments[0].click();", checkBox);
		
		WebElement loginBtn = driver.findElement(By.cssSelector("button[type='submit']"));
//		loginBtn.click();

		jse.executeScript("arguments[0].click();", loginBtn);
		
		Thread.sleep(3000);
		driver.quit();
	}
}