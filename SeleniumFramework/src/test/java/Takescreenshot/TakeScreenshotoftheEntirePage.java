package Takescreenshot;

 
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshotoftheEntirePage {

    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.google.com");

        // Screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;

        File src = ts.getScreenshotAs(OutputType.FILE);

        File dest = new File("C:\\Users\\gyane\\OneDrive\\Desktop\\Screenshot\\Google.png");

        FileHandler.copy(src, dest);

        System.out.println("Screenshot Taken Successfully");

        driver.quit();
    }
}