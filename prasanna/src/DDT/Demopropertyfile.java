package DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demopropertyfile {

	public static void main(String[] args) throws IOException, InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		FileInputStream fis = new FileInputStream("./testdata/data.properties");
		Properties property = new Properties();
		property.load(fis);
		String value = property.getProperty("url");
		String value1 = property.getProperty("username");
		
		driver.get(value);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(value1);
		driver.findElement(By.id("Password")).sendKeys(property.getProperty("pwd"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
				

	}

}
