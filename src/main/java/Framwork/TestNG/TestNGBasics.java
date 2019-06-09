package Framwork.TestNG;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNGBasics {
	
	@BeforeSuite
	public void testsuite () {
		System.out.println("1 . BeforeSuite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("2 . BeforeTest");
		
	}
	
	@BeforeClass
	public void beforeClass () {
		System.out.println("3 . BeforeClass");
		
	}
	
	@BeforeMethod
	public void beforeMethod () {
		System.out.println("4 . BeforeMethod");
		
	}
	
	@Test
	public void testCase() { 
		System.out.println("5 . Test");
 
	}
	
	@AfterMethod
	public void afterMethod () {
		
	}
	
	@AfterClass
	public void afterClass () {
		
	}
	
	@AfterTest
	public void afterTest () {
		
	}
	
	@AfterSuite
	public void afterSuite () {
}
