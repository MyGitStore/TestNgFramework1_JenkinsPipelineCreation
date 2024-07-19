package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.training.base.BasePage;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="username")
	WebElement Username;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(id="Login")
	WebElement Login;
	
	@FindBy(xpath="//input[@class='r4 fl mr8']")
	WebElement Remember;
	
	@FindBy(id="tt-for-87:226;a")
	WebElement usermenu;
	
	@FindBy(xpath="//a[@title='Logout']")
	WebElement logout;
	
	@FindBy(id="idcard-identity")
	WebElement UsernameAfterlogout;
	
	@FindBy(id="forgot_password_link")
	WebElement forgotP;
	
	@FindBy(id="un")
	WebElement forgotUN;
	
	@FindBy(id="continue")
	WebElement continueButton;
	
	@FindBy(className="primary button wide mb16")
	WebElement FReset;
	
	
	public void EnterintoUsername(String username) {
		Username.sendKeys(username);
		
	}
	public void EnterintoPassword(String password) {
		Password.sendKeys(password);
	}
	public void Login() {
		Login.click();
	}
	public void EnterintoWUsername(String username) {
		Username.sendKeys("Wusername");
		
	}
	public void EnterintoWPassword(String password) {
		Password.sendKeys("Wpassword");
	}
	public void RememberMe() {
		Remember.click();
	}
	public void Logout() {
		logout.click();
	}
	public void UsernameAfterlogout() {
		UsernameAfterlogout.getText();
	}
	public void ForgotPassword() {
		forgotP.click();
	}
	public void ForgotPpageUN() {
		forgotUN.sendKeys("SathyaHariram@tekarch.com");
	}
	public void Continue() {
		continueButton.click();
	}
	public void ForgotReset() {
		FReset.click();
	}
	
	
	public void validate() {
		
	}
	
	public void AfterLogout() {
		String expectedlogout=UsernameAfterlogout.getText();
		Assert.assertEquals(UsernameAfterlogout,expectedlogout);
		System.out.println(UsernameAfterlogout);
	}
}
