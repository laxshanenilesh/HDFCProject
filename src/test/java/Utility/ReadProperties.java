package Utility;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import BasePackage.MainClass;

public class ReadProperties extends MainClass {

	 public static String FileRead(String value) throws IOException
	 {
		
		 Properties pro=new Properties();
		 FileInputStream file=new FileInputStream("C:\\Users\\user\\Pictures\\HDFCProject\\HDFC.properties");			 
	//	 InputStream file = getClassLoader().getResourceAsStream("HDFC.properties");
		 pro.load(file);
		return pro.getProperty(value).trim();
		 
	 }
}
