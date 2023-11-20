package popupdemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TohandleMultipleWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("newWindowsBtn")).click();
		Set<String> allwindowids = driver.getWindowHandles();
		String parentid = driver.getWindowHandle();
		String expectedtitle="XPath Practice";
		System.out.println(driver.getTitle());
		
		for(String id:allwindowids) {
			driver.switchTo().window(id);
			//System.out.println(driver.getTitle());
			if(driver.getTitle().contains(expectedtitle)) {
				break;
			}
			
		}
		driver.manage().window().maximize();
		driver.findElement(By.name("name")).sendKeys("aaaa");

	}

}
