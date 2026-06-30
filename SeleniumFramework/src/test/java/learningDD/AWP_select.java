package learningDD;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AWP_select {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://automationwithpiyush.vercel.app/dropdown.html");
//		handle single select dropdown
		WebElement ssDD = driver.findElement(By.id("single-select"));
		Select selSingle = new Select(ssDD);
		selSingle.selectByIndex(4);
		
//		handle multi select dropdown
		WebElement msDD = driver.findElement(By.id("multi-select"));
		Select selMulti = new Select(msDD);
		selMulti.selectByIndex(3);
		selMulti.selectByVisibleText("Git");
		selMulti.selectByValue("testing");
		
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}