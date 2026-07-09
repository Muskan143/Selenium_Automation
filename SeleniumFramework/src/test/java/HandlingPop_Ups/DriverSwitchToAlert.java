package HandlingPop_Ups;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSwitchToAlert {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://automationwithpiyush.vercel.app/popups.html");

        Thread.sleep(5000);

        driver.switchTo().alert().sendKeys("krishna ji");
        driver.switchTo().alert().accept();

        Thread.sleep(3000);
        driver.quit();
    }
}