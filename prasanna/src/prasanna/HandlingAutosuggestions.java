package prasanna;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutosuggestions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        String data= "selenium";
       
        driver.findElement(By.name("q")).sendKeys(data);
       List<WebElement> allsuggestions = driver.findElements(By.xpath("//span[contains(text())"+ "'data'"));
       System.out.println(allsuggestions.size());
       for(WebElement suggestion:allsuggestions) {
    	   System.out.println(suggestion.getText());
       }

	}

}
