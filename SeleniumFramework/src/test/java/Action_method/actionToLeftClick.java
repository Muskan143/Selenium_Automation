package Action_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionToLeftClick {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://automationwithpiyush.vercel.app/actions.html");

        Thread.sleep(3000);

        Actions act = new Actions(driver);

        // Locate the Left Click button
        WebElement leftClick = driver.findElement(By.id("click-icon"));

        // Perform Left Click
        act.moveToElement(leftClick).click().build().perform();

        Thread.sleep(3000);

        driver.quit();
    }
}