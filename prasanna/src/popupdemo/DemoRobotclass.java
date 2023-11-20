package popupdemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoRobotclass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		robo.keyPress(KeyEvent.VK_CAPS_LOCK);
		
		robo.keyPress(KeyEvent.VK_A);
		robo.keyRelease(KeyEvent.VK_A);
		robo.keyPress(KeyEvent.VK_B);
		robo.keyRelease(KeyEvent.VK_B);
	
		robo.keyPress(KeyEvent.VK_C);
		robo.keyRelease(KeyEvent.VK_C);

	}

}
