package com.training.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.Base.BasePage;
import com.training.Base.BaseTest;

public class MyProfilePage extends BasePage {
	static WebDriver driver;

	public MyProfilePage() {

		super(driver = BaseTest.getDriver());
		
		  addObject("EditProfile", By.xpath("//img[@title='Edit Profile']"));
		  addObject("EditProfilepopupframe", By.xpath("//iframe[@id='contactInfoContentId']"));
		  addObject("aboutTab",By.id("aboutTab"));
		  addObject("saveall",By.xpath("//input[@value='Save All']"));
		 // addObject("postframe",By.xpath("//ul[@class='publisherFeedItemTypeChoices']"));
		  addObject("post", By.xpath("//span[normalize-space()='Post']")); 
		  addObject("posttextframe", By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
		  addObject("textframe",By.xpath("//body[text()='Share an update, @mention someone...']"));
		  addObject("sharebutton", By.xpath("//input[@value='Share']"));
		  addObject("file", By.xpath("//span[text()='File']"));
		  addObject("uploadfromcomputer", By.id("chatterUploadFileAction"));
		  addObject("choosefile", By.id("chatterFile"));
		  addObject("share", By.id("publishersharebutton"));
		  
		 
	}

}
