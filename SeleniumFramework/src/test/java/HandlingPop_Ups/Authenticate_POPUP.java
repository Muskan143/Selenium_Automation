package HandlingPop_Ups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticate_POPUP {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Username = admin
        // Password = admin

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        Thread.sleep(3000);

        driver.quit();
    }
}