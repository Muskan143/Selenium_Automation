package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://automationwithpiyush.vercel.app/locatorsSignin.html");

        WebElement un = driver.findElement(
                RelativeLocator.with(By.tagName("input"))
                        .above(By.id("password"))
        );

        un.sendKeys("admin");
        Thread.sleep(3000);
		driver.quit();
    }
}