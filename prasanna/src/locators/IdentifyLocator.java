package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		//driver.findElement(By.id("Email")).sendKeys("prasannakonepalli@gmail.com");
		//driver.findElement(By.name("Password")).sendKeys("prasu@123");
		//driver.findElement(By.className("login-button")).click();
		driver.findElement(By.tagName("a"));
		

	}

}
