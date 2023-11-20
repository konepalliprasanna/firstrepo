package POMdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTestscript {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Registerpage page = new Registerpage(driver);
		page.getRegister().click();
		page.getRadiobutton().click();
		page.getFirstnametb().sendKeys("prasanna");
		page.getLastnametb().sendKeys("konepalli");
		page.getEmailtb().sendKeys("aacdef@gmail.com");
		page.getPasswordtb().sendKeys("Prasanna@12");
		page.getConfirmpasswordtb().sendKeys("Prasanna@12");
		page.getRegisterbuttontb().click();
	}

}
