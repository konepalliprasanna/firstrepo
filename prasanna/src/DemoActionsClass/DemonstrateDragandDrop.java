package DemoActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemonstrateDragandDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        Actions act = new Actions(driver);
        
        WebElement src = driver.findElement(By.id("draggable"));
        WebElement dest = driver.findElement(By.id("droppable"));
        //act.dragAndDrop(src, dest).perform();
        act.clickAndHold(src).release(dest).perform();
	}

}
