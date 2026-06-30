

package learning_we_methods;

 

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWebElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://automationwithpiyush.vercel.app/locatorsSignin.html");

//		action methods 
		WebElement un = driver.findElement(By.id("email"));
		un.sendKeys("admin");
		Thread.sleep(1000);
		un.clear();
		un.sendKeys("manager");

		WebElement loginBtn = driver.findElement(By.xpath("//button[contains(@id,'u_0_5_')]"));

//		getter methodsbra
		String tagOfLogin = loginBtn.getTagName();
		String idOfLogin = loginBtn.getAttribute("id");
		String textCase = loginBtn.getCssValue("text-transform");
		String vtOfLoginBtn = loginBtn.getText();

		Dimension dim = loginBtn.getSize();
		Point pt = loginBtn.getLocation();

		Rectangle rect = loginBtn.getRect();

		System.out.println(tagOfLogin);
		System.out.println(idOfLogin);
		System.out.println(textCase);
		System.out.println(vtOfLoginBtn);

		System.out.println(dim);
		System.out.println(pt);

		System.out.println(rect.getWidth());
		System.out.println(rect.getHeight());
		System.out.println(rect.getDimension());
		System.out.println(rect.getX());
		System.out.println(rect.getY());
		System.out.println(rect.getPoint());

		if (loginBtn.isDisplayed() && loginBtn.isEnabled()) {
			loginBtn.submit();
		}

		driver.findElement(By.linkText("Register")).click();

		WebElement maleRadio = driver.findElement(By.xpath("//label[contains(text(), 'Male')]/input"));

//		verification
		if (maleRadio.isDisplayed() && maleRadio.isEnabled()) {
			maleRadio.click();
		}

		if (maleRadio.isSelected()) {
			System.out.println("Radio button for male is clicked...");
		}

		Thread.sleep(3000);
		driver.quit();
	}
}