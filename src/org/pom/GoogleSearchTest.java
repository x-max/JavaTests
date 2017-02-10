package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
	
	//public static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\806590\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com");
		//Objects for the page
		GoogleHomePageObjects page = new GoogleHomePageObjects(driver);
		
		//Search for the text Selenium
		page.txtsearch.sendKeys("Selenium");
		//Click Search
		page.btnSearch.click();

	}

}
