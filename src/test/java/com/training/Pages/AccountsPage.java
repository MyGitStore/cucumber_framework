package com.training.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.Base.BasePage;
import com.training.Base.BaseTest;

public class AccountsPage extends BasePage{

static WebDriver driver;
	
	public AccountsPage() {
	
		super(driver=BaseTest.getDriver());
		
		addObject("popuptabClose", By.id("id='tryLexDialogX"));
		addObject("NewTab", By.xpath("//input[@title='New']"));
		addObject("AccName", By.id("acc2"));
		addObject("Type", By.id("acc6"));
		addObject("CustomePriority", By.id("00NHu00000NHVQY"));
		addObject("Save1", By.xpath("//input[@tabindex='34']"));
		
		addObject("FieldAccount", By.id("fcol1"));
		addObject("operator", By.id("fop1"));
		addObject("value", By.id("fval1"));
		addObject("save14", By.id("ext-gen49"));
		addObject("findAccTextbox", By.id("srch"));
		addObject("findAcc", By.xpath("//input[@value=\"Find Accounts\"]"));
		addObject("next", By.xpath("(//input[@title='Next'])[2]"));
		addObject("Acc1", By.id("cid0"));
		addObject("Acc2", By.id("cid1"));
		addObject("merge", By.xpath("(//input[@title='Merge'])[1]"));
		addObject("Accountslastactivity30days", By.xpath("//a[normalize-space()='Accounts with last activity > 30 days']"));
		addObject("datefield", By.id("ext-gen148"));
		addObject("datefieldSelect", By.xpath("//div[text()=\"Created Date\"]"));
		addObject("range", By.id("duration-ext-gen17"));
		addObject("fromdate", By.id("ext-gen152"));
		addObject("today", By.xpath("//table[@id=\"ext-comp-1112\"]//button[text()=\"Today\"]"));
		addObject("todate", By.id("ext-gen154"));
		addObject("todatetoday", By.xpath("//table[@id=\"ext-comp-1114\"]//button[text()=\"Today\"]"));////div[@class='x-combo-list-item x-combo-selected']
		addObject("save12", By.xpath("//input[@data-uidsfdc=\"5\"]"));
		addObject("reportName", By.id("saveReportDlg_reportNameField"));
		addObject("ReportUniquename", By.id("saveReportDlg_DeveloperName"));
		addObject("Save14A", By.id("dlgSaveAndRun"));
	}
}
