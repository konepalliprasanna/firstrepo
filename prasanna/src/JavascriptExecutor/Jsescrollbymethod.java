package JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jsescrollbymethod {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();	
        
        driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(2000);
        
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        //jse.executeScript("scrollBy(0,-300)");
        jse.executeScript("scrollTo(0,300)");
        //jse.executeScript("scrollBy(0,document.body.scrollHeight)");
        //jse.executeScript("scrollTo(0,document.body.scrollHeight)");

	}

}
