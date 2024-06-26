package com.training.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.Base.BasePage;
import com.training.Base.BaseTest;

public class LeadsPage extends BasePage {

static WebDriver driver;
	
	public LeadsPage() {
	
		super(driver=BaseTest.getDriver());
		
		addObject("LeadsDropdown", By.id("fcf"));
		addObject("MyunreadLeadsfromdropdown", By.xpath("//option[@value=\"00BHu00000HSFMM\"]"));
		addObject("Gobutton", By.xpath("//input[@title='Go!']"));
		addObject("Todays Leads", By.xpath("//option[@value=\"00BHu00000HSFMa\"]"));
		addObject("new", By.xpath("//input[@title='New']"));
		addObject("lastname", By.id("name_lastlea2"));
		addObject("companyName", By.id("lea3"));
		addObject("save", By.xpath("//td[@id='topButtonRow']//input[@title='Save']"));
		
	}
}
