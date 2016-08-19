package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import manageBrowserApp.ManageBrowserApp;

//This class stored all locators (elements) and methods of 'using My Vodafone' page
public class UsingMyVodafonePage {
	
	public String getPageTitle() {
		return ManageBrowserApp.driver.getTitle();
    }
	
	public String getPageURL() {
		return ManageBrowserApp.driver.getCurrentUrl();
    }
	
	
	By forFamiliesLinktext = By.linkText("For Families");
	By loginButton = By.xpath("//a[@title='Login']");
	
	public void moveMouseOnForFamiliesLinktext() {
		Actions act=new Actions(ManageBrowserApp.driver);
		act.moveToElement(ManageBrowserApp.driver.findElement(forFamiliesLinktext)).perform();
	}
	
	public void clickOnLoginButton() {
		ManageBrowserApp.driver.findElement(loginButton).click();
	}

}
