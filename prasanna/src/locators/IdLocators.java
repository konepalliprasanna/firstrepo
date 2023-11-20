package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class IdLocators {

	public static void main(String[] args) {
		System.setProperty("WebdriverDriver.Chrome.Driver", "./selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/testjava/demopage.html");
	    driver.findElement(By.id("username")).sendKeys("this is selenium");
	    
		

	}

}
