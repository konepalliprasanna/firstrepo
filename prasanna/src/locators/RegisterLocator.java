package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("abcd");
		driver.findElement(By.name("LastName")).sendKeys("1234");
		driver.findElement(By.id("Email")).sendKeys("abcd1234@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("prasanna");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("prasanna");
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).submit();
	}

}
