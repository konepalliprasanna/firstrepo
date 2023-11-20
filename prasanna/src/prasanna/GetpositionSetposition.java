package prasanna;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetpositionSetposition {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		ChromeDriver ref = new ChromeDriver();
		
		System.out.println(ref.manage().window().getPosition().x);
		System.out.println(ref.manage().window().getPosition().y);
		
		Point p = new Point(300,400);
		ref.manage().window().setPosition(p);

	}

}
