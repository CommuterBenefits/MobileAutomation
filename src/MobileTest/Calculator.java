package MobileTest;

import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import MobileTestFactory.Test_Calculator;

public class Calculator {

	static WebDriver driver;
	static String deviceName="LGH3455cbcd447";
	static String BrowserName="Android";
	static String Version="5.1.1";
	static String PlatformName="Android";
	static String appPackage="com.android.calculator2";
	static String appActivity="com.android.calculator2.Calculator";
	
	static Test_Calculator objcalc; 
	
	
	public static void main(String[] args) throws MalformedURLException 
	{
		// TODO Auto-generated method stub
		driver=Utility.Setupmobile.MobileSetup(deviceName, BrowserName, Version, PlatformName, appPackage, appActivity);
		try
		{
			if(driver!=null)
			{
				objcalc=new Test_Calculator(driver);
				objcalc.sum();
				driver.quit();
			}
			else
			{
				System.out.println("Mobile Setup Not Successfully......");
			}
		}
		catch(Exception e)
		{
			
		}
	}
}
