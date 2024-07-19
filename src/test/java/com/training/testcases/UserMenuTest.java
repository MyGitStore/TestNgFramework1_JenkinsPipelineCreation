package com.training.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.LoginPage;
import com.training.pages.UserMenuPage;

public class UserMenuTest extends BaseTest {

	WebDriver driver;
	
	LoginPage login;
	UserMenuPage usermenu;
	
	String url;
	String username;
	String password;
	
	@BeforeMethod
	public void beforemethod() {
		driver=getDriver();
		url=getvalue("qaurl");
		username=getvalue("username");
		password=getvalue("password");
		driver.get("url");
		login= new LoginPage(driver);
		usermenu=new UserMenuPage(driver);
		
		
	}
	
	@Test
	public void UsermenuDropdown() {
		login.EnterintoUsername(username);
		login.EnterintoPassword(password);
		login.Login();
		usermenu.ClickonUsermenu();
	}
	
	@Test
	public void MyProfile() {
		login.EnterintoUsername(username);
		login.EnterintoPassword(password);
		login.Login();
		usermenu.ClickonUsermenu();
	}
	
	@Test
	public void Testcase_8() {
		login.EnterintoUsername(username);
		login.EnterintoPassword(password);
		login.Login();
		usermenu.ClickonUsermenu();
		//usermenu.DeveloperConsole();
	}
	@Test
	public void Testcase_9() {
		login.EnterintoUsername(username);
		login.EnterintoPassword(password);
		login.Login();
		usermenu.ClickonUsermenu();
		usermenu.Logout();
	}
	
	
	@AfterMethod
	public void teardown() {
		Closebrowser(driver);
	}
	
		
}
