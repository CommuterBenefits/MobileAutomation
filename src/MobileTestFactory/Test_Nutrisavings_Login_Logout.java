package MobileTestFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ElementsFactory.Nutrisaving_CategoriesPage;
import ElementsFactory.Nutrisaving_LoginPage;

public class Test_Nutrisavings_Login_Logout {

	WebDriver driver;
	Nutrisaving_LoginPage objloginpage;
	Nutrisaving_CategoriesPage objcate;
	
	public Test_Nutrisavings_Login_Logout(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	public void login(String username, String password)
	{
		objloginpage=new Nutrisaving_LoginPage(driver);
		//swipe_opts = {};
		try
		{
			objloginpage.signin_button.click();
			objloginpage.email_textbox.sendKeys(username);
			objloginpage.password_textbox.sendKeys(password);
			objloginpage.login_button.click();
			objcate=new Nutrisaving_CategoriesPage(driver);
			objcate.Open_Navigation_Button.click();
			//
			objcate.settings_page.click();
			Thread.sleep(2000);
			objcate.logout.click();
			Thread.sleep(2000);
			objcate.popup_logout.click();
			System.out.println("Finished successfully!");
		}
		catch(Exception e)
		{
			System.out.println("Finished partially!");			
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
//	private void scrollelement(WebElement element) throws Exception  // Function for scorll on element...
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
	
}
