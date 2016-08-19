package pageObject;

import org.openqa.selenium.By;

import manageBrowserApp.ManageBrowserApp;

//This class stored all locators (elements) and methods of 'Login Handler' page
public class LoginHandlerPage {
	
	public String getPageTitle() {
		return ManageBrowserApp.driver.getTitle();
    }
	
	public String getPageURL() {
		return ManageBrowserApp.driver.getCurrentUrl();
    }
	
	
	By userNameTextbox = By.id("myvfLoginOnlineId");
	By passwordTextbox = By.id("myvfLoginPassword");
	By signInButton = By.id("sign-in-button");
	By loginErrorMessage = By.xpath("//div[@class='submitError']");
	
	public void setLoginUsername(String value) {
		ManageBrowserApp.driver.findElement(userNameTextbox).sendKeys(value);
	}
	
	public void setLoginPassword(String value) {
		ManageBrowserApp.driver.findElement(passwordTextbox).sendKeys(value);
	}
	
	public void clickOnSignInButton() {
		ManageBrowserApp.driver.findElement(signInButton).click();
	}
	
	public String getLoginErrorMessage() {
	    return ManageBrowserApp.driver.findElement(loginErrorMessage).getText();
	}

}
