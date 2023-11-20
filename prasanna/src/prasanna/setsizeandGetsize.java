package prasanna;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class setsizeandGetsize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		ChromeDriver ref = new ChromeDriver();
		
		System.out.println(ref.manage().window().getSize().height);
		System.out.println(ref.manage().window().getSize().width);
		
		Dimension d = new Dimension(500,300);
		ref.manage().window().setSize(d);
		
	}

}
