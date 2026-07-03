package Takescreenshot;

 

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Swiggyss {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://facebook.com/");
		
		Thread.sleep(3000);
		
//		1> downcasting
		TakesScreenshot tks = (TakesScreenshot) driver;
		
//      2> take the ss in file format
		File source = tks.getScreenshotAs(OutputType.FILE);
		
//		how to get path of file
//		right click => properties => copy the path
//		/basic-selenium-a1/errorShots/ss1.png
//		modify it to
//		./errorShots/ss1.png   (. means project level)

//      3> create the java representation object of the physical file
		File destination = new File("./errorShots/ss2.png");
		
//		4> copy paste
		FileHandler.copy(source, destination);
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}