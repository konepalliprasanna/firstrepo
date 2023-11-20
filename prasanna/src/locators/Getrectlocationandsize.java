package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getrectlocationandsize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement element = driver.findElement(By.id("vote-poll-1"));
		System.out.println(" value of x is:"+element.getLocation().x);
		System.out.println(" value of y is:"+element.getLocation().y);
		System.err.println("**********");
		System.out.println("height :"+element.getSize().height);
		System.out.println("width:"+element.getSize().width);
		System.err.println("***************");
		System.out.println(" value of x is:"+element.getRect().x);
		System.out.println(" value of y is:"+element.getRect().y);
		System.out.println("height :"+element.getRect().height);
		System.out.println("height :"+element.getRect().width);
		

	}

}
