package MobileTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.net.URL;
import java.net.MalformedURLException;
import java.net.URL;
//import java.net.MalformedURLException;
//import java.net.URL;
//import io.appium.java_client.remote.MobileCapabilityType;
import MobileTestFactory.Test_NoCards;
import MobileTestFactory.Test_GuestLogIn;
import MobileTestFactory.Test_Nutrisavings_Login_Logout;

public class Nutrisavings_Login_Logout {

//	static WebDriver driver;
	static AndroidDriver driver;
	static String[] App={"NutriSavings","EatRight Rewards","Health-e-Basket"};	
	static String[] appPackage={"com.nutrisavingsapp","com.eatrightrewardsapp","com.healthebasketapp"};
	static String[] appActivity={"com.nutrisavingsapp.SplashScreenActivity","com.eatrightrewardsapp.SplashScreenActivity","com.healthebasketapp.SplashScreenActivity"};
	static String[] phone={"Galaxy S7","HemanshusPhone","Huawei Honor","Galaxy S4"};
	static String[] deviceName={"15e0c858","LGH3455cbcd447","HSMDU17216004428",""};
	static String[] Version={"6.0.1","5.1.1","6.0",""};
//	static String deviceName="LGH3455cbcd447";
//	static String deviceName="15e0c858";
	static String BrowserName="Android";
//	static String Version="5.1.1";
//	static String Version="6.0.1";
	static String PlatformName="Android";
//	static String appPackage="com.nutrisavingsapp";
//	static String appActivity="com.nutrisavingsapp.SplashScreenActivity";
	static String username="hemanshurana@gmail.com";
	static String password="Purvi123456";
	static Test_Nutrisavings_Login_Logout objloginout;
	static Test_GuestLogIn guestloginmodule;
	static Test_NoCards user_nocards;
	
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		int phone = 2;
		int appnumber = 0;
		
		String Path_to_NutriSavings_APK = "/Users/nutrisavings-app-developer/Desktop/HTML Emails/Automation/AndroidAPK20170127/AndroidOld-NS-production-release.apk";
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("appPath", Path_to_NutriSavings_APK);
		caps.setCapability("appPackage", "com.nutrisavingsapp");
		caps.setCapability("appActivity", "com.nutrisavingsapp.SplashScreenActivity");
		caps.setCapability("deviceName", "HSMDU17216004428");
		caps.setCapability("platformName", "Android");
		caps.setCapability(MobileCapabilityType.VERSION, "6.0");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);

//		driver=Utility.Setupmobile.MobileSetup(deviceName[phone], BrowserName, Version[phone], PlatformName, appPackage[appnumber], appActivity[appnumber]);
		
		try
		{
			if(driver!=null)
			{
//				guestloginmodule=new Test_GuestLogIn(driver);
//				objloginout=new Test_Nutrisavings_Login_Logout(driver);
//				objloginout.login(username, password);
//				guestloginmodule.branding(appnumber);
				
				user_nocards = new Test_NoCards(driver);
				user_nocards.no_cards_tests(appnumber);
				driver.quit();
			}
			else
			{
				System.out.println("Mobile Setup Not Successful......");
//				Scanner scan=new Scanner(System.in);
//				selectCompany = scan.nextInt()
			}
		}
		catch(Exception e)
		{
			
		}
	}

}
