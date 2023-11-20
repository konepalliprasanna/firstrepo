package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeTask {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("https://www.tripodeal.com/hotels");
      
        
        driver.switchTo().frame(0);
        driver.findElement(By.name("destination")).sendKeys("Hotel Santika Bandung");
    
      // Thread.sleep(2000);
       
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        
        driver.switchTo().defaultContent();
        
        driver.findElement(By.linkText("Kerala")).click();
	
   	}

}
