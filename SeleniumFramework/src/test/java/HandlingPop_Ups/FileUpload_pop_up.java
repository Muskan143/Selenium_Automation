package HandlingPop_Ups;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_pop_up {

    public static void main(String[] args) {

        // Launch Chrome Browser
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open the local HTML file
        driver.get("file:///C:/Users/gyane/eclipse-workspace/HTMLProject/src/FileUpload.html");

        // Locate the file upload element
        WebElement uploadFile = driver.findElement(By.cssSelector("input[type='file']"));

        // Upload the file (Change the path according to your system)
        uploadFile.sendKeys("C:\\Users\\gyane\\Downloads\\Resume.pdf");

        // Wait for 5 seconds to see the uploaded file
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}