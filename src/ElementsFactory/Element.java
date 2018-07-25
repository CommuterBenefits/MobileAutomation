package ElementsFactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Element {

	WebDriver driver;

	// Pre-Login elements
	public @FindBy(xpath="//android.widget.Button[contains(@resource-id,'sign_in_button')]")
	WebElement prelogin_login_button;
	
	// Log In Page
	public @FindBy(xpath="//android.widget.EditText[contains(@resource-id,'email')]")
	WebElement email_textbox;
	
	public @FindBy(xpath="//android.widget.EditText[contains(@resource-id,'password')]")
	WebElement password_textbox;
	
	public @FindBy(xpath="//android.widget.Button[contains(@resource-id,'email_sign_in_button')]")
	WebElement login_button;

	// Upon Login
	public @FindBy(xpath="//android.widget.Button[@text='Allow']")
	WebElement allow_button;
	
	
	// My Stores Page

	public @FindBy(xpath="//android.widget.TextView[contains(@text,'Get Started - It\'s Easy!')]")
	WebElement storespage_nocard_title;
	
	
	public @FindBy(xpath="//android.widget.TextView[contains(@text,'Select the stores where you shop.')]")
//	public @FindBy(xpath="//android.widget.LinearLayout[0]/android.widget.TextView[1]")
	WebElement storespage_nocard_instruction1;

	public @FindBy(xpath="//android.widget.TextView[contains(@text,'Add your rewards card or information.')]")
//	public @FindBy(xpath="//android.widget.LinearLayout[1]/android.widget.TextView[1]")
	WebElement storespage_nocard_instruction2;

	public @FindBy(xpath="//android.widget.TextView[contains(@text,'Go shopping and earn cash back on healthy groceries!')]")
//	public @FindBy(xpath="//android.widget.LinearLayout[2]/android.widget.TextView[1]")
	WebElement storespage_nocard_instruction3;

	// Navigation elements
	
	public @FindBy(xpath="//android.widget.ImageButton[@content-desc='Open navigation drawer']")
	WebElement navmenu;
	
	public @FindBy(xpath="//android.widget.CheckedTextView[contains(@text,'Food Catalog')]")
	WebElement navmenu_foodcatalog;

	public @FindBy(xpath="//android.widget.CheckedTextView[contains(@text,'My Shopping Trips')]")
	WebElement navmenu_shoppingtrips;

	public @FindBy(xpath="//android.widget.CheckedTextView[contains(@text,'My Stores')]")
	WebElement navmenu_stores;
	
	public @FindBy(xpath="//android.widget.CheckedTextView[contains(@text,'Offers')]")
	WebElement navmenu_offers;

	public @FindBy(xpath="//android.widget.CheckedTextView[contains(@text,'Store Sales')]")
	WebElement navmenu_sales;
	
	public @FindBy(xpath="//android.widget.CheckedTextView[contains(@text,'My Shopping List')]")
	WebElement navmenu_shoppinglist;
	
	public @FindBy(xpath="//android.widget.CheckedTextView[contains(@text,'My Cash Rewards')]")
	WebElement navmenu_cashrewards;
	
	public @FindBy(xpath="//android.widget.CheckedTextView[contains(@text,'Scan Products')]")
	WebElement navmenu_scanproducts;
	
	public @FindBy(xpath="//android.widget.CheckedTextView[contains(@text,'Settings')]")
	WebElement navmenu_settings;


	public @FindBy(xpath="//android.widget.ImageButton[@content-desc='Navigate up']")
	WebElement settingsdetailspage_backarrow;
//	xpath: //android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]
	
	public @FindBy(xpath="//android.widget.TextView[contains(@text,'Health Profile')]")
	WebElement settingspage_profile;

	public @FindBy(xpath="//android.widget.TextView[contains(@text,'Personal Information')]")
	WebElement settingspage_personalinfo;

	public @FindBy(xpath="//android.widget.TextView[contains(@text,'Notifications')]")
	WebElement settingspage_notifications;

	public @FindBy(xpath="//android.widget.TextView[contains(@text,'Rate Our App')]")
	WebElement settingspage_rateourapp;

	public @FindBy(xpath="//android.widget.TextView[@resource-id='android:id/message']")
	WebElement guestlogin_popup;

	public @FindBy(xpath="//android.widget.TextView[@resource-id='android:id/message']")
	WebElement rateourapp_popup;

	public @FindBy(xpath="//android.widget.Button[@resource-id='android:id/button1']")
	WebElement rateourapp_popup_yesbutton;

	public @FindBy(xpath="//android.widget.TextView[@resource-id='android:id/message']")
	WebElement rateourapp_affirmative_popup;
	
	public @FindBy(xpath="//android.widget.Button[@resource-id='android:id/button1']")
	WebElement rateourapp_popup_ratethisappbutton;

//	public @FindBy(xpath="//android.widget.FrameLayout[@resource-id='com.android.vending:id/callout']")
	public @FindBy(xpath="//android.widget.TextView[1]")
	WebElement playstore_appdescription;

	public @FindBy(xpath="//android.widget.Button[@resource-id='android:id/button1']")
	WebElement guestlogin_popup_ok;
	
	public @FindBy(xpath="//android.widget.TextView[contains(@text,'Baking Ingredients')]")
	WebElement foodcatalog_category_bakingingredients;

	public @FindBy(xpath="//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.TextView[1]")
	WebElement foodcatalog_subcategory_bakingsoda;
	
	public @FindBy(xpath="//android.widget.TextView[contains(@text,'Produce')]")
	WebElement foodcatalog_category_produce;
	
	public @FindBy(xpath="//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.widget.FrameLayout[4]/android.widget.FrameLayout[1]/android.widget.TextView[1]")
	WebElement foodcatalog_subcategory_fresh;
	

	public @FindBy(xpath="//android.widget.TextView[contains(@text,'Drinks')]")
	WebElement foodcatalog_category_drinks;

	
	
	
	
	public @FindBy(xpath="//android.widget.Button[contains(@text,'Add to List')]")
	WebElement addtolistbutton;
	
	public @FindBy(xpath="//android.widget.RelativeLayout[1]")
	WebElement productindex_firstproduct;
	
	
	//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[3]
	
	
	
	public @FindBy(xpath="//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	WebElement prelogin_welcometo;
	
	public @FindBy(xpath="//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.TextView[1]")
	WebElement signinasguest;
	
//	public @FindBy(xpath="//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]")
//	WebElement guestoverlaytext;
	
//	public @FindBy(xpath="//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]")
//	WebElement guestoverlaytext2;
	
	public @FindBy(xpath="//android.widget.TextView[2]")
	WebElement guestoverlaytext;
	
	
	
	
	
	public @FindBy(xpath="//android.widget.CheckedTextView[@text='Log Out']")
	WebElement logout_button;
	
	public @FindBy(xpath="//android.widget.Button[contains(@resource-id,'button1')]")
	WebElement popup_logout;
	
	public @FindBy(xpath="//android.widget.TextView[contains(@resource-id,'log_out')]")
	WebElement logout;

	
	public Element(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


//	public void scrollelement(WebElement element) throws Exception {
//		// TODO Auto-generated method stub
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
//
//	}
}
