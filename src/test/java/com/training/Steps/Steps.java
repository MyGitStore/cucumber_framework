package com.training.Steps;

import com.training.pagefactory.PageFactory;

import java.lang.reflect.Array;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import com.training.Base.BasePage;
import com.training.Base.BaseTest;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends BaseTest {
		
	  PageFactory pagefactory=new PageFactory(); 
	  BasePage page;
	  @Before
	  public void setup() {
		  launchapplication();
	  }
		/*
		 * @After public void close() { page.takescreenshot(getDriver());
		 * page.closepopup(); }
		 */
	  
	  @Given("User is on the {string}")
	  public void user_is_on_the(String pageName) throws InstantiationException, IllegalAccessException {
	  	 page=pagefactory.initialize(pageName);
	     
	  }
	  
	  @When("User enter into TextBox {string} {string}")
	  public void user_enter_into_text_box(String Logicalname, String value) {
	  page.EnterintoTextBox(Logicalname, value);  }
	  
	  @Then("User Clicks on Button {string}")
	  public void user_clicks_on_button(String Logicalname) { 
		  page.ClickonButton(Logicalname);
	   }
	  
	  @Then("User Clicks on CheckBox {string}")
	  public void user_clicks_on_check_box(String Logicalname) {
	      page.ClickonCheckBox(Logicalname);
	  }
	  
	  @Then("Validate Username {string} {string}")
	  public void validate_username(String string, String string2) {
	      page.Validate(string, string2);
	  }
	  @Then("User Switch Window {string}")
	  public void user_switch_window(String string) {
	      page.LoginpageafterLogout(string);
	  }
	  @Then("User switchto popup window {string}")
	  public void user_switchto_popup_window(String string) {
	      page.switchto();
		  
	  }
	  @Then("User closes popup {string}")
	  public void user_closes_popup(String string) {
	     page.closepopup();	  
	  }
	  
	  @Then("validate dropdown is displayed")
	  public void validate_dropdown_is_displayed(io.cucumber.datatable.DataTable dataTable) {
	      page.dropdown( dataTable);
	      }
	  @Then("validate dropdown is displayed Createopty")
	  public void validate_dropdown_is_displayed_Createopty(io.cucumber.datatable.DataTable dataTable) {
		  page.dropdownCreateopty( dataTable);
	  }
	  @Then("validate dropdown is displayed Leads")
	  public void validate_dropdown_is_displayed_leads(io.cucumber.datatable.DataTable dataTable) {
	      page.dropdownLeads(dataTable);
	  }
	  @Then("wait for loading")
	  public void wait_for_loading() {
	    try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	  @Then("User validates default view selected {string} {string}")
	  public void user_validates_default_view_selected( String Logicalname, String value) {
	      page.LeadsSelected(Logicalname, value);
	  }

	  
	  @Then("User Select from Dropdown {string} {string}")
	  public void user_select_from_dropdown(String string, String string1) {
	    page.SelectByVisibleText(string, string1);
	  }
	  
	  
	  @Then("User Switch frame {string}")
	  public void user_switch_frame(String string) {
	      page.switchtoframe(string);
	  }
	  }

	
	  

