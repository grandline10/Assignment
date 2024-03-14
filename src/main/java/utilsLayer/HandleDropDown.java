package utilsLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseLayer.BaseClass;

public class HandleDropDown extends BaseClass {

	public static void selectByVisibleText(WebElement element, String value) {

		WebElement e = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOf(element));

		if (e.isDisplayed() && e.isEnabled()) {
			Select sel = new Select(e);

			sel.selectByVisibleText(value);
		}

	}

	public static void selectByIndex(WebElement element, int index) {

		WebElement e = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOf(element));

		if (e.isDisplayed() && e.isEnabled()) {
			Select sel = new Select(e);

			sel.selectByIndex(index);
		}

	}

	public static void selectByValue(WebElement element, String value) {

		WebElement e = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOf(element));

		if (e.isDisplayed() && e.isEnabled()) {
			Select sel = new Select(e);

			sel.selectByValue(value);
		}

	}

	public static List<WebElement> getOptions(WebElement element) {

		WebElement e = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOf(element));

		Select sel = new Select(e);

		return sel.getOptions();

	}

	public static WebElement getFirstSelectedOption(WebElement element) {

		WebElement e = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOf(element));

		Select sel = new Select(e);

		return sel.getFirstSelectedOption();

	}

	public static int size(WebElement element) {

		WebElement e = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOf(element));

		Select sel = new Select(e);

		return sel.getOptions().size();

	}

}
