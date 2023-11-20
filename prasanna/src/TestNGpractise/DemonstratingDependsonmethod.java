package TestNGpractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemonstratingDependsonmethod {
	
	@Test()
	public void login() 
	{
		System.out.println("login page");
	}

	@Test(dependsOnMethods="login")
	public void home() 
	{
		System.out.println("home page");
	}
	@Test(dependsOnMethods="home")
	public void logout() {
		System.out.println("logout page");
	}
	
//	@Test()
//	public void browser() {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.quit();
//	}
}
