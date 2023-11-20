package JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jserefreshmethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();	
        
        driver.get("https://www.instagram.com/");
        
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        Thread.sleep(2000);
        jse.executeScript("history.go");

	}

}
