package com.training.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.AccountsPage;
import com.training.pages.LoginPage;
import com.training.pages.UserMenuPage;
import com.training.utilities.CommonUtilities;



public class AccountPageTest extends BaseTest {
	
	WebDriver driver;

	LoginPage login;
	UserMenuPage usermenu;
	AccountsPage accountsPage;
	
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
		accountsPage=new AccountsPage(driver);
		driver.manage().window().maximize();
		}
	@Test
	public void Testcase_10() {
		login.EnterintoUsername(username);
		login.EnterintoPassword(password);
		login.Login();
		accountsPage.AccountTab();
		accountsPage.popuptabClose();
		accountsPage.NewTab();
		accountsPage.AccName();
		accountsPage.Type();
		accountsPage.CustomePriority();
		accountsPage.save();
	}
	
	
	@AfterMethod
	public void teardown() {
		Closebrowser(driver);
		driver=null;
	}
}
