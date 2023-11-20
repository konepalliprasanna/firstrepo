package popupdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jspconfirmpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/alert/confirm");
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
//		alert.accept();
		alert.dismiss();
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());

	}

}
