package com.training.Base;

import static com.training.Base.BaseTest.driver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;

public class BasePage {
	WebDriver driver;
	
	public HashMap<String,By> ObjectRepo=new HashMap<String, By>();


	public BasePage(WebDriver driver) {
		this.driver=driver;
	}

	public void addObject(String logicalName, By by) {
		ObjectRepo.put(logicalName, by);
	}
	
	private WebElement getElement(String logicalName) {
		
		By by=ObjectRepo.get(logicalName);
		WebElement element=driver.findElement(by);
		return element;
	}
	
	public void EnterintoTextBox(String logicalName, String value) {
		
		WebElement element= getElement(logicalName);
		waitForElement(element);
		element.sendKeys(value);
	}
	
	public void ClickonButton(String logicalName)  {

		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement element= getElement(logicalName);
		waitForElement(element);
		element.click();
	}

	private void waitForElement(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}

	public void ClickonCheckBox(String logicalName) {
		WebElement element= getElement(logicalName);
		waitForElement(element);
		element.click();
	}

	public void Validate(String logicalName, String value) {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement element= getElement(logicalName);
		waitForElement(element);
		String expected=element.getText();
		String Actual=value;
		Assert.assertEquals(Actual,expected);
		
	}

	public void LoginpageafterLogout(String logicalName) {
		driver.navigate().to("https://tekarch-d-dev-ed.develop.my.salesforce.com");
		
	}

	public void switchto() {
		for(String handle:driver.getWindowHandles()) {
			driver.switchTo().window(handle);
			
		}
		
	}

	public void closepopup() {
		//driver.close();
		//driver.quit();
		
	}

	public void dropdown(DataTable dataTable) {
		
		List<List<String>> usermenuDDlist=dataTable.asLists(String.class);
		//System.out.println(logicalName);
	      for(List<String> Actual: usermenuDDlist) {
	    	  System.out.println("Mylist"+ Actual);
	    	  
	    	  try {
	  			Thread.sleep(3000);
	  		} catch (InterruptedException e) {
	  			// TODO Auto-generated catch block
	  			e.printStackTrace();
	  		}
	  		List<WebElement> elements=driver.findElements(By.xpath("//div[@id=\"userNav-menuItems\"]/a"));
	  		
	  		//List<WebElement> elements=driver.findElements(string);
					  List<String> expected = new ArrayList<String>(); int i=0;
				   for(WebElement expt:elements) { 
				   //System.out.println(expected.getText());
				    expected.add(i++,expt.getText()); }
				 
	  		System.out.println(expected);
	  		Assert.assertEquals(Actual,expected);
	  		}
	      
	      }

	public void SelectByVisibleText(String logicalName, String value) {
		 WebElement element = getElement(logicalName);
		  Select select = new Select(element);
		  select.selectByVisibleText(value);	
		
	}

	public void switchtoframe(String logicalName) {
		 WebElement element = getElement(logicalName); 
		 waitForElement(element);
		 driver.switchTo().frame(element);
		
	}
	
	   // String filepath = "C:\\Users\\hellojuly\\eclipse-workspace\\cucumber_framework_main\\screenshot";
	public void takeScreenshot(WebDriver driver, String filepath) {
	    // Take screenshot interface
	    TakesScreenshot screenshot = (TakesScreenshot) driver;
	    // Take screenshot and store it in the source file
	    File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
	    // Destination file path
	    String destinationFilePath = filepath + "\\screenshot.png";
	    // Convert the filepath to a File object
	    File destinationFile = new File(destinationFilePath);
	    
	    try {
	        FileUtils.copyFile(srcFile, destinationFile);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

	public void dropdownCreateopty(DataTable dataTable) {
		List<List<String>> usermenuDDlist=dataTable.asLists(String.class);
		//System.out.println(logicalName);
	      for(List<String> Actual: usermenuDDlist) {
	    	  System.out.println("Mylist"+ Actual);
	    	  
	    	  try {
	  			Thread.sleep(3000);
	  		} catch (InterruptedException e) {
	  			// TODO Auto-generated catch block
	  			e.printStackTrace();
	  		}
	  		List<WebElement> elements=driver.findElements(By.xpath("//select[@id=\"fcf\"]/option"));
	  		
	  		//List<WebElement> elements=driver.findElements(string);
					  List<String> expected = new ArrayList<String>(); int i=0;
				   for(WebElement expt:elements) { 
				   //System.out.println(expected.getText());
				    expected.add(i++,expt.getText()); }
				 
	  		System.out.println(expected);
	  		Assert.assertEquals(Actual,expected);
	  		}
	      

		
	}

	public void dropdownLeads(DataTable dataTable) {
		List<List<String>> usermenuDDlist=dataTable.asLists(String.class);
		//System.out.println(logicalName);
	      for(List<String> Actual: usermenuDDlist) {
	    	  System.out.println("Mylist"+ Actual);
	    	  
	    	  try {
	  			Thread.sleep(3000);
	  		} catch (InterruptedException e) {
	  			// TODO Auto-generated catch block
	  			e.printStackTrace();
	  		}
	  		List<WebElement> elements=driver.findElements(By.xpath("//select[@id=\"fcf\"]//option"));
	  		
	  		//List<WebElement> elements=driver.findElements(string);
					  List<String> expected = new ArrayList<String>(); int i=0;
				   for(WebElement expt:elements) { 
				   //System.out.println(expected.getText());
				    expected.add(i++,expt.getText()); }
				 
	  		System.out.println(expected);
	  		Assert.assertEquals(Actual,expected);
	  		}
	}

	public void LeadsSelected(String logicalname, String value) {
		String expected=value;
		Select select = new Select(driver.findElement(By.xpath("//select")));
		WebElement option = select.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println(defaultItem );
		Assert.assertEquals(expected,defaultItem);
		
	}
	}
	
	

