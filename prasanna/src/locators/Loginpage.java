package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class Loginpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("abcd12342@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("prasanna");
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).submit();

	}

}
