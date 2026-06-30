package synchronization;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_AWP {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://automationwithpiyush.vercel.app/synchronization.html");

        // Click on Start Process
        driver.findElement(By.xpath("//button[contains(text(),'START')]")).click();

        Thread.sleep(4757);

        // Click on Stop Process
        driver.findElement(By.xpath("//button[contains(text(),'STOP')]")).click();

        Thread.sleep(3000);

        driver.quit();
    }
}
//working