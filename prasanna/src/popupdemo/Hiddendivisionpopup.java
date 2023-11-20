package popupdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddendivisionpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
//		driver.get("https://demoapps.qspiders.com/hidden");
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Hidden division']")).click();
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		
		

	}

}
