package prasanna;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demonstratinggetmethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		ChromeDriver ref = new ChromeDriver();
		ref.get("https://www.instagram.com");
		String expectedTitle = "Instagram";
		String actualTitle = ref.getTitle();
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("the testcase is passed");
		}
		else {
			System.out.println("the testcase is failed");
		}
		System.out.println(ref.getCurrentUrl());
		System.out.println("**********");
		System.out.println(ref.getPageSource());

	}

}
