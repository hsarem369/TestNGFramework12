package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import core.BaseClass;
import pageObjects.LoginPageObjects;

public class LoginSteps_Simple extends BaseClass {
	LoginPageObjects loginObj;

	@BeforeTest
	public void user_is_on_test_environment_page() {
		BaseClass.initializeDriver();
	//	logger.info("before this is running");
	}

	@Test
	public void loginTestPage() {
		loginObj = new LoginPageObjects();

		loginObj.clickMyAccount();
		loginObj.clickLogin();
		loginObj.enterEmail(getUserName());
		loginObj.enterPassword(getPassword());
		loginObj.clickLoginBttn();
	

	}

	@AfterTest
	public void gracefulTearDown() {
		//logger.info("after test is running");
		BaseClass.tearDown();

	}

}
