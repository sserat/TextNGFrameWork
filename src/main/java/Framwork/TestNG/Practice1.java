package Framwork.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Practice1 {

	
	// go to the app > shopping cart > check to see if "continue" btn is didplayed
	//I want to login to the app in 3 different test cases:
	//1. with correct user and password
	//2. with incorrect user and correct password
	//3. with correct correct user and incorrect pass
	//4. with incorrect user and password
	
	WebDriver driver;

	@BeforeMethod
	public void setEnvironment() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		
	}
		public void testLogIn1() {
		driver.get("https://www.tekschoolofamerica.com/test-environment/");
		driver.findElement(By.xpath("//span[text() = 'Shopping Cart']")).click();
		boolean btn = driver.findElement(By.xpath("//a [text ()= 'Continue']")).isDisplayed();
		Assert.assertTrue(btn);
		
		
		@Test (invocationCount = 1, priority = 1)
		public void testLogIn2() {
			driver.get("https://www.tekschoolofamerica.com/test-environment/");
		
		
		
		
		
		
}
}