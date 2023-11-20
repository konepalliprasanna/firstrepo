package popupdemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TohandleMultipletabs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("newTabsBtn")).click();
		
		Set<String> allwindowids = driver.getWindowHandles();
		System.out.println(driver.getWindowHandles());
		String parentid = driver.getWindowHandle();
		String expectedtitle="AlertsDemo ";
		String title="Basic Controls";
		
		for(String id:allwindowids) {
			driver.switchTo().window(id);
			if(driver.getTitle().contains(title)) {
				driver.findElement(By.id("lastName")).sendKeys("ababab");
			}

		}
			
		}
		//driver.findElement(By.id("lastName")).sendKeys("ababab");
	}

