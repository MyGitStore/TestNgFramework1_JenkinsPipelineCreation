package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.training.base.BasePage;

public class MySettingsPage extends BasePage {

	public MySettingsPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//a[text()='My Settings']")
	WebElement Mysettings;
	
	@FindBy(id="PersonalInfo_font")
	WebElement personaltab;
	
	@FindBy(id="LoginHistory_font")
	WebElement loginHistory;
	
	@FindBy(id="DisplayAndLayout_font")
	WebElement display;
	
	@FindBy(id="CustomizeTabs_font")
	WebElement customize;
	
	@FindBy(id="p4")
	WebElement customdropdown;
	
	@FindBy(xpath="//select/option[text()='Reports']")
	WebElement Availabletap;
	
	@FindBy(xpath="//img[@title='Add']")
	WebElement addReports;
	
	@FindBy(xpath="//input[@value=' Save ']")
	WebElement saveButton;
	
	@FindBy(id="EmailSetup_font")
	WebElement EmailLink;
	
	@FindBy(id="EmailSettings_font")
	WebElement EmailSetting;
	
	@FindBy(id="sender_name")
	WebElement emailName;
	
	@FindBy(id="sender_email")
	WebElement emailAddress;
	
	@FindBy(id="auto_bcc1")
	WebElement automaticBcc;
	
	@FindBy(xpath="//input[@value=' Save ']")
	WebElement save;
	
	@FindBy(id="CalendarAndReminders_font")
	WebElement Calendar;
	
	@FindBy(id="Reminders_font")
	WebElement Reminder;
	
	@FindBy(id="testbtn")
	WebElement TestReminderButton;
	
	 public void ClickMySettings() {
		 Mysettings.click();
	 }
	 public void PersonalTab() {
		// waitforElement(20,personaltab);
		 personaltab.click();
	 }
	 public void LoginHistory() {
		 loginHistory.click();
	 }
	 public void DisplayLayout() {
		 display.click();
	 }
	 public void CustomizeMyTabs() {
		 customize.click();
	 }
	 public void CustomDropdown() {
		 customdropdown.click();
		 Select customapp=new Select(customdropdown);
			customapp.selectByVisibleText("Salesforce Chatter");
	 }
	 public void Availabletap() {
		 Availabletap.click();
	 }
	 public void AddReports() {
		 addReports.click();
	 }
	 public void SaveButton() {
		 saveButton.click();
	 }
	 public void EmailLink() {
		 EmailLink.click();
	 }
	 public void EmailSetting() {
		 EmailSetting.click();
	 }
	 public void EmailName() {
		 emailName.click();
	 }
	 public void EmailAddress() {
		 emailAddress.click();
	 }
	 public void AutomaticBcc() {
		 automaticBcc.click();
	 }
	 public void Save() {
		 save.click();
	 }
	 public void Calendar() {
		 Calendar.click();
	 }
	 public void Reminder() {
		 Reminder.click();
	 }
	 public void TestReminderButton() {
		 TestReminderButton.click();
	 }
}
