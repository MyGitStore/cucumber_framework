package com.training.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.Base.BasePage;
import com.training.Base.BaseTest;

public class HomePage extends BasePage {
		 
		static WebDriver driver;
	public HomePage() {
		super(driver=BaseTest.getDriver());
		
		addObject("Usermenu", By.id("userNavButton"));
		addObject("usermenuitems", By.xpath("//div[@id=\"userNav-menuItems\"]/a"));
		addObject("Logout", By.xpath("//a[@title='Logout']"));
		addObject("MyProfile", By.xpath("//a[@title='My Profile']"));
		addObject("Mysettings", By.xpath("//a[text()='My Settings']"));
		addObject("DeveloperConsole", By.xpath("//a[text()='Developer Console']"));
		addObject("Accounts", By.xpath("//a[@title='Accounts Tab']"));
		//addObject("popuptabClose", By.xpath("//a[@id='tryLexDialogX']"));
		addObject("contacts", By.id("Contact_Tab"));	
		addObject("popuptabClose", By.id("tryLexDialogX"));
		addObject("newbutton", By.xpath("//input[@value=\" New \"]"));
		addObject("lastname", By.id("name_lastcon2"));
		addObject("Accname", By.id("con4"));
		addObject("savenew", By.xpath("//td[@id='topButtonRow']//input[@title='Save & New']"));
		addObject("Save", By.xpath("//td[@id=\"topButtonRow\"]//input[@value=\" Save \"]"));

		addObject("createnewview", By.xpath("//a[normalize-space()='Create New View']"));
		addObject("viewname", By.id("fname"));
		addObject("viewuniquename", By.id("devname"));
		
		addObject("save", By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]"));
		addObject("recentlyviewedDD", By.id("hotlist_mode"));
		addObject("viewdropdown", By.id("fcf"));
		addObject("recentContactname", By.xpath("//tr[contains(@class,'dataRow even first')]//a[contains(text(),'last')]"));
		addObject("contactsError", By.xpath("//div[@class='requiredInput']//div[@class='errorMsg']"));
		addObject("Leads", By.xpath("//a[@title=\"Leads Tab\"]"));	
		addObject("cancel", By.xpath("(//input[@title='Cancel'])[1]"));	
		addObject("Edit", By.xpath("//a[text()='Edit']"));
		addObject("Opportunity", By.id("Opportunity_Tab"));
		addObject("MyopporDropdown", By.xpath("//select[@id='fcf']"));
		addObject("Newbutton", By.xpath("//input[@title='New']"));
		addObject("OpporPipeline", By.xpath("//a[text()=\"Opportunity Pipeline\"]"));
		addObject("stuckoppor", By.xpath("//a[text()=\"Stuck Opportunities\"]"));
		addObject("QuaterlysummaryInterval", By.id("quarter_q"));
		addObject("QuaterlysummaryInclude", By.id("open"));
		addObject("Runreport", By.xpath("//input[@value=\"Run Report\"]"));
		addObject("edit", By.xpath("//a[text()='Edit']"));
		addObject("MergeAccounts", By.xpath("//a[text()=\"Merge Accounts\"]"));
		
	}
}
