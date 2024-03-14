package utilsLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import baseLayer.BaseClass;

public class TakeScreenshot extends BaseClass{

	
	public static void takeScreenshot() {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		try {
			FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE), 
									new File(System.getProperty("user.dir")+"\\Screenshots\\"+date()+".png"));
		} catch (WebDriverException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	
	public static String date() {
		
		return new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
	}
	
	
	
}
