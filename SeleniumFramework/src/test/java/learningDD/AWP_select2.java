package learningDD;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AWP_select2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://automationwithpiyush.vercel.app/dropdown.html");

        // Handle Single Select Dropdown
        WebElement ssDD = driver.findElement(By.id("single-select"));
        Select selSingle = new Select(ssDD);

        selSingle.selectByIndex(5);

        List<WebElement> countries = selSingle.getOptions();

        for (WebElement i : countries) {
            System.out.println(i.getText());
        }

        Thread.sleep(2000);

        // Handle Multi Select Dropdown
        WebElement msDD = driver.findElement(By.id("multi-select"));
        Select selMulti = new Select(msDD);

        selMulti.selectByVisibleText("Python");
        selMulti.selectByVisibleText("Git");
        selMulti.selectByVisibleText("Testing");

        boolean status2 = selMulti.isMultiple();

        if (status2) {
            selMulti.deselectAll();
        }

        Thread.sleep(3000);
        driver.quit();
    }
}