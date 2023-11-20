package JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JseAlertmethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();	
        
        driver.get("https://www.instagram.com/");
        
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        //jse.executeScript("alert('allow your location')");
    
        jse.executeScript("prompt('your age')");

	}

}
