package prasanna;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countingthelinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demowebshop.tricentis.com/");
        List<WebElement> alllinks = driver.findElements(By.tagName("a"));
        
        System.out.println(alllinks.size());
        for(WebElement link:alllinks) {
        	//System.out.println(link.getText());
        	System.out.println(link.getAttribute("href"));
        	
        }
        driver.quit();
	
	
	}

}
