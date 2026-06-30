package orangehrm;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchUserTest {

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

            // Search User
            driver.findElement(
                    By.xpath("(//input[contains(@class,'oxd-input')])[2]"))
                    .sendKeys("Admin");

            driver.findElement(By.xpath("//button[@type='submit']"))
                    .click();

            Thread.sleep(3000);

            // Verify Search Result
            boolean userFound = driver.getPageSource().contains("Admin");

            if(userFound) {
                System.out.println("PASS : User Search Successful");
            } else {
                System.out.println("FAIL : User Not Found");
            }

        } catch (Exception e) {

            System.out.println("FAIL : Test Case Failed");
            e.printStackTrace();

        } finally {

            driver.quit();
        }
    }
}

//output
//PASS : Login Successful
//PASS : Admin Module Opened
//PASS : User Search Successful