package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabledanddisplayedmethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/account/login?signup=true&ret=/");
		WebElement element = driver.findElement(By.xpath("//span[text()='CONTINUE']"));
		System.out.println(element.isEnabled());
		System.out.println(element.isDisplayed());
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("2565865193");
		System.out.println(element.isSelected());
	}

}
