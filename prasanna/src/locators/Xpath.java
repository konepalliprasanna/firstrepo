package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement element = driver.findElement(By.id("small-searchterms"));
		element.sendKeys("abc");
		//element.clear();
		//element.sendKeys("1234",Keys.ENTER);
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		driver.findElement(By.id("As")).click();
		//driver.findElement(By.xpath("(//input[@type='submit'])[2]")).submit();
		driver.findElement(By.xpath("//input[@class='button-1 search-button']")).submit();
		

	}

}
