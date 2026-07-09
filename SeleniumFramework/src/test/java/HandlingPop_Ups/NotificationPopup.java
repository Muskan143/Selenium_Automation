package HandlingPop_Ups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;

public class NotificationPopup {

    public static void main(String[] args) throws Exception {

        ChromeOptions setting = new ChromeOptions();
        setting.addArguments("--disable-notifications");
        setting.addArguments("--start-maximized");
        setting.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(setting);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.easemytrip.com/");

        Thread.sleep(6000);

        // Method 1: Using Actions class
        Actions act = new Actions(driver);
        act.keyDown(Keys.ESCAPE).build().perform();
        act.keyUp(Keys.ESCAPE).build().perform();

        // Method 2: Using Robot class
        //Robot robot = new Robot();
        //robot.keyPress(KeyEvent.VK_ESCAPE);
        //robot.keyRelease(KeyEvent.VK_ESCAPE);

        Thread.sleep(7000);
        driver.quit();
    }
}