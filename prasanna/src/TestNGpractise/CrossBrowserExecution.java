package TestNGpractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserExecution {
	@Test
	@Parameters("browser")
	public void cbt(String browser) {
		if(browser.equals("chrome")) {
			System.out.println("chrome is launched");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else {
			System.out.println("edge is launched");
			
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
	}

}
