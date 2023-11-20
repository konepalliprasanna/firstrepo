package JavascriptExecutor;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enteringdataandclickingelement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demowebshop.tricentis.com/");
        
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the data");
        String data = scan.nextLine();
        
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        //String data = "abcde";
        
      WebElement searchstore= driver.findElement(By.id("small-searchterms"));
      WebElement button= driver.findElement(By.xpath("//input[@value='Search']"));
      
      System.out.println(jse.executeScript("arguments[0].value='"+data+"'",searchstore));
      Thread.sleep(2000);
      jse.executeScript("arguments[0].click()", button);
      
      
      

	}

}
