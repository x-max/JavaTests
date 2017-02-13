package org.pom;

import org.DDT.ExcelLib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		ExcelLib excel= new ExcelLib("C:\\Users\\806590\\Desktop\\x.xls");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\806590\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com");
		//Objects for the page
		GoogleHomePageObjects page = new GoogleHomePageObjects(driver);
		
		
		//Search Selenium
		page.SearchGoogle(excel.GetCellValue(0, 1));
		Thread.sleep(2000);
		
		
		//Click the Selenium Web Site
		SeleniumPageObjects selPage=page.ClickSelenium();
		
		//Wait for page to load
		Thread.sleep(5000);
			
		//Click Download
		selPage.ClickDownload();
		
		//Click Homepage
		selPage.NavigateHome();
				

		
//Ovaj deo koda smo premestili iz main metode u sam objekat
//I iz main metode(ili Test Framework-a) sada saljemo samo keyword -> keyword drivern framework		
//Search functionality napisan kao poseban metod u okviru GoogleHomePage strane
		
		
//		//Search for the text Selenium
//		page.txtsearch.sendKeys("Selenium");
//		//Click Search
//		page.btnSearch.click();

	}

}
