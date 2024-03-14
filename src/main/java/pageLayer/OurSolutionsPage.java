package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLayer.BaseClass;

public class OurSolutionsPage extends BaseClass {

	
	@FindBy(xpath="//div[@class='button-links-panel']//descendant::a[@href='https://www.tendable.com/book-a-demo']")
	private WebElement demoButton;
	
	@FindBy(xpath="//a[text()='Why Tendable?']")
	private WebElement wTendable;
	
	public OurSolutionsPage() {
		
		PageFactory.initElements(driver, this);
	}

	
	public boolean checkVisibilityAndEnableStatusOfButton() {
		
		return (demoButton.isDisplayed() && demoButton.isEnabled());
	}
	
	public void clickOnWhyTendable() {
		
		wTendable.click();
	}
}
