package prasanna;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshotofelement {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();	
		
		driver.get("https://demowebshop.tricentis.com/");
		
		File photo = driver.findElement(By.xpath("(//input[@type='button'])[3]")).getScreenshotAs(OutputType.FILE);
		File destination = new File("./webScreenshots/element1.png");
		
		FileUtils.copyFile(photo, destination);

	}

}
