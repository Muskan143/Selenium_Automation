package Takescreenshot;



import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElementScreenshot {

    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Locate the logo element
        WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));

        // Take screenshot of the WebElement
        File src = logo.getScreenshotAs(OutputType.FILE);

        // Destination path
        File dest = new File("C:\\Users\\gyane\\OneDrive\\Desktop\\Screenshot\\Logo.png");

        // Copy screenshot to destination
        FileHandler.copy(src, dest);

        System.out.println("WebElement Screenshot Taken Successfully");

        driver.quit();
    }
}
//A screenshot is used to capture the current state of the web page during test execution. 
//It is helpful for debugging failed test cases, maintaining test evidence, and generating automation reports.
/*
 *Steps to take a screenshot in Selenium
1. Convert the WebDriver object into TakesScreenshot
TakesScreenshot ts = (TakesScreenshot) driver;

Explanation:

WebDriver does not directly provide a screenshot method.
TakesScreenshot is an interface that contains the getScreenshotAs() method.
So, we typecast the driver object to TakesScreenshot.
2. Capture the screenshot
File src = ts.getScreenshotAs(OutputType.FILE);

Explanation:

getScreenshotAs() captures the current browser screen.
OutputType.FILE tells Selenium to save the screenshot as a temporary file.
The returned file is stored in the src variable.
3. Specify the destination location
File dest = new File("C:\\Users\\gyane\\OneDrive\\Desktop\\Screenshot\\Google.png");

Explanation:

A File object is created to specify where the screenshot should be saved.
Here, the screenshot will be saved as Google.png in the Screenshot folder.
4. Copy the screenshot to the destination
FileHandler.copy(src, dest);

Explanation:

The screenshot is initially stored in a temporary location.
FileHandler.copy() copies it from the temporary file (src) to the desired location (dest).
5. Print a success message
System.out.println("Screenshot Taken Successfully");

Explanation:

This simply confirms that the screenshot was saved successfully. */
 