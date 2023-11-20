package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementmethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
		System.out.println(element.getTagName());
		System.out.println(element.getAttribute("class"));
		System.out.println(element.getAttribute("placeholder"));
		System.out.println(element.getCssValue("font-size"));
		element.sendKeys("mobiles");
		//driver.findElement(By.xpath("//input[@type='submit']")).submit();
		Thread.sleep(2000);
		element.clear();
		element.sendKeys("laptop");
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		WebElement elements = driver.findElement(By.linkText("Amazon miniTV"));
		System.out.println(elements.getTagName());
		System.out.println(elements.getAttribute("class"));
		System.out.println(elements.getText());
		System.out.println(elements.getCssValue("color"));
		System.out.println(elements.getCssValue("height"));
		
		
		
		
	}

}
