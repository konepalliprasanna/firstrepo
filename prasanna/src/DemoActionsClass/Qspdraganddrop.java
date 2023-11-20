package DemoActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Qspdraganddrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("https://demoapps.qspiders.com/dragDrop");
        Actions act = new Actions(driver);
        
     WebElement src = driver.findElement(By.xpath("//div[@class='item bg-red-200 p-2 my-2 border-[1px] rounded']"));
     WebElement dest = driver.findElement(By.xpath("//div[@class='item  h-8']"));
     act.dragAndDrop(src, dest).perform();
     
     WebElement src1 = driver.findElement(By.xpath("//div[text()='Mango']"));
     WebElement dest1 = driver.findElement(By.xpath("//div[@class='item  h-8']"));
     act.dragAndDrop(src1, dest1).perform();
     
    WebElement src2 = driver.findElement(By.xpath("//div[text()='Banana']"));
    WebElement dest2 = driver.findElement(By.xpath("//div[@class='item  h-8']"));
    act.dragAndDrop(src2, dest2).perform();
    
    WebElement src3 = driver.findElement(By.xpath("//div[text()='Guava']"));
    WebElement dest3 = driver.findElement(By.xpath("//div[@class='item  h-8']"));
    act.dragAndDrop(src3, dest3).perform();
	}

}
