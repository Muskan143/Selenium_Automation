package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocators {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//		driver.get("C:/Users/User/git/basic-a1/basic-selenium-a1/html/login.html");

//		By.id()
//		type admin in username field

//		<input type="text" id="user-name">
//		WebElement username = driver.findElement(By.id("user-name"));
//		username.sendKeys("admin");

//		By.name()
//		type manager in pwd field

//		<input type="password" name="user-pass">
		WebElement password = driver.findElement(By.name("user-pass"));
		password.sendKeys("manager");

//		driver.get("https://www.facebook.com/");
//		
//		Thread.sleep(3000);

//		By.linkText()
//		By.partialLinkText()

//		<a href="https://about.meta.com/technologies/meta-pay" >Meta Pay</a>

//		driver.findElement(By.linkText("Meta Pay")).click();
//		driver.findElement(By.partialLinkText("Pay")).click();

		driver.get("https://automationwithpiyush.vercel.app/locators.html");

//		driver.findElement(By.className("primary_action")).click();

		driver.findElement(By.cssSelector("#employee-id-input")).sendKeys("12345");

		driver.findElement(By.cssSelector(".verify-status-btn")).click();

		driver.findElement(By.cssSelector(".inner-wrapper > p"));

		driver.findElement(By.cssSelector("input[data-role='admin-access']")).sendKeys("12345");

		Thread.sleep(5000);

		driver.quit();
	}
}