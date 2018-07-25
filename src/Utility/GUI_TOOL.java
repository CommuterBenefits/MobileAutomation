package Utility;

import javax.swing.JOptionPane;

public class GUI_TOOL {
	
	public static String Select_CellPhone(String Platform)
	{
		String Cellphone=null;
		if(Platform.equalsIgnoreCase(All_Name.Device_Platform.Android))
		{
			Cellphone=(String)JOptionPane.showInputDialog(null, "Please Select Cell Phone::", "Cell Phone Selection",
		        JOptionPane.QUESTION_MESSAGE, null, new Object[] {
		        		All_Name.Device_Name.Phone1,
		        		All_Name.Device_Name.Phone2,
		        		All_Name.Device_Name.Phone3,},
		        		All_Name.Device_Name.Phone1);
		}
		else if (Platform.equalsIgnoreCase(All_Name.Device_Platform.IOS))
		{
			 Cellphone=(String)JOptionPane.showInputDialog(null, "Please Select Cell Phone::", "Cell Phone Selection",
			        JOptionPane.QUESTION_MESSAGE, null, new Object[] {
			        		All_Name.Device_Name.Phone4,
			        		All_Name.Device_Name.Phone5},
			        		All_Name.Device_Name.Phone5);
		}
		
		return Cellphone;
	}
	
	public static String Select_Platform()
	{
		String SiteType=(String)JOptionPane.showInputDialog(null, "Please Select PlatForm::", "Platform Selection",
		        JOptionPane.QUESTION_MESSAGE, null, new Object[] {
		        		All_Name.Device_Platform.Android,
		        		All_Name.Device_Platform.IOS},
		        		All_Name.Device_Platform.Android);
		
		return SiteType;
	}
	
	public static String Select_APK(String Platform)
	{
		String APK=null;
		if(Platform.equalsIgnoreCase(All_Name.Device_Platform.Android))
		{
			APK=(String)JOptionPane.showInputDialog(null, "Please Select App::", "App Selection",
		        JOptionPane.QUESTION_MESSAGE, null, new Object[] {
		        		All_Name.App_Package_Name.Android_App,},
		        		All_Name.App_Package_Name.Android_App);
		}
		else if (Platform.equalsIgnoreCase(All_Name.Device_Platform.IOS))
		{
			APK=(String)JOptionPane.showInputDialog(null, "Please Select App::", "App Selection",
			        JOptionPane.QUESTION_MESSAGE, null, new Object[] {
			        		All_Name.App_Package_Name.IOS_App,},
			        		All_Name.App_Package_Name.IOS_App);
		}
		
		return APK;
	}
	
	public static String Select_Automation_Script()
	{
		String ScriptName=(String)JOptionPane.showInputDialog(null, "Please Select Automation Script :: ", "Hemanshu UI Automation",
		        JOptionPane.QUESTION_MESSAGE, null, new Object[] {
		        		"Login Page",
		        		"Registration Page",
		        		"ForgotPassword Page",
		        		"Home Page"},
		        		"Login Page");
		return ScriptName;
	}
	
	public static void Error_message()
	{
		try
		{
			JOptionPane.showMessageDialog(null, "Execution Terminate You Need to Select Proper Option...");
		}
		catch(Exception e)
		{
			System.out.println("You Need To Select Options otherwise script will not continue....");
		}
	}
	
	public static void Exception_Error_Message(Exception e)
	{
		try
		{
			JOptionPane.showMessageDialog(null, e);
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
	}
	
	public static void message(String x)
	{
		try
		{
			JOptionPane.showMessageDialog(null, x);
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
	}

}
