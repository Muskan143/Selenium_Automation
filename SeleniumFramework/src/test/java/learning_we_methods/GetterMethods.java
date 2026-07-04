package learning_we_methods;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetterMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
//		fully qualified path => InvalidArgumentException
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
//		String sourceCode = driver.getPageSource();
//		System.out.println(sourceCode);
		
//		driver.close();
		
//		size
		Dimension dim = driver.manage().window().getSize();
		System.out.println(dim);
		
		driver.manage().window().setSize(new Dimension(500, 500));
		
//		location
		Point pt = driver.manage().window().getPosition();
		System.out.println(pt);
		
		driver.manage().window().setPosition(new Point(100, 100));
		
		Thread.sleep(5000);
		
		
		driver.quit();
	}
}