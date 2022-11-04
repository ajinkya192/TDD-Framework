package sdet.loginpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class LoginPage extends TestBase{
	
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(css=".btn.btn-small")
	WebElement loginbtn;
	
	

	public void Login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
	}
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

}
