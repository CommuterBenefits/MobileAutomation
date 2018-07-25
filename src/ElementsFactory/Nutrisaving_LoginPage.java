package ElementsFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Nutrisaving_LoginPage {

	WebDriver driver;
	
	public @FindBy(xpath="//android.widget.Button[contains(@resource-id,'sign_in_button')]")
	WebElement signin_button;
	
	public @FindBy(xpath="//android.widget.Button[contains(@resource-id,'register_button')]")
	WebElement signup_button;
	
	public @FindBy(xpath="//android.widget.EditText[contains(@resource-id,'email')]")
	WebElement email_textbox;
	
	public @FindBy(xpath="//android.widget.EditText[contains(@resource-id,'password')]")
	WebElement password_textbox;
	
	public @FindBy(xpath="//android.widget.Button[contains(@resource-id,'email_sign_in_button')]")
	WebElement login_button;
	
	public @FindBy(xpath="//android.widget.TextView[@text='This field is required']")
	WebElement email_validation_text;
	
	public @FindBy(xpath="//android.widget.TextView[@text='A password is required']")
	WebElement password_validation_text;
	
	public @FindBy(xpath="//android.widget.TextView[@text='Your password must contain at least 8 characters including at least 1 digit, 1 upper case and 1 lower case letters.']")
	WebElement password_verify_text;
	
	public @FindBy(xpath="//android.widget.ImageButton[contains(@resource-id,'email_clear')]")
	WebElement emailclear_button;
	
	public @FindBy(xpath="//android.widget.ImageButton[contains(@resource-id,'password_clear')]")
	WebElement passwordclear_button;

	public @FindBy(xpath="//android.widget.TextView[@text='Forgot Password?']")
	WebElement forgotpass_link;
	
	public Nutrisaving_LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
}
