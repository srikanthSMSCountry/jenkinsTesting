package jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {

	public static WebDriver driver;
	public static String userDirectory;

	@Test
	public void fun() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", userDirectory + "\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		Thread.sleep(5000);
	}
}
