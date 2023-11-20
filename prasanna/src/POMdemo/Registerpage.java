package POMdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerpage {
	public Registerpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText="Register")
	private WebElement register;
	
	@FindBy(id="gender-female")
	private WebElement radiobutton;
	
	public WebElement getRadiobutton() {
		return radiobutton;
	}

	@FindBy(id="FirstName")
	private WebElement firstnametb;
	
	@FindBy(id="LastName")
	private WebElement lastnametb;
	
	@FindBy(id="Email")
	private WebElement emailtb;
	
	@FindBy(id="Password")
	private WebElement passwordtb;
	
	@FindBy(id="ConfirmPassword")
	private WebElement confirmpasswordtb;
	
	@FindBy(id="register-button")
	private WebElement registerbuttontb;

	

	public WebElement getRegister() {
		return register;
	}

	public WebElement getFirstnametb() {
		return firstnametb;
	}

	public WebElement getLastnametb() {
		return lastnametb;
	}

	public WebElement getEmailtb() {
		return emailtb;
	}

	public WebElement getPasswordtb() {
		return passwordtb;
	}

	public WebElement getConfirmpasswordtb() {
		return confirmpasswordtb;
	}

	public WebElement getRegisterbuttontb() {
		return registerbuttontb;
	}
	
	
}
