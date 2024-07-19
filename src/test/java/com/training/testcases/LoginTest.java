package com.training.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.LoginPage;
import com.training.pages.UserMenuPage;
import com.training.utilities.CommonUtilities;



public class LoginTest extends BaseTest {
	
	WebDriver driver;

	LoginPage login;
	UserMenuPage UMpage;
	
	String url;
	String username;
	String password;
	String Wusername;
	String Wpassword;
	@BeforeMethod
	public void LaunchApplication() {
		driver=getDriver();
		url=getvalue("qaurl");
		username=getvalue("username");
		password=getvalue("password");
		driver.get(url);
		login=new LoginPage(driver);
		UMpage=new UserMenuPage(driver);
		driver.manage().window().maximize();
		}
	
	
	
	@Test (priority=3 , groups= {"login"} )  
	public void LoginwithoutPassword() {
		login.EnterintoUsername(username);
		login.Login();
	}
	
	@Test (priority=2)
	public void LoginwithwrongUsernamePassword4B() {
		
		login.EnterintoWUsername(Wusername);
		login.EnterintoWPassword(Wpassword);
		
		login.Login();
	}

	@Test (priority=1)
	public void LoginintoApplication() {
		login.EnterintoUsername(username);
		login.EnterintoPassword(password);
		login.Login();
		
	}
	@Test (priority=6)
	public void Login_RememberMe() {
		login.EnterintoUsername(username);
		login.EnterintoPassword(password);
		login.RememberMe();
		login.Login();
		//waitforElement(usermenu, 30);
		//UMpage.ClickonUsermenu();
		//UMpage.Logout();
		//login.AfterLogout();
	}
	@Test (priority=4)
	public void ForgotUsername_4A() {
		login.ForgotPassword();
		login.ForgotPpageUN();
		login.Continue();
		login.ForgotReset();
	}
	
	@AfterMethod
	public void teardown() {
		Closebrowser(driver);
		driver=null;
	}
}
