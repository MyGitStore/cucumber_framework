package com.training.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.Base.BasePage;
import com.training.Base.BaseTest;

public class DeveloperConsolePage extends BasePage{

static WebDriver driver;
	
	public DeveloperConsolePage() {
	
		super(driver=BaseTest.getDriver());
		addObject("DeveloperConsole", By.id("//a[text()='Developer Console']"));
	
	}
}
