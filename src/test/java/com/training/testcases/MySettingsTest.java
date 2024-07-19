package com.training.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.LoginPage;
import com.training.pages.MySettingsPage;
import com.training.pages.UserMenuPage;
import com.training.utilities.CommonUtilities;



public class MySettingsTest extends BaseTest {
	
	WebDriver driver;

	LoginPage login;
	UserMenuPage usermenu;
	MySettingsPage mysettings;
	
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
		usermenu=new UserMenuPage(driver);
		mysettings=new MySettingsPage(driver);
		driver.manage().window().maximize();
		}
	
	@Test
	public void Testcase_7() {
		login.EnterintoUsername(username);
		login.EnterintoPassword(password);
		login.Login();
		usermenu.ClickonUsermenu();
		mysettings.ClickMySettings();
		mysettings.PersonalTab();
		mysettings.LoginHistory();
		mysettings.DisplayLayout();
		mysettings.CustomizeMyTabs();
		mysettings.CustomDropdown();
		mysettings.Availabletap();
		mysettings.AddReports();
		mysettings.SaveButton();
		mysettings.EmailLink();
		mysettings.EmailSetting();
		mysettings.EmailName();
		mysettings.EmailAddress();
		mysettings.AutomaticBcc();
		mysettings.Save();
		mysettings.Calendar();
		mysettings.Reminder();
		mysettings.TestReminderButton();
	}
	
	
	
	
	@AfterMethod
	public void teardown() {
		Closebrowser(driver);
		driver=null;
	}
}
