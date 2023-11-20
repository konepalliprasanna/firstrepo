package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchcontroltoframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("https://www.makemytrip.com/");
       
        driver.switchTo().frame(0);
        Thread.sleep(1000);
        
        WebElement frame = driver.findElement(By.xpath("//div[@class='nsm7Bb-HzV7m-LgbsSe-Bz112c']"));
        
        //driver.switchTo().frame(3);
        frame.click();
        //driver.switchTo().frame(frame);
	}

}
