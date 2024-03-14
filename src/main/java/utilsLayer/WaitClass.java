package utilsLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseLayer.BaseClass;

public class WaitClass extends BaseClass {

	public static boolean isVisibleAndEnabled(WebElement element) {

		WebElement e = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOf(element));

		if (e.isDisplayed() && e.isEnabled()) {
			return true;
		}
		return false;
	}

	public static void click(WebElement element) {

		WebElement e = new WebDriverWait(driver, Duration.ofSeconds(40))
				.until(ExpectedConditions.visibilityOf(element));

		if (e.isDisplayed() && e.isEnabled()) {
			e.click();
		}
		
	}
	
	
	

}
