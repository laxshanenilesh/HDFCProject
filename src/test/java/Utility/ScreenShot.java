package Utility;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BasePackage.MainClass;

public class ScreenShot extends MainClass {
    
	public static String Getdate()
	{
		return ("dd-MM-YYYY ss-mm-HH").formatted(new Date());		
	}
	
	    public static void ScreenShotDetails(String MethodName)
	    {
	     File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 	
	     File Dest = new File("C:\\Users\\user\\Pictures\\HDFCProject\\ScreenShot\\"+ MethodName +"--"+Getdate()+".jpeg");
	    }
}
