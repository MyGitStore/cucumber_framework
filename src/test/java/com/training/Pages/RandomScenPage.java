package com.training.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.Base.BasePage;
import com.training.Base.BaseTest;

public class RandomScenPage extends BasePage {

static WebDriver driver;
	
	public RandomScenPage() {
	
		super(driver=BaseTest.getDriver());
	
	}
}
