package tests;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import core.BaseClass;

public class TestNG_Annotations extends BaseClass {
	

	@BeforeTest
	public void user_is_on_test_environment_page() {
		BaseClass.initializeDriver();
		//logger.info("first step");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("it is before suite method ******** launcing the browser******");
	}
	
	@BeforeTest
	public void beforTest() {
		System.out.println("it is before test ********** opening the webpage");
	}
	
	@BeforeGroups
	public void beforeGroups() {
		System.out.println("it is before groups *****no groups specified yet");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("it is before class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("it is before method");
	}
	
	@Test
	public void test1() {
		System.out.println("it is test method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("it is after method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("it is after Class");
	}
	
	@AfterGroups
	public void afterGroups() {
		System.out.println("it is after group");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("it is after test");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("it is after suite");
	}



	@AfterTest
	public void gracefulTearDown() {
		System.out.println("it is after test ***tear down method");
		BaseClass.tearDown();

	}

}
