package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import core.BaseClass;
import pageObjects.LoginPageObjects;

public class LoginTest extends BaseClass{
	
	LoginPageObjects object;
	
	@BeforeTest
	public void beforeTest() {
		
		BaseClass.initializeDriver();
		
		logger.info("initize the driver");
	}
	
	@Test
	public void login() {
		object = new LoginPageObjects();
		
		object.clickMyAccount();
		
		logger.info("user is clicking my account");
		object.clickLogin();
		
		object.enterEmail(getUserName());
		object.enterPassword(getPassword());
		object.clickLoginBttn();
		
	}
	
	@AfterTest
	public void afterTest() {
		
		BaseClass.tearDown();
	}

}
