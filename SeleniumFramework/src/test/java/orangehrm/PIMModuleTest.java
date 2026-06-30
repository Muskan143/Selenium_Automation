package orangehrm;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PIMModuleTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        try {

            // Launch Browser
            driver.manage().window().maximize();

            // Open Application
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            System.out.println("Application Opened");

            // Login
            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.name("username")))
                    .sendKeys("Admin");

            driver.findElement(By.name("password"))
                    .sendKeys("admin123");

            driver.findElement(By.xpath("//button[@type='submit']"))
                    .click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//h6[contains(text(),'Dashboard')]")));

            System.out.println("PASS : Login Successful");

            // Open PIM Module
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//span[text()='PIM']")))
                    .click();

            System.out.println("PASS : PIM Module Opened");

            // Open Add Employee Page
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.linkText("Add Employee")))
                    .click();

            System.out.println("PASS : Add Employee Page Opened");

            // Enter Employee Details
            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.name("firstName")))
                    .sendKeys("Muskan");

            driver.findElement(By.name("lastName"))
                    .sendKeys("Kumar");

            System.out.println("PASS : Employee Details Entered");

            // Save Employee
            driver.findElement(By.xpath("//button[@type='submit']"))
                    .click();

            System.out.println("Save Button Clicked");

            // Wait for Personal Details Page
            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//h6")));

            System.out.println("PASS : Employee Added Successfully");

            // Open Employee List
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.linkText("Employee List")))
                    .click();

            System.out.println("PASS : Employee List Opened");

            // Search Employee
            Thread.sleep(3000);

            WebElement searchBox = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("(//input[contains(@class,'oxd-input')])[2]")));

            searchBox.sendKeys("Muskan");

            driver.findElement(By.xpath("//button[@type='submit']"))
                    .click();

            System.out.println("Search Button Clicked");

            Thread.sleep(5000);

            // Verification
            if (driver.getPageSource().contains("Muskan")) {

                System.out.println("PASS : Employee Search Successful");
                System.out.println("TEST CASE PASSED");

            } else {

                System.out.println("FAIL : Employee Not Found");
            }

        } catch (Exception e) {

            System.out.println("TEST CASE FAILED");
            e.printStackTrace();

        } finally {

            driver.quit();
        }
    }
}
//output
//Application Opened
//TEST CASE FAILED after this  time out exception
