    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
public class webelement {

	public class WebElementMethodsDemo {

	    public static void main(String[] args) throws InterruptedException {

	        WebDriver driver = new ChromeDriver();

	        driver.get("https://demowebshop.tricentis.com/login");

	        WebElement un = driver.findElement(By.id("Email"));

	        un.sendKeys("admin");
	        Thread.sleep(1000);

	        un.clear();

	        un.sendKeys("manager");

	        WebElement loginBtn =
	                driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));

	        // Getter Methods
	        String textCase = loginBtn.getCssValue("text-transform");
	        System.out.println(textCase);

	        loginBtn.submit();

	        Thread.sleep(3000);

	        // Validation Methods
	        if (loginBtn.isDisplayed() && loginBtn.isEnabled()) {
	            loginBtn.submit();
	        }

	        driver.findElement(By.linkText("Register")).click();

	        WebElement maleRadio =
	                driver.findElement(By.xpath("//label[contains(text(),'Male')]"));

	        maleRadio.click();

	        boolean status = maleRadio.isSelected();
	        System.out.println(status);

	        Thread.sleep(3000);
	        driver.quit();
	    }
	}
}
