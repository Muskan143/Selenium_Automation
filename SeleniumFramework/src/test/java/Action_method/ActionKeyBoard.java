package Action_method;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionKeyBoard {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.facebook.com/");

        Thread.sleep(3000);

        Actions act = new Actions(driver);

        // Type username
        act.sendKeys("admin").perform();

        // Select All (Ctrl + A)
        act.keyDown(Keys.CONTROL)
           .sendKeys("a")
           .keyUp(Keys.CONTROL)
           .perform();

        // Copy (Ctrl + C)
        act.keyDown(Keys.CONTROL)
           .sendKeys("c")
           .keyUp(Keys.CONTROL)
           .perform();

        // Move to Password field using Tab
        act.sendKeys(Keys.TAB).perform();

        // Paste (Ctrl + V)
        act.keyDown(Keys.CONTROL)
           .sendKeys("v")
           .keyUp(Keys.CONTROL)
           .perform();

        // Press Enter
        act.sendKeys(Keys.ENTER).perform();

        Thread.sleep(3000);

        driver.quit();
    }
}