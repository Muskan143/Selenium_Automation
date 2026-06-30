package learningDD;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksOfApplication {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // First site
        driver.get("https://flipkart.in/");

        List<WebElement> links1 = driver.findElements(By.tagName("a"));
        int totalLinks = links1.size();

        System.out.println("Total Links in Flipkart: " + totalLinks);

        Thread.sleep(2000);

        // Second site
        driver.get("https://amazon.in/");

        List<WebElement> links2 = driver.findElements(By.tagName("a"));
        int totalLinks2 = links2.size();

        System.out.println("Total Links in Amazon: " + totalLinks2);

        Thread.sleep(2000);
        
        //third site
        driver.get("https://www.instagram.com/");

        List<WebElement> links3 = driver.findElements(By.tagName("a"));
        int totalLinks3 = links3.size();

        System.out.println("Total Links in instagram: " + totalLinks3);

        Thread.sleep(2000);

        driver.quit();
    }
}