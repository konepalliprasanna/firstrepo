package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HYRframesPractise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
//        JavascriptExecutor jse=(JavascriptExecutor)driver;
//        jse.executeScript("window.scrollTo(0,2000)");
        
        driver.switchTo().frame("frm3");
        
//        WebElement frame = driver.findElement(By.id("selectnav1"));
//        frame.click();
        
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        jse.executeScript("scrollTo(0,2000)");
        
        WebElement frame = driver.findElement(By.id("selectnav1"));
      //frame.click();

	}

}
