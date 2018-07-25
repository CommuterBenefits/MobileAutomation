package ElementsFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Nutrisaving_CategoriesPage {

	WebDriver driver;
	
	public @FindBy(xpath="//android.widget.ImageButton[@content-desc='Open navigation drawer']")
	WebElement Open_Navigation_Button;
	
	public @FindBy(xpath="//android.widget.CheckedTextView[@text='Log Out']")
	WebElement logout_button;
	
	public @FindBy(xpath="//android.widget.Button[contains(@resource-id,'button1')]")
	WebElement popup_logout;
	
	public @FindBy(xpath="//android.widget.CheckedTextView[contains(@text,'Settings')]")
	WebElement settings_page;
	
	public @FindBy(xpath="//android.widget.TextView[contains(@resource-id,'log_out')]")
	WebElement logout;

	
	public Nutrisaving_CategoriesPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
