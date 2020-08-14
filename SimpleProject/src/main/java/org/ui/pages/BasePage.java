package org.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class BasePage {
	protected static final long pageLoadWaitTime = 120;
	protected static final long explicitWaitTime = 20;
	protected WebDriver driver;
	protected Actions action;
	
	public BasePage(WebDriver driver) {
	    this.driver = driver;
	   // this.action = new Actions(driver);
	  }
	  
}
