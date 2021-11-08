package TestNG;

import org.testng.annotations.Test;

public class TestCase2 extends BaseClass{
	
	@Test(groups= {"sanity"}, dependsOnMethods="CCTest")
	public void CreditCardTest() {
		System.out.println("Credit Card Loan");
	}
	
	@Test(groups= {"sanity"})
	public void CCTest() {
		System.out.println("Credit Card Loan 2");
	}
	
	
	

}
