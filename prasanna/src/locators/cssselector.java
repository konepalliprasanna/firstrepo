package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.cssSelector("input[id='small-searchterms']")).sendKeys("computers");
		driver.findElement(By.cssSelector("input[id='FirstName']")).sendKeys("prasanna");
		driver.findElement(By.cssSelector("input[name='LastName']")).sendKeys("konepalli");
		driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("prasannakonepalli@gmail.com");
		driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("123456");
		driver.findElement(By.cssSelector("input[id='ConfirmPassword']")).sendKeys("123456");
		driver.findElement(By.cssSelector("input[id='register-button']")).click();

	}

}
