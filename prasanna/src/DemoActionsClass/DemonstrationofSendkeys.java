package DemoActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemonstrationofSendkeys {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demowebshop.tricentis.com/");
        Actions act = new Actions(driver);
       WebElement element = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
      
       // act.moveToElement(element).sendKeys("computers").perform();
        act.sendKeys(element, "computers").perform();

	}

}
