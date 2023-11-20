package prasanna;

import org.openqa.selenium.chrome.ChromeDriver;
public class maximizingandfullscreen {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		ChromeDriver ref = new ChromeDriver();
		ref.manage().window().maximize();
		
		ref.get("https://www.instagram.com");

	}

}
