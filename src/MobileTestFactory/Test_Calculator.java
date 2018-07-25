package MobileTestFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test_Calculator {

	@FindBy(xpath="//android.widget.ImageButton[contains(@resource-id,'allClear')]")
	WebElement allclear;
	
	@FindBy(xpath="//android.widget.ImageButton[contains(@resource-id,'digit2')]")
	WebElement digit2;
	
	@FindBy(xpath="//android.widget.ImageButton[contains(@resource-id,'digit5')]")
	WebElement digit5;
	
	@FindBy(xpath="//android.widget.ImageButton[contains(@resource-id,'plus')]")
	WebElement plus;
	
	@FindBy(xpath="//android.widget.ImageButton[contains(@resource-id,'equal')]")
	WebElement equal;
	
	@FindBy(className="com.android.calculator2.CalculatorEditText")
	WebElement Text;
	
	WebDriver driver;
	
	public Test_Calculator(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	public void sum()
	{
		try
		{
			allclear.click();
			digit2.click();
			plus.click();
			digit5.click();
			equal.click();
			String result=Text.getText();
			System.out.println("Number sum result is : " + result);
		}
		catch(Exception e)
		{
			
		}
	}
}
