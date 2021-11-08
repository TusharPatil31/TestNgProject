package Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.LoginPage;

public class LoginTest extends BaseClass {

	@Parameters({"UserName", "Password"})
	@Test
	public void Negativelogin(String UserNameVal, String PasswordVal) {
		
		test =report.startTest("Negative Login Test");
		LoginPage Login = new LoginPage();
		Login.login(UserNameVal,PasswordVal);
		Login.Errorcheck();
		report.endTest(test);
	}
	
	
	@Parameters({"UserName", "CorrectPassword"})
	@Test
	public void Positivelogin(String UserNameVal, String PasswordVal) {
		
		test = report.startTest("Positive Login Test");
		LoginPage Login = new LoginPage();
		Login.login(UserNameVal,PasswordVal);
		report.endTest(test);
	}
	
}
