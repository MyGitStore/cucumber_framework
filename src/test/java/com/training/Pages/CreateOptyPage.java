package com.training.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.Base.BasePage;
import com.training.Base.BaseTest;

public class CreateOptyPage extends BasePage {

static WebDriver driver;
	
	public CreateOptyPage() {
	
		super(driver=BaseTest.getDriver());
		
		addObject("OpporName", By.id("opp3"));
		addObject("AccName", By.id("opp4"));
		addObject("closedate", By.id("opp9"));
		addObject("today", By.xpath("//a[normalize-space()='10/6/2023']"));
		//addObject("outside", By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[3]/table[1]/tbody[1]/tr[3]/td[4]"));
		addObject("stage", By.id("opp11"));
		addObject("probability", By.id("opp12"));
		addObject("leadsource", By.id("opp6"));
		addObject("primarycamp", By.id("opp17"));
		addObject("save", By.xpath("//td[@id='topButtonRow']//input[@title='Save']"));	
	}
}
