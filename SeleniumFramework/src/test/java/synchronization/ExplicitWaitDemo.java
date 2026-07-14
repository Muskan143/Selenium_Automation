package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://automationwithpiyush.vercel.app/synchronization.html");

        // ================= EXPLICIT WAIT STARTS HERE =================

        // Create Explicit Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait until the "Unlock Input" button becomes clickable
        WebElement unlockInput = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("trigger-input")));

        // ================= EXPLICIT WAIT ENDS HERE ===================

        // Click the button
        unlockInput.click();

        System.out.println("Unlock Input button clicked successfully.");

        driver.quit();
    }
}