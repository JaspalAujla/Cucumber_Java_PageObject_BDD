package stepDefinition;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import manageBrowserApp.ManageBrowserApp;

public class CommonStepDefinition {
	
	// Base URL of an application
	String baseURL = "http://www.vodafone.co.nz/";
	
	// Login page URL of an application
	String loginPageURL = "https://www.vodafone.co.nz/knox/login_handler.jsp";
	
	// If element will not available then script will wait for an element as per the given time
	int ImplicitWait = 30;
	
	// If page will take more than given time then the test case will fail at that point of time
	int pageLoadTimeOut = 120;
	
	// Browser will start on the basis of provided value (firefox, chrome, ie, edge, safari)
	String browserName = "firefox";
	
	
	ManageBrowserApp mba = new ManageBrowserApp();
	
	@Before
	public void launchBrowserAndApp()
	{
		mba.launchBrowser(browserName);
		mba.maximizeBrowser();
		mba.setImplicitWait(ImplicitWait);
		mba.setPageLoadTimeout(pageLoadTimeOut);
	}	
	
	@Given("^I am on the vodafone landing page$")
	public void i_am_on_the_vodafone_landing_page() throws Throwable {
		mba.launchApp(baseURL);
	}
	
	@Given("^I am on the vodafone login page$")
	public void i_am_on_the_vodafone_login_page() throws Throwable {
		mba.launchApp(loginPageURL);
	}
	
	@After
    public void tearDown(Scenario scenario) {
		mba.tearDown(scenario);
    }

}
