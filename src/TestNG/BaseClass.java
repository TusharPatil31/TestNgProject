package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	
	@BeforeTest           //to run before once in all the test cases
	public void BeforeTestMethod() {
		
		System.out.println("Inside Before Test");
	}
	
	@BeforeClass            //to run before every class
	public void BeforeClass() {
		System.out.println("Inside before class");
	}
	
	@BeforeMethod(alwaysRun=true)           //to run before every method
	public void setup() {
		
		System.out.println("Inside Before Method");
	}
	
	@AfterMethod(alwaysRun=true)              // to run after every method
	public void teardown() {
		System.out.println("Inside After Method");
	}
	
	@AfterClass               //to run after every class
	public void AfterClass() {
		System.out.println("Inside after class");
	}
	
	@AfterTest              // to run after once in all test cases
	public void AfterTestCases() {
		System.out.println("Inside After Test");
	}
	


}
