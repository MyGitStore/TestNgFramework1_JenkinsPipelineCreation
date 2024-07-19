package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.training.base.BasePage;

public class AccountsPage extends BasePage {

	public AccountsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[@title='Accounts Tab']")
	WebElement AccountTab;
	
	@FindBy(xpath="//a[@id='tryLexDialogX']")
	WebElement popuptabClose;
	
	@FindBy(xpath="//input[@title='New']")
	WebElement NewTab;
	
	@FindBy(id="acc2")
	WebElement AccName;
	
	@FindBy(id="00NHu00000NHVQY")
	WebElement CustomePriority;
	
	@FindBy(id="acc6")
	WebElement Type;
	
	@FindBy(xpath="//input[@tabindex='34']")
	WebElement save;
	
	
	
	public void AccountTab() {
		AccountTab.click();
	//	waitforElement(20,popuptabClose);
 }
	public void popuptabClose() {
		popuptabClose.click();
 }
	public void NewTab() {
		NewTab.click();
 }
	public void AccName() {
		AccName.sendKeys("Apple");
 }
	public void Type() {
		Type.click();
		Select TypePartner=new Select(Type);
		TypePartner.selectByVisibleText("Technology Partner");
 }
	public void CustomePriority() {
		CustomePriority.click();
		Select CustomP=new Select(CustomePriority);
		CustomP.selectByVisibleText("High");
 }
	public void save() {
		save.click();
 }
	
	

}
