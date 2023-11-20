package prasanna;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebelementScreenshot {

	public static void main(String[] args) throws IOException {
			System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();	
		
		driver.get("https://demowebshop.tricentis.com/");
		
		File photo = driver.findElement(By.id("small-searchterms")).getScreenshotAs(OutputType.FILE);
		String presentdateandtime=LocalDateTime.now().toString().replace(':', '-');
		FileHandler.copy(photo,new File("./errorshot/demowebshop"+presentdateandtime+".jpg"));

	}

}
