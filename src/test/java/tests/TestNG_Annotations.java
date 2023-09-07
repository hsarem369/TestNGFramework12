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



public class TestNG_Annotations {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("it is before suite ");

	}

	@BeforeTest
	public void beforeTest() {

		System.out.println("it is before test");

	}

	@BeforeGroups
	public void beforeGroups() {

		System.out.println("it is before groups method");
	}

	@BeforeClass
	public void beforeClass() {

	}
	@BeforeMethod
	public void beforeMethod() {

		System.out.println("it is before method ");
	}

	@Test
	public void login() {
		System.out.println("it is login method");

	}
	
	@Test
	public void test2() {
		System.out.println("it is test 2");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("it is after method");
	}
	
	@AfterGroups
	public void afterGroups() {
		System.out.println("it is after groups method");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("it is after class");
	}

	@AfterMethod
	public void afterMethod() {

		System.out.println("it is after method ");
	}

	@AfterSuite
	public void afterSuite() {

		System.out.println("it is after suite method");

	}
}
