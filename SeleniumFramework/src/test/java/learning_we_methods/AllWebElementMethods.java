package learning_we_methods;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllWebElementMethods {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://automationwithpiyush.vercel.app/locatorsSignin.html");

        // Locate Email Textbox
        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));

        // Locate Password Textbox
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));

        // Locate Login Button
        WebElement loginBtn = driver.findElement(By.xpath("//button"));

        // =======================
        // ACTION METHODS
        // =======================

        email.sendKeys("admin@gmail.com");
        Thread.sleep(1000);

        email.clear();
        Thread.sleep(1000);

        email.sendKeys("admin@gmail.com");

        password.sendKeys("admin123");

        // =======================
        // GETTER METHODS
        // =======================

        System.out.println("Tag Name : " + email.getTagName());

        System.out.println("Placeholder : "
                + email.getAttribute("placeholder"));

        System.out.println("Type Attribute : "
                + email.getAttribute("type"));

        System.out.println("CSS Font Size : "
                + email.getCssValue("font-size"));

        System.out.println("Entered Value : "
                + email.getAttribute("value"));

        System.out.println("Button Text : "
                + loginBtn.getText());

        Dimension size = email.getSize();
        System.out.println("Width : " + size.getWidth());
        System.out.println("Height : " + size.getHeight());

        Point location = email.getLocation();
        System.out.println("X Coordinate : " + location.getX());
        System.out.println("Y Coordinate : " + location.getY());

        Rectangle rect = email.getRect();
        System.out.println("Rectangle Width : " + rect.getWidth());
        System.out.println("Rectangle Height : " + rect.getHeight());
        System.out.println("Rectangle X : " + rect.getX());
        System.out.println("Rectangle Y : " + rect.getY());

        // =======================
        // VERIFICATION METHODS
        // =======================

        System.out.println("Email Displayed : "
                + email.isDisplayed());

        System.out.println("Email Enabled : "
                + email.isEnabled());

        System.out.println("Login Button Displayed : "
                + loginBtn.isDisplayed());

        System.out.println("Login Button Enabled : "
                + loginBtn.isEnabled());

        // =======================
        // click()
        // =======================

        loginBtn.click();

        Thread.sleep(3000);

        driver.quit();
    }
}