package main.java.step_defs.web_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.*;
import cucumber.api.java.en.When;
import main.java.coreutils.Global;
import main.java.coreutils.Utility;

public class Exercise_Page
{
	@When("^Currency Value for V1 is \"([^\"]*)\"$")
	public static void enterValueForV1(String sValue) throws Exception
	{
		String ElementID = "txt_val_1";
		
		Utility.Current_WebElement = Utility.Webdriver.findElement(By.id(ElementID));
		
		boolean bStatus = Utility.Current_WebElement.isDisplayed();
		if(!bStatus) 
		{
			Global.gErrMsg = "Element with ID '" + ElementID + "' not displayed";
			throw new Exception(Global.gErrMsg);
		}
		
		Utility.Current_WebElement.sendKeys(sValue);
	}
	
	@When("^Currency Value for V2 is \"([^\"]*)\"$")
	public static void enterValueForV2(String sValue) throws Exception
	{
		String ElementID = "txt_val_2";
		
		Utility.Current_WebElement = Utility.Webdriver.findElement(By.id(ElementID));
		
		boolean bStatus = Utility.Current_WebElement.isDisplayed();
		if(!bStatus) 
		{
			Global.gErrMsg = "Element with ID '" + ElementID + "' not displayed";
			throw new Exception(Global.gErrMsg);
		}
		
		Utility.Current_WebElement.sendKeys(sValue);
	}
	
	@When("^Currency Value for V3 is \"([^\"]*)\"$")
	public static void enterValueForV3(String sValue) throws Exception
	{
		String ElementID = "txt_val_3";
		
		Utility.Current_WebElement = Utility.Webdriver.findElement(By.id(ElementID));
		
		boolean bStatus = Utility.Current_WebElement.isDisplayed();
		if(!bStatus) 
		{
			Global.gErrMsg = "Element with ID '" + ElementID + "' not displayed";
			throw new Exception(Global.gErrMsg);
		}
		
		Utility.Current_WebElement.sendKeys(sValue);
	}
	
	@When("^Currency Value for V4 is \"([^\"]*)\"$")
	public static void enterValueForV4(String sValue) throws Exception
	{
		String ElementID = "txt_val_4";
		
		Utility.Current_WebElement = Utility.Webdriver.findElement(By.id(ElementID));
		
		boolean bStatus = Utility.Current_WebElement.isDisplayed();
		if(!bStatus) 
		{
			Global.gErrMsg = "Element with ID '" + ElementID + "' not displayed";
			throw new Exception(Global.gErrMsg);
		}
		
		Utility.Current_WebElement.sendKeys(sValue);
	}
	
	@When("^Currency Value for V5 is \"([^\"]*)\"$")
	public static void enterValueForV5(String sValue) throws Exception
	{
		String ElementID = "txt_val_5";
		
		Utility.Current_WebElement = Utility.Webdriver.findElement(By.id(ElementID));
		
		boolean bStatus = Utility.Current_WebElement.isDisplayed();
		if(!bStatus) 
		{
			Global.gErrMsg = "Element with ID '" + ElementID + "' not displayed";
			throw new Exception(Global.gErrMsg);
		}
		
		Utility.Current_WebElement.sendKeys(sValue);
	}
	
	@When("^Currency Value for V6 is \"([^\"]*)\"$")
	public static void enterValueForV6(String sValue) throws Exception
	{
		String ElementID = "txt_val_6";
		
		Utility.Current_WebElement = Utility.Webdriver.findElement(By.id(ElementID));
		
		boolean bStatus = Utility.Current_WebElement.isDisplayed();
		if(!bStatus) 
		{
			Global.gErrMsg = "Element with ID '" + ElementID + "' not displayed";
			throw new Exception(Global.gErrMsg);
		}
		
		Utility.Current_WebElement.sendKeys(sValue);
	}
	
	@Then("^Verify the Sum is \"([^\"]*)\"$")
	public static void verifySum(String sSumOfValues) throws Exception
	{
		String ElementID = "txt_ttl_val";
		
		Utility.Current_WebElement = Utility.Webdriver.findElement(By.id(ElementID));
		
		boolean bStatus = Utility.Current_WebElement.isDisplayed();
		if(!bStatus) 
		{
			Global.gErrMsg = "Element with ID '" + ElementID + "' not displayed";
			throw new Exception(Global.gErrMsg);
		}
		
		String sElementText = Utility.getCurrentElementTextValue();
		if(sElementText != sSumOfValues) throw new Exception("Expected sum of all the values is '" + sSumOfValues + "' "
				+ "Actual Displayed Sum is '" + sElementText + "'");
	}
}
