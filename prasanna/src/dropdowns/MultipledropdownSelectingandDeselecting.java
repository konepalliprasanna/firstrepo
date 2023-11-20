package dropdowns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipledropdownSelectingandDeselecting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("file:///C:/Users/Manasa%20konepalli/Downloads/sampledropdown.html");
        
       WebElement dropdown = driver.findElement(By.id("multiple"));
       Select sel=new Select(dropdown);
       
       sel.selectByValue("1");
       Thread.sleep(2000);
       sel.selectByIndex(2);
       Thread.sleep(2000);
       sel.selectByVisibleText("sql");
       
       Thread.sleep(2000);
       sel.deselectByIndex(0);
       Thread.sleep(2000);
       sel.deselectByValue("4");
       Thread.sleep(2000);
       sel.deselectByVisibleText("manual");
       //sel.deselectAll();

	}

}
