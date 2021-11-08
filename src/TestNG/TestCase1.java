package TestNG;


import org.testng.annotations.Test;

public class TestCase1 extends BaseClass {
	
	@Test(priority =0,description="This case to test home loan functionality")
	public void HomeLoneTest() {
		System.out.println("Inside Home Loan");
	}
	
	@Test(priority=1,description="This case to test home loan functionality 1")
	public void HomeLoneTest1() {
		System.out.println("Inside Home Loan 1");
	}
	
	
	@Test(priority=3,groups= {"sanity"}, description="This case to test car loan functionlity")
	public void CarLoanTest() {
		
		System.out.println("Inside Car Loan");
		
	}
	
	
}