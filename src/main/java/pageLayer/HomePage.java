package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLayer.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(xpath = "//a[text()='Our Story']")
	private WebElement ourStory;

	@FindBy(xpath = "//a[text()='Our Solution']")
	private WebElement ourSolution;

	@FindBy(xpath = "//a[text()='Why Tendable?']")
	private WebElement wTendable;

	@FindBy(xpath = "//div[@class='button-links-panel']//descendant::a[@href='https://www.tendable.com/book-a-demo']")
	private WebElement demoButton;

	public HomePage() {

		PageFactory.initElements(driver, this);
	}

	

	public void clickOnOurStory() {

		ourStory.click();
	}

}
