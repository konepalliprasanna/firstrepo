package popupdemo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticationpopup {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
		
		driver.get("https://basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
		
		Runtime.getRuntime().exec("./autoit/authentication.exe");
		
	
}
}
