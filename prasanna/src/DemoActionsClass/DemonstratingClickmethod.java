package DemoActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemonstratingClickmethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
         driver.get("https://demowebshop.tricentis.com/");
        Actions act = new Actions(driver);
        WebElement element = driver.findElement(By.linkText("Log in"));
        act.moveToElement(element).click().perform();
       // Thread.sleep(1000);
      // act.click(element).perform();

	}

}
