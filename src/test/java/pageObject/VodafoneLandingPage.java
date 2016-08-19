package pageObject;

import org.openqa.selenium.By;

import manageBrowserApp.ManageBrowserApp;

//This class stored all locators (elements) and methods of 'Vodafone Landing' page
public class VodafoneLandingPage {
	
	public String getPageTitle() {
		return ManageBrowserApp.driver.getTitle();
    }
	
	public String getPageURL() {
		return ManageBrowserApp.driver.getCurrentUrl();
    }
	
	
	By myVodafoneLinktext = By.linkText("My Vodafone");
	
	public void clickOnMyVodafoneLinktext() {
		ManageBrowserApp.driver.findElement(myVodafoneLinktext).click();
	}

}
