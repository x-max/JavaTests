package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePageObjects {
	//Konstruktor koji inicijalizuje moje objekte na strani
	public GoogleHomePageObjects(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="q")
	public WebElement txtsearch;
	@FindBy(name="btnG")
	public WebElement btnSearch;

}
