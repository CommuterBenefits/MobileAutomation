package Utility;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Setupmobile {
	
	static AndroidDriver<WebElement> driver;
	
	public static AndroidDriver<WebElement> MobileSetup(String Path_to_NutriSavings_APK ,String deviceName, String BrowserName, String Version, String platformName, String appPackage, String appActivity)
	{
		try
		{
			// Created object of DesiredCapabilities class.
			DesiredCapabilities capabilities = new DesiredCapabilities();
			
			//set App path
			capabilities.setCapability("appPath", Path_to_NutriSavings_APK);
			
			// Set android deviceName desired capability. Set your device name.
			capabilities.setCapability("deviceName", deviceName);
			
			// Set BROWSER_NAME desired capability. It's Android in our case here.
			capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserName);
			
			// Set android VERSION desired capability. Set your mobile device's OS version.
			capabilities.setCapability(MobileCapabilityType.VERSION, Version);
			
			// Set android platformName desired capability. It's Android in our case here.
			capabilities.setCapability("platformName", platformName);
			
			// Set android appPackage desired capability. It is
			// com.android.calculator2 for calculator application.
			// Set your application's appPackage if you are using any other app.
			capabilities.setCapability("appPackage", appPackage);
			
			// Set android appActivity desired capability. It is
			// com.android.calculator2.Calculator for calculator application.
			// Set your application's appPackage if you are using any other app.
			capabilities.setCapability("appActivity", appActivity);
			
			// Created object of RemoteWebDriver will all set capabilities.
			// Set appium server address and port number in URL string.
			// It will launch calculator app in android device.
			driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			//driver=new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		//	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			return driver;
		}
		catch(Exception e)
		{
			return null;
		}
		
	}	
}
