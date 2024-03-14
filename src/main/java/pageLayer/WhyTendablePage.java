package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLayer.BaseClass;

public class WhyTendablePage extends BaseClass {

	@FindBy(xpath = "//div[@class='button-links-panel']//descendant::a[@href='https://www.tendable.com/book-a-demo']")
	private WebElement demoButton;

	@FindBy(xpath = "//div[@class='button-links-panel']//descendant::a[text()='Contact Us']")
	private WebElement contactUs;

	public WhyTendablePage() {

		PageFactory.initElements(driver, this);
	}

	public boolean checkVisibilityAndEnableStatusOfButton() {

		return (demoButton.isDisplayed()&&demoButton.isEnabled());
	}
	
	public void clickOnContactUs() {
		
		contactUs.click();
	}

}
