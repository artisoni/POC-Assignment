package main.java.step_defs.common;

import cucumber.api.java.en.*;
import main.java.coreutils.Global;
import main.java.coreutils.Utility;

public class CommonSteps 
{
	@Given("^The name of the Browser as \"([^\"]*)\", \"([^\"]*)\"$")
	public void getBrowserNameFromUser(String sBrowserName, String sURL)
	{
		Global.sCurrentBrowserName = sBrowserName;
		Global.sAppURL = sURL;
		
		System.out.println("BrowserName:" + Global.sCurrentBrowserName);
		System.out.println("Application URL:" + Global.sAppURL);
		
		Utility.startDriver(Global.sCurrentBrowserName, Global.sAppURL);
	}
	
	@When("^The expected params are sent to the code$")
	public void m2()
	{
		System.out.println("Printing the contents in When statement");
	}
	
	@Then("^I verify the output$")
	public void m3()
	{
		System.out.println("Printing the contents in Then statement");
	}
	
	@Then("^Verify this Value is Greather Than Zero$")
	public void VerifyValueIsGreaterThanZero() throws Exception
	{
		boolean bGT_Zero = Utility.verifyCurrentElementTextIsGreatherThanZero();
		if(!bGT_Zero) throw new Exception(Global.gErrMsg);
	}
	
	@Then("^Verify this Value is Formatted as Currency")
	public void VerifyNumberFormat() throws Exception
	{
		boolean bNumberFormatted = Utility.verifyCurrentElementNumberFormat();
		if(!bNumberFormatted) throw new Exception(Global.gErrMsg);
	}
	
	@Then("^Close Browser$")
	public void closeBrowser()
	{
		Utility.closeBrowser();
	}
}
