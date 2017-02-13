package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPageObjects {
	
	//GoogleHomePageObjects - Konstruktor koji inicijalizuje moje objekte na strani
		public SeleniumPageObjects(WebDriver driver){
			PageFactory.initElements(driver, this);	
		}
	
	@FindBy(linkText="Download")
	public WebElement lnkDownload;
	
	@FindBy(linkText="Browser Automation")
	public WebElement lnkHome;
	
	
	public void ClickDownload(){
		lnkDownload.click();
	}
	
	public void NavigateHome(){
		lnkHome.click();
	}

}
