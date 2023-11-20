package POMdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
//		
//		public Loginpage(WebDriver driver) {
//			PageFactory.initElements(driver,this);
//		}

		public Loginpage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}

		@FindBy(linkText="Log in")
		
		private WebElement loginlink;
		

		@FindBy(id="Email")
		private WebElement mailtb;
		
		@FindBy(id="Password")
		private WebElement passwordtb;
		
		@FindBy(xpath="//input[@value='Log in']")
		private WebElement loginbutton;
		
		public WebElement getLoginlink() {
			return loginlink;
		}

		public WebElement getMailtb() {
			return mailtb;
		}

		public WebElement getPasswordtb() {
			return passwordtb;
		}

		public WebElement getLoginbutton() {
			return loginbutton;
		}
}
