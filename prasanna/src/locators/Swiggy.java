package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		driver.findElement(By.id("mobile")).sendKeys("abcde");
		driver.findElement(By.name("name")).sendKeys("prasanna");
		driver.findElement(By.name("email")).sendKeys("prasannakonepalli@gmail.com");
		driver.findElement(By.linkText("")).click();

	}

}
 