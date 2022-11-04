package sdet.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import sdet.loginpage.LoginPage;
import testbase.TestBase;

public class LoginPageTest extends TestBase {
	
	LoginPage loginpage;
	
	@BeforeMethod
	public void setup() {
		Initialization();
		loginpage = new LoginPage();
	}
	
	@Test
	public void ValidateLogin() {
	
	loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void closeResources() {
		driver.close();
	}
}
