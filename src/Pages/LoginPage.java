package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Test.BaseClass;

public class LoginPage {
	
	ExtentTest test = BaseClass.test;

	WebDriver driver = BaseClass.driver;
	
//	-------------------- Web Elements ------------------------------------------------
	
	@FindBy(linkText="Log in")
	WebElement LoginLink;
	
	@FindBy(name="user_login")
	WebElement UserName;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(className="rememberMe")
	WebElement Remember;
	
	@FindBy(name="btn_login")
	WebElement LoginButton;
	
	@FindBy(id="msg_box")
	WebElement Error;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}

//	------------------------------- Methods --------------------------------------------------------
	
	public void login(String Uname, String Pass)
	{
	
//		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(LoginLink));
			
		LoginLink.click();
		test.log(LogStatus.PASS,"Click on login link", "Successfully click");
		
//		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys(Uname);
		test.log(LogStatus.PASS,"Enter Username"+ Uname, "Successfully click");	
		
//		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(Pass);
		test.log(LogStatus.PASS,"Enter Password"+ Pass, "Successfully click");	
		
//		WebElement Remember = driver.findElement(By.className("rememberMe"));
		Remember.click();
		
		
//		WebElement LoginButton = driver.findElement(By.name("btn_login"));
		LoginButton.click();	
		test.log(LogStatus.PASS,"Click on login button", "Successfully click");
	}
	
	public void Errorcheck()
	{

//		WebElement Error = driver.findElement(By.id("msg_box"));
		String Actualmsg = Error.getText();
		String Expmsg = "The email or password you have entered is invalid.";
		
//		Assert.assertEquals(Actualmsg, Expmsg); //Hard assert only include in TestNg method and to check actual output with expected output
	
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(Actualmsg, Expmsg);
		
		System.out.println("After Assertion");
		
		soft.assertAll();
	}

}
