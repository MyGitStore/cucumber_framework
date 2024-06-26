package com.training.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.Base.BasePage;
import com.training.Base.BaseTest;

public class Mysettingspage extends BasePage{
static WebDriver driver;
	
	public Mysettingspage() {
	
		super(driver=BaseTest.getDriver());
		addObject("personal", By.id("PersonalInfo_font"));
		addObject("loginhistory", By.id("LoginHistory_font"));
		addObject("Display&layout", By.id("DisplayAndLayout_font"));
		addObject("customizemytabs", By.id("CustomizeTabs_font"));
		addObject("customapp", By.id("p4"));
		addObject("availabletab", By.xpath("//select/option[text()='Reports']"));
		addObject("addReports", By.xpath("//img[@title='Add']"));
		addObject("save", By.xpath("//input[@value=' Save ']"));
		addObject("Email", By.id("EmailSetup_font"));
		addObject("EmailSettings", By.id("EmailSettings_font"));
		addObject("Emailname", By.id("sender_name"));
		addObject("Emailaddress", By.id("sender_email"));
		addObject("autoBcc", By.id("auto_bcc1"));
		addObject("save", By.xpath("//input[@value=' Save ']"));
		addObject("calender&reminders", By.id("CalendarAndReminders_font"));
		addObject("activityReminders", By.id("Reminders_font"));
		addObject("TestReminderButton", By.id("testbtn"));
		addObject("Edit", By.xpath("//a[text()='Edit']"));
		
		
	}

}
