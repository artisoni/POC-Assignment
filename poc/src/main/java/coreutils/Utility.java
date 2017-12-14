package main.java.coreutils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.*;
import java.util.Locale;

public class Utility 
{
	//public static DesiredCapabilities Capabilities = null;
	public static WebDriver Webdriver = null;
	public static WebElement Current_WebElement;
	
	public static void startDriver(String sBrowserType, String sAppURL)
	{
		try
		{
			if (sBrowserType.trim().equalsIgnoreCase(Global.BROWSER_CHROME))
			{
				System.out.println("Starting Chrome browser");
				
				System.setProperty("webdriver.chrome.driver", Global.Chrome_Driver_Path);
				
				Webdriver = new ChromeDriver();
				Webdriver.get(sAppURL);
			}
			
			Webdriver.manage().window().maximize();
		}
		catch(Exception e)
		{
			Global.gErrMsg = "Unable to start the driver " + e.getMessage();
			System.out.println(Global.gErrMsg);
		}
	}

	public static String getCurrentElementTextValue()
	{
		String sElementTextValue = Current_WebElement.getText();
		
		if(sElementTextValue.trim().length() == 0)
			sElementTextValue = Current_WebElement.getAttribute("Value");
		
		return sElementTextValue;
	}
	
	public static void closeBrowser()
	{
		Webdriver.close();
	}
	
	public static boolean verifyCurrentElementNumberFormat()
	{
		String sValue = getCurrentElementTextValue();
		int ConvertedIntegerValue = 0;
		
		Locale locale = new Locale("en", "US");
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
		try
		{
			currencyFormat.format(sValue);	
		}
		catch(Exception e)
		{
			Global.gErrMsg = "Value for '" + Current_WebElement.toString() + "' is not in currency format";
			return false;
		}
		
		if(ConvertedIntegerValue > 0) return true;
		else return false;
		
	}
	
	public static boolean verifyCurrentElementTextIsGreatherThanZero()
	{	
		String sValue = getCurrentElementTextValue();
				
		int ConvertedIntegerValue = 0;
		
		try{ ConvertedIntegerValue = Integer.parseInt(sValue); }
		catch(Exception e) 
		{
			Global.gErrMsg = "Value for '" + Current_WebElement.toString() + "' is not greater than zero";
			return false;
		}
		
		if(ConvertedIntegerValue > 0) return true;
		else return false;
		
	}
}
