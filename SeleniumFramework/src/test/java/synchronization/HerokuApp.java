package synchronization;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HerokuApp {

    public static void main(String[] args) {

        // Launch Browser
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Open Application
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        // Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Click Remove Button
        driver.findElement(By.xpath("//button[text()='Remove']")).click();

        // Wait until "It's gone!" message appears
        wait.until(ExpectedConditions.textToBePresentInElementLocated(
                By.id("message"), "It's gone!"));

        System.out.println("Checkbox removed successfully");

        // Click Add Button
        driver.findElement(By.xpath("//button[text()='Add']")).click();

        // Wait until "It's back!" message appears
        wait.until(ExpectedConditions.textToBePresentInElementLocated(
                By.id("message"), "It's back!"));

        System.out.println("Checkbox added successfully");

        // Verify Checkbox is Present
        boolean status = driver.findElement(
                By.xpath("//input[@type='checkbox']")).isDisplayed();

        System.out.println("Checkbox Displayed: " + status);

        // Close Browser
        driver.quit();
    }
}
//output
// Checkbox removed successfully
//Checkbox added successfully
//Checkbox Displayed : true

 