package JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollingintoview {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("https://demowebshop.tricentis.com/");
        WebElement element=driver.findElement(By.xpath("(//input[@type='button'])[3]"));
        JavascriptExecutor jse= (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].scrollIntoView(false)", element);
        
      //strong[text()='Featured products']
	}

}
