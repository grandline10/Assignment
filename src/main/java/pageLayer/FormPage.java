package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLayer.BaseClass;
import utilsLayer.HandleDropDown;
import utilsLayer.WaitClass;

public class FormPage extends BaseClass {

	@FindBy(xpath = "(//input[@id=\"form-input-fullName\"])[1]")
	private WebElement fullName;

	@FindBy(xpath = "(//input[@id='form-input-organisationName'])[1]")
	private WebElement orgName;

	@FindBy(xpath = "(//input[@name='cellPhone'])[1]")
	private WebElement phone;

	@FindBy(xpath = "(//input[@id='form-input-email'])[1]")
	private WebElement email;

	@FindBy(xpath = "(//select[@id='form-input-jobRole'])[1]")
	private WebElement jobRole;

	@FindBy(xpath = "(//label[text()='I Agree'])[1]")
	private WebElement agree;

	@FindBy(xpath = "(//button[text()='Submit'])[1]")
	private WebElement submit;

	public FormPage() {

		PageFactory.initElements(driver, this);
	}

	public void fillTheForm(String fName, String organisation, String phoneNumber, String emailId, String job) {

		fullName.sendKeys(fName);
		orgName.sendKeys(organisation);
		phone.sendKeys(phoneNumber);
		email.sendKeys(emailId);

		HandleDropDown.selectByVisibleText(jobRole, job);

		

	}
	
	public void clickonagree() {
		
		
		
		WaitClass.click(agree);
	}

	public void clickOnSubmit() {

		Actions act = new Actions(driver);
		act.moveToElement(submit).click().build().perform();
	}
}
