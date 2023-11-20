package popupdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JspAlertpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Alert alert = driver.switchTo().alert();
//		Thread.sleep(2000);
//		alert.accept();
		alert.dismiss();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert.getText());
		System.out.println(alert.getClass());

	}

}
