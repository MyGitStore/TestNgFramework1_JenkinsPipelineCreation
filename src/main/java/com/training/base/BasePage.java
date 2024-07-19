package com.training.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	WebDriver driver;
	public BasePage(WebDriver driver) {
		this.driver=driver;
		//Page factory Initialization
		PageFactory.initElements(driver, this);
	}
	
	public void waitforElement(Duration time,WebElement usermenu) {
		//WebDriverWait wait=new WebDriverWait(driver, time);
	//	wait.until(ExpectedConditions.visibilityOf(usermenu));
	}

}
