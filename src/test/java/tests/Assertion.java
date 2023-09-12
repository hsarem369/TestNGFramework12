package tests;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import cucumber.runtime.junit.Assertions;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.DriverUtility;

public class Assertion extends DriverUtility {

	public static WebDriver driver;

	SoftAssert softassert = new SoftAssert();
	SoftAssert softassert2 = new SoftAssert();

	@BeforeTest
	public void beforeClass() {
		WebDriverManager.chromedriver().setup();

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		chromeOptions.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(chromeOptions);
		driver.get("https://mvnrepository.com/");
	}
		
		@Test (priority = 0)
		public void verifytest0() {

			String actualTitle = driver.getTitle();
			String expectedTitle = "aqMaven Repository: Search/Browse/Explore";
			Assert.assertEquals(actualTitle, expectedTitle);
			
			
			System.out.println("hi it is hard assertions");
		
		}
	
	@Test (priority = 1)
	public void verifytest() {

		String actualTitle = driver.getTitle();
		String expectedTitle = "Maven Repository: Search/Browse/Explore";
		Assert.assertEquals(actualTitle, expectedTitle);
		
		
		System.out.println("hi it is hard assertions");
	
	}
	@Test (priority = 2)
	public void verifyTitle() {

		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Maven Repository: Search/Browse/Explore";

		// Soft assert applied to verify title
		softassert.assertEquals(ActualTitle, ExpectedTitle);

		// If failed, this line gets printed and execution is not halted

		softassert.assertAll();
		
		System.out.println("hit is soft assertions");
	}

	@Test (priority = 3)
	public void verifyElement() {
		WebElement searchIcon = driver.findElement(By.xpath("//input[@class='button']"));
		softassert2.assertEquals(true, searchIcon.isDisplayed());
		softassert2.assertAll();

		// System.out.println("Icon is displayed");
		// System.out.println("Assertion 2 is executed");

	}

	

	@Test (priority = 4)
	public void lastTest() {
		System.out.println("it is last test");
	}

	@AfterTest
	public void closedriver() {
		driver.close();
		
	}

}
