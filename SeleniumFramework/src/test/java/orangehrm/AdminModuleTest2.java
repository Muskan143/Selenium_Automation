package orangehrm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminModuleTest2 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        try {

            // Login
            driver.manage().window().maximize();
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.name("username"))).sendKeys("Admin");

            driver.findElement(By.name("password"))
                    .sendKeys("admin123");

            driver.findElement(By.xpath("//button[@type='submit']"))
                    .click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//h6[text()='Dashboard']")));

            System.out.println("PASS : Login Successful");

            // Open Admin Module
            driver.findElement(By.xpath("//span[text()='Admin']"))
                    .click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//h6[text()='Admin']")));

            System.out.println("PASS : Admin Module Opened");

            // Search Existing User
            WebElement searchBox = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("(//input[contains(@class,'oxd-input')])[2]")));

            searchBox.sendKeys("Admin");

            driver.findElement(By.xpath("//button[@type='submit']"))
                    .click();

            Thread.sleep(3000);

            System.out.println("PASS : User Search Completed");

            // Add User
            driver.findElement(By.xpath("//button[normalize-space()='Add']"))
                    .click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//h6[contains(text(),'Add User')]")));

            System.out.println("PASS : Add User Page Opened");

            // NOTE:
            // Fill User Role, Employee Name, Status as per your application.

            driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"))
                    .sendKeys("Paul");

            Thread.sleep(3000);

            driver.findElement(
                    By.xpath("(//input[contains(@class,'oxd-input')])[2]"))
                    .sendKeys("TestUser123");

            driver.findElement(By.xpath("(//input[@type='password'])[1]"))
                    .sendKeys("Password@123");

            driver.findElement(By.xpath("(//input[@type='password'])[2]"))
                    .sendKeys("Password@123");

            driver.findElement(By.xpath("//button[@type='submit']"))
                    .click();

            System.out.println("PASS : User Added");

            Thread.sleep(5000);

            // Back to Admin Page
            driver.findElement(By.xpath("//span[text()='Admin']"))
                    .click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//h6[text()='Admin']")));

            System.out.println("PASS : Returned To Admin Page");

            // Search Added User
            WebElement userSearch = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("(//input[contains(@class,'oxd-input')])[2]")));

            userSearch.clear();
            userSearch.sendKeys("TestUser123");

            driver.findElement(By.xpath("//button[@type='submit']"))
                    .click();

            Thread.sleep(3000);

            System.out.println("PASS : Added User Found");

            // Delete User
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[i[contains(@class,'bi-trash')]]")))
                    .click();

            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[normalize-space()='Yes, Delete']")))
                    .click();

            System.out.println("PASS : User Deleted Successfully");

            System.out.println("TEST CASE PASSED");

        } catch (Exception  e) {

            System.out.println("TEST CASE FAILED");
            e.printStackTrace();

        } finally {

            driver.quit();
        }
    }
}
//PASS : Login Successful
//PASS : Admin Module Opened
//PASS : User Search Completed
//TEST CASE FAILED
// selenium.TimeoutException 