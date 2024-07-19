package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class MyprofilePage extends BasePage{

	public MyprofilePage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//a[@title='My Profile']")
	WebElement UMmyprofile;

	
	public void UsermenuMyProfile() {
		 UMmyprofile.click();
	 }
}
