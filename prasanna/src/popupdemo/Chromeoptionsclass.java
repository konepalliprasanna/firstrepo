package popupdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chromeoptionsclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		option.addArguments("--incognito");
		
		option.addArguments("start-maximized");
		
		option.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(option);
		
		System.out.println("browsed is launched");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.ajio.com/");
		System.out.println("browser is navigated to ajio");
		
		driver.quit();
		System.out.println("browser is closed");
	}

}
