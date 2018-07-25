package MobileTestFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.remote.Augmenter;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import ElementsFactory.Element;
import ElementsFactory.Nutrisaving_CategoriesPage;
import ElementsFactory.Nutrisaving_LoginPage;
import ElementsFactory.NutriSavings_GuestLogIn;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Test_GuestLogIn {

	WebDriver driver;
	File file;
	String timeStamp;
	public static ExtentReports newhomepage;
	public ExtentTest newhome_test;
	Nutrisaving_LoginPage objloginpage;
	Nutrisaving_CategoriesPage objcate;
	Element branding;
	static String[] App={"NutriSavings","EatRight Rewards","Health-e-Basket"};	
	
	public Test_GuestLogIn(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	public void returnResults(String actualtext, String expectedtext, String reportmessage, String page){
		if( actualtext.equals( expectedtext ) )
		{
			System.out.println("✓ " + reportmessage + " on page " + page + " confirmed.");
		} 
		else 
		{
			System.out.println("X " + reportmessage + " on page " + page + " failed.");
			System.out.println("  Expected: " + expectedtext);
			System.out.println("    Actual: " + actualtext);
		}
	}
	
//	String Path_to_NutriSavings_APK = "/Users/nutrisavings-app-developer/Desktop/HTML Emails/Automation/AndroidAPK20170127/AndroidOld-NS-production-release.apk";
	
	public void branding(int appNumber) throws MalformedURLException
	{
//		AndroidDriver<?> androiddriver;
//		DesiredCapabilities caps = new DesiredCapabilities();
//
//		caps.setCapability("appPath", Path_to_NutriSavings_APK);
//
//		caps.setCapability("appPackage", "com.nutrisavingsapp");
//
//		caps.setCapability("appActivity", "com.nutrisavingsapp.SplashScreenActivity");
//
//		caps.setCapability("deviceName", "HSMDU17216004428");
//
//		caps.setCapability("platformName", "Android");
//
//		caps.setCapability(MobileCapabilityType.VERSION, "6.0");
//		
//		
//		
//		AndroidDriver<WebElement> androiddriver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);

		timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		newhomepage=new ExtentReports("/Users/nutrisavings-app-developer/Desktop/HTML Emails/Automation/Reports/Reports"+timeStamp+".htm",true);
		
		int intscrollStart, intscrollEnd;
		Dimension dimensions = driver.manage().window().getSize();
		System.out.println(dimensions);
		Double screenHeightStart = dimensions.getHeight() * 0.5;
		intscrollStart = screenHeightStart.intValue();
		Double screenHeightEnd = dimensions.getHeight() * 0.2;
		intscrollEnd = screenHeightEnd.intValue();
		
//		WebDriver driver1 = new Augmenter().augment(driver);

		branding = new Element(driver);

		//swipe_opts = {};
		try
		{
			String timeStamp;
			String page = "SplashScreen";
			String pagenospace = "SplashScreen";
			timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
			file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File( timeStamp + "Screenshot" + pagenospace + ".jpg"));
			Thread.sleep(4000);
			page = "PreLogin";
			pagenospace = page.replaceAll("\\s","");
			timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
			file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File( "./screenshots/"  + "Screenshot" + pagenospace + ".jpg"));

			String welcometotext = branding.prelogin_welcometo.getText();
			//if(welcometotext == "Welcome to " + App[appNumber]){

			if(welcometotext.equals("Welcome to " + App[appNumber])){
				System.out.println("✓ Welcome to text confirmed.");
			} else {
				System.out.println("X Welcome to text is wrong.");
			}
			
			branding.signinasguest.click();
			Thread.sleep(1000);

			String expectedtext;
			String actualtext;
			String reportmessage;
			String reportmessage_guestoverlayscreentext = "Guest log in overlay screen text";
			String guestoverlaytext;
			String expectedguestoverlaytext = "Your employer or health plan must offer " + App[appNumber]+ " as an employee benefit program.";
			String expectedguestpopuptext =   "Your employer or health plan must offer " + App[appNumber]+ " as an employee benefit program.";

			page = "Food Catalog";
			pagenospace = page.replaceAll("\\s","");
			timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
			file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File( timeStamp + "Screenshot" + pagenospace + ".jpg"));
	
			newhome_test=newhomepage.startTest("<B>Verify Images Loading on Home Page:::::</B>");
//			verify_imageload();
			report_complete();
			
			// Verify Navigation Bar Links...
			newhome_test=newhomepage.startTest("<B>Verify Navigation Links on Home Page:::::</B>");
//			content_verify=false; // condition to check only link
			
			newhome_test.log(LogStatus.INFO, "<B>Test My Profile Links On Navigation Bar</B>");
//			myprofile_link(content_verify);
			report_complete();

			newhome_test.log(LogStatus.PASS, "<B>Test My Profile Links On Navigation Bar</B>");
//			myprofile_link(content_verify);
			report_complete();

			newhome_test.log(LogStatus.FAIL, "<B>Test My Profile Links On Navigation Bar</B>");
//			myprofile_link(content_verify);
			report_complete();

			newhome_test.log(LogStatus.FATAL, "<B>Test My Profile Links On Navigation Bar</B>");
//			myprofile_link(content_verify);
			report_complete();

			newhome_test.log(LogStatus.ERROR, "<B>Test My Profile Links On Navigation Bar</B>");
//			myprofile_link(content_verify);
			report_complete();
			
			newhome_test.log(LogStatus.WARNING, "<B>Test My Profile Links On Navigation Bar</B>");
//			myprofile_link(content_verify);
			report_complete();
			
			newhome_test.log(LogStatus.SKIP, "<B>Test My Profile Links On Navigation Bar</B>");
//			myprofile_link(content_verify);
			report_complete();

			newhome_test.log(LogStatus.FAIL,"Deal Should Not Be Zero"+newhome_test.addScreenCapture("/Users/nutrisavings-app-developer/Code/eclipse_workspace/mobileautomation/mobileautomation/screenshots/ScreenshotPreLogin.jpg"));
			report_complete();

			
//			branding.foodcatalog_category_produce.scrollIntoView();
			
//			scrollelement(branding.foodcatalog_category_produce);
//			((AppiumDriver) driver).scrollToExact("Text");
//			androiddriver.scrollTo("Views");

			
//			AndroidDriver<WebElement> androiddriver;			
//			androiddriver = ((AndroidDriver) driver);
//			androiddriver.swipe(0, intscrollStart, 0, intscrollEnd, 1000);

//			((AndroidDriver) driver).swipe(0, intscrollStart, 0, intscrollEnd, 1000);

			Thread.sleep(1000);
			
//			AndroidDriver androiddriver;
//			androiddriver = ((AndroidDriver) driver);
//			androiddriver.swipe(0, intscrollStart, 0, intscrollEnd, 1000);

			((AndroidDriver) driver).swipe(0, intscrollStart, 0, intscrollEnd, 1000);

//			TouchAction action = new TouchAction((MobileDriver)driver);
//			action.press(100,100).moveTo(100,100).release();
			
			Thread.sleep(1000);
	
			branding.navmenu.click();
			branding.navmenu_shoppingtrips.click();
			Thread.sleep(1000);

			page = "Shopping Trips";
			pagenospace = page.replaceAll("\\s","");
			timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
			
			file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(file, new File( timeStamp + "Screenshot" + pagenospace + ".jpg"));
			
			reportmessage = reportmessage_guestoverlayscreentext;
			expectedtext = expectedguestoverlaytext;

			actualtext = branding.guestoverlaytext.getText();
			returnResults(actualtext, expectedtext, reportmessage, page);
	
			branding.navmenu.click();
			branding.navmenu_stores.click();
			Thread.sleep(1000);

			reportmessage = reportmessage_guestoverlayscreentext;
			page = "Stores";
			expectedtext = expectedguestoverlaytext;

			actualtext = branding.guestoverlaytext.getText();
			returnResults(actualtext, expectedtext, reportmessage, page);

			branding.navmenu.click();
			branding.navmenu_offers.click();
			Thread.sleep(1000);

			reportmessage = reportmessage_guestoverlayscreentext;
			page = "Offers";
			expectedtext = expectedguestoverlaytext;

			actualtext = branding.guestoverlaytext.getText();
			returnResults(actualtext, expectedtext, reportmessage, page);
			
			branding.navmenu.click();
			branding.navmenu_sales.click();
			Thread.sleep(1000);

			reportmessage = reportmessage_guestoverlayscreentext;
			page = "Sales";
			expectedtext = expectedguestoverlaytext;

			actualtext = branding.guestoverlaytext.getText();
			returnResults(actualtext, expectedtext, reportmessage, page);

			branding.navmenu.click();
			branding.navmenu_shoppinglist.click();
			Thread.sleep(1000);

			reportmessage = reportmessage_guestoverlayscreentext;
			page = "Shopping List";
			expectedtext = expectedguestoverlaytext;

			actualtext = branding.guestoverlaytext.getText();
			returnResults(actualtext, expectedtext, reportmessage, page);
			
			branding.navmenu.click();
			branding.navmenu_cashrewards.click();
			Thread.sleep(1000);

			reportmessage = reportmessage_guestoverlayscreentext;
			page = "Cash Rewards page";
			expectedtext = expectedguestoverlaytext;

			actualtext = branding.guestoverlaytext.getText();
			returnResults(actualtext, expectedtext, reportmessage, page);
				
			branding.navmenu.click();
			branding.navmenu_settings.click();
			
			//	System.out.println("In Settings Page");
			
			Thread.sleep(2000);
			branding.settingspage_profile.click();

			reportmessage = reportmessage_guestoverlayscreentext;
			page = "Health Profile page";
			expectedtext = expectedguestoverlaytext;

			actualtext = branding.guestoverlaytext.getText();
			returnResults(actualtext, expectedtext, reportmessage, page);

			branding.settingsdetailspage_backarrow.click();

			// Trigger pop up / aka navigate to "page" aka visit
			branding.settingspage_personalinfo.click();

			reportmessage = "Guest log in pop up text";
			page = "Personal Information";
			expectedtext = expectedguestpopuptext;

			actualtext = branding.guestlogin_popup.getText();
			returnResults(actualtext, expectedtext, reportmessage, page);
			
			// Return to "base" page
			branding.guestlogin_popup_ok.click();
			Thread.sleep(1000);	
						
//			Thread.sleep(2000);
//			branding.settingspage_personalinfo.click();
//			Thread.sleep(2000);
//			page = "Personal Information";
//			guestoverlaytext = branding.guestlogin_popup.getText();
//			if(guestoverlaytext.equals( ("Your employer or health plan must offer " + App[appNumber])+ " as an employee benefit program." )){
//				System.out.println("✓ Guest log in pop up text confirmed." + page);
//			} else {
//				System.out.println("X Guest log in pop up text is wrong." + page);
//			}
//
//			branding.guestlogin_popup_ok.click();
			
			branding.settingspage_notifications.click();
			page = "Notifications";
			expectedtext = expectedguestpopuptext;
			
			actualtext = branding.guestlogin_popup.getText();
			returnResults(actualtext, expectedtext, reportmessage, page);
			
			branding.guestlogin_popup_ok.click();
			Thread.sleep(1000);			
			
			branding.navmenu.click();
			Thread.sleep(1000);
			branding.navmenu_foodcatalog.click();

			Thread.sleep(1000);
//			branding.foodcatalog_category_bakingingredients.click();
//			Thread.sleep(1000);
//			branding.foodcatalog_subcategory_bakingsoda.click();
//			Thread.sleep(1000);

			
//			// java
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			HashMap<String, String> scrollObject = new HashMap<String, String>();
//			scrollObject.put("direction", "down");
//			js.executeScript("mobile: scroll", scrollObject);
			
			
//			Dimension dimensions = branding.manage().window().getSize();
//			Double screenHeightStart = dimensions.getHeight() * 0.5;
//			int scrollStart = screenHeightStart.intValue();
//			System.out.println("s="+scrollStart);
//			Double screenHeightEnd = dimensions.getHeight() * 0.2;
//			int scrollEnd = screenHeightEnd.intValue();
//			branding.swipe(0,scrollStart,0,scrollEnd,2000);
								
//			File screenshotFile = branding.getScreenshotAs(OutputType.FILE);

//			WebDriver driver1 = new Augmenter().augment(branding);
//			WebDriver driver1 = new Augmenter().augment((WebDriver) branding);
			
//			file  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(file, new File("Screenshot2.jpg"));

			Thread.sleep(1000);

//			scrollelement(branding.foodcatalog_category_produce);
//			scrollelement(branding.foodcatalog_category_drinks);

			((AndroidDriver) driver).swipe(0, intscrollStart, 0, intscrollEnd, 1000);
			Thread.sleep(1000);
			((AndroidDriver) driver).swipe(0, intscrollStart, 0, intscrollEnd, 1000);
			Thread.sleep(1000);
			((AndroidDriver) driver).swipe(0, intscrollStart, 0, intscrollEnd, 1000);
			Thread.sleep(1000);

			branding.foodcatalog_category_produce.click();
			Thread.sleep(1000);
			branding.foodcatalog_subcategory_fresh.click();
			Thread.sleep(1000);
			Thread.sleep(1000);
			
			branding.addtolistbutton.click();

			Thread.sleep(2000);
			reportmessage = "Guest log in pop up text";
			page = "Product Index page";
			expectedtext = expectedguestpopuptext;

			actualtext = branding.guestlogin_popup.getText();
			returnResults(actualtext, expectedtext, reportmessage, page);
			
			branding.guestlogin_popup_ok.click();
			Thread.sleep(1000);

			branding.productindex_firstproduct.click();
			Thread.sleep(1000);
			branding.addtolistbutton.click();

			Thread.sleep(2000);
			reportmessage = "Guest log in pop up text";
			page = "Product Details page";
			expectedtext = expectedguestpopuptext;

			actualtext = branding.guestlogin_popup.getText();
			returnResults(actualtext, expectedtext, reportmessage, page);

			branding.guestlogin_popup_ok.click();

			branding.settingsdetailspage_backarrow.click();
			branding.settingsdetailspage_backarrow.click();

			branding.navmenu.click();
			branding.navmenu_settings.click();
			Thread.sleep(1000);

			// Rate Our App was removed for Guests
			/*
			branding.settingspage_rateourapp.click();
			page = "Rate Our App";
			actualtext = branding.rateourapp_popup.getText();
			expectedtext = "Do you like the " + App[appNumber] + " app?";
			returnResults(actualtext, expectedtext, reportmessage, page);
			
			branding.rateourapp_popup_yesbutton.click();

			page = "Rate Our App Affirmative";
			expectedtext = "We're so happy to hear that you enjoy " + App[appNumber] + ". Please take a moment to rate us in the PlayStore!";
			actualtext = branding.rateourapp_affirmative_popup.getText();

			returnResults(actualtext, expectedtext, reportmessage, page);
			
			branding.rateourapp_popup_ratethisappbutton.click();
			Thread.sleep(2000);


			page = "Play Store";
			reportmessage = "App description ";
			expectedtext = App[appNumber];
			actualtext = branding.playstore_appdescription.getText();
			returnResults(actualtext, expectedtext, reportmessage, page);

			//	Can't click back arrow in Play Store - test ends here.		
			*/

			System.out.println("Finished completely!");	

//			objloginpage.email_textbox.sendKeys(username);
//			objloginpage.password_textbox.sendKeys(password);
//			objloginpage.login_button.click();
//			objcate=new Nutrisaving_CategoriesPage(driver);
//			objcate.Open_Navigation_Button.click();
//			//
//			objcate.settings_page.click();
//			Thread.sleep(2000);
//			objcate.logout.click();
//			Thread.sleep(2000);
//			objcate.popup_logout.click();
//			System.out.println("Finished successfully!");
		}
		catch(Exception e)
		{
			System.out.println("Finished partially!");			
		}
	}
	
	public void report_complete() // Function for report complete
	{
		try
		{
			newhomepage.endTest(newhome_test);
			newhomepage.flush();
		}
		catch(Exception e)
		{
			System.out.println("Report Complete Error::::");
		}
	}
	


	
//	private void take_screenshort(String s) throws Exception // Method to take Screeen short.......
//	{
//		try
//		{
//			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(scrFile, new File("D:\\Error_img\\Production\\NewHomePage\\newhome_"+currentdate+"_"+s+".png"));
//		}
//		catch(Exception e)
//		{
//			newhome_test.log(LogStatus.WARNING, "Some Error When Captured Image");
//		}
//	}
//	
//	private void scrollelement(WebElement element) throws Exception  // Function for scroll on element...
//	{
//		try
//		{
//			JavascriptExecutor scroll=(JavascriptExecutor)driver;
//			scroll.executeScript("arguments[0].scrollIntoView();", element);
//			Thread.sleep(2000);
//		}
//		catch(Exception e)
//		{
//			// No Action
//		}
//	}
//	
	
	
//	private void scrollelement(WebElement element) throws Exception  // Function for scroll on element...
//	{
//		try
//		{
//			System.out.println("Trying to scroll? ");
//
//			JavascriptExecutor scroll=(JavascriptExecutor)driver;
//			scroll.executeScript("arguments[0].scrollIntoView();", element);
//			Thread.sleep(2000);
//		}
//		catch(Exception e)
//		{
//			// No Action
//			System.out.println("Exception ");
//		}
//	}
	
	
}
