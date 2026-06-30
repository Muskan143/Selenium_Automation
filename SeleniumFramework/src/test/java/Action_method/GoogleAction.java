package Action_method;
 
 

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleAction {

    public static void main(String[] args) {

        // Launch Chrome
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Open Google
        driver.get("https://www.google.com");

        // Click Google Apps (9-dot icon)
        WebElement googleApps = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//a[@aria-label='Google apps']")));
        googleApps.click();

        // Switch to Google Apps iframe
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
                By.xpath("//iframe[contains(@src,'widget')]")));

        // Click YouTube
        WebElement youtube = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//span[text()='YouTube']")));

        youtube.click();

        // Switch back to main page
        driver.switchTo().defaultContent();

        System.out.println("YouTube opened successfully!");

        driver.quit();
    }
}