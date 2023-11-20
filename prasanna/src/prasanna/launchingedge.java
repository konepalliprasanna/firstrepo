package prasanna;

import org.openqa.selenium.edge.EdgeDriver;

public class launchingedge {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./selenium/msedgedriver.exe");
		EdgeDriver ref = new EdgeDriver();


	}

}
