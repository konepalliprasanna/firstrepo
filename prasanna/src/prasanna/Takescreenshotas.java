package prasanna;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takescreenshotas {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		
		driver.get("https://www.instagram.com/");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File photo = ts.getScreenshotAs(OutputType.FILE);
		File file = new File("./errorshot/insta.png");
		photo.renameTo(file);

	}

}
