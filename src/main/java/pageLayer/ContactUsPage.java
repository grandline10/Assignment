package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLayer.BaseClass;

public class ContactUsPage extends BaseClass{

	@FindBy(xpath = "(//button[@class=\"body-button bg-plain-600 toggle-control\"])[1]")
	private WebElement contact;

	public ContactUsPage() {

		PageFactory.initElements(driver, this);
	}

	public void clickOnContactUnderMarket() {

		contact.click();
	}

}
