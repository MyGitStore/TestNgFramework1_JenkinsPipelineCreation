package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.training.base.BasePage;

public class UserMenuPage extends BasePage {
	
	public UserMenuPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="tt-for-87:226;a")
	WebElement usermenu;
	
	@FindBy(xpath="//a[@title='Logout']")
	WebElement logout;
	
	@FindBy(xpath="//a[text()='Developer Console']")
	WebElement DeveloperConsole;
	
	
	
	
	 public void ClickonUsermenu() {
		 usermenu.click();
		// UMmyprofile.click();
	 }
	 public void Logout() {
			logout.click();
	 }
	
	/* public void DeveloperConsole() {
		 DeveloperConsole.click();
	String Pwindow=driver.getWindowHandle();
	for(String handle:driver.getWindowHandles()){
		System.out.println(handle);
			  driver.switchTo().window(handle); 
			  } 
	driver.close();
			 
	 }*/
	 

}
