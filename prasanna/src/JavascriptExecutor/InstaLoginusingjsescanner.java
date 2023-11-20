package JavascriptExecutor;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaLoginusingjsescanner {

	public static void main(String[] args) throws InterruptedException {
		
		 Scanner scan =new Scanner(System.in);
	        System.out.println("enter the username");
	        String data = scan.nextLine();
	        System.out.println("enter the passward");
	        String data1 = scan.nextLine();
	        
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.instagram.com/");
        
        //Scanner scan =new Scanner(System.in);
        //System.out.println("enter the username");
        //String data = scan.nextLine();
        //System.out.println("enter the passward");
        //String data1 = scan.nextLine();
        
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        WebElement element = driver.findElement(By.name("username"));
        System.out.println(jse.executeScript("arguments[0].value='"+data+"'", element));
        WebElement element1=driver.findElement(By.name("password"));
        System.out.println(jse.executeScript("arguments[0].value='"+data1+"'", element1));
        WebElement button=driver.findElement(By.xpath("//div[text()='Log in']"));
        
       // System.out.println(jse.executeScript("arguments[0].value='"+data+"'", element));
        //System.out.println(jse.executeScript("arguments[0].value='"+data1+"'", element1));
        //Thread.sleep(2000);
        
        jse.executeScript("arguments[0].click()", button);

	}

}
