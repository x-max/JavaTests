package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePageObjects {
	
	//GoogleHomePageObjects - Konstruktor koji inicijalizuje moje objekte na strani
	public GoogleHomePageObjects(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="q")
	public WebElement txtsearch;
	
	@FindBy(name="btnG")
	public WebElement btnSearch;
	
	@FindBy(linkText="Selenium - Web Browser Automation")
	public WebElement lnkSelenium;
	
	public void SearchGoogle(String searchText){
				//Search for the text Selenium
				txtsearch.sendKeys(searchText);
				//Click Search
				btnSearch.click();
	}
	
	public void ClickSelenium(){
		lnkSelenium.click();
	}
	
	

}
