package com.training.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.LoginPage;
import com.training.pages.UserMenuPage;
import com.training.utilities.CommonUtilities;



public class MyprofileTest extends BaseTest {
	
	WebDriver driver;

	LoginPage login;
	UserMenuPage UMpage;
	
	String url;
	String username;
	String password;
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
	
	
	@AfterMethod
	public void teardown() {
		Closebrowser(driver);
		driver=null;
	}
}
