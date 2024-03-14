package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import baseLayer.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageLayer.ContactUsPage;
import pageLayer.FormPage;
import pageLayer.HomePage;
import pageLayer.OurSolutionsPage;
import pageLayer.OurStoryPage;
import pageLayer.WhyTendablePage;
import utilsLayer.TakeScreenshot;

public class StepDefinitions extends BaseClass {

	static HomePage home ;
	static OurStoryPage ourStory ;
	static OurSolutionsPage ourSol ;
	static WhyTendablePage whyT ;
	static ContactUsPage cPage ;
	static FormPage form ;
	static TakeScreenshot screenshot ;

	@Given("User is on the tendable homepage")
	public void user_is_on_the_tendable_homepage() {
		BaseClass.initialize();
	}

	@Given("user verifies accessibility Home, Our Story, Our Solution, Why Tendable and request demo")
	public void user_verifies_accessibility_home_our_story_our_solution_why_tendable_and_request_demo() {
		home = new HomePage();
		home.clickOnOurStory();
	}

	@When("user opens Our story page and user verifies the accessibility of request demo button")
	public void user_opens_our_story_page_and_user_verifies_the_accessibility_of_request_demo_button() {
		home = new HomePage();
		home.clickOnOurStory();
		ourStory = new OurStoryPage();
		boolean status = ourStory.checkVisibilityAndEnableStatusOfButton();
		Assert.assertEquals(status, true);
	}

	@When("user opens our solution page and user verifies the accessibility of request demo button")
	public void user_opens_our_solution_page_and_user_verifies_the_accessibility_of_request_demo_button() {
		ourStory = new OurStoryPage();
		ourStory.clickOnOurSolution();
		ourSol = new OurSolutionsPage(); 
		boolean status = ourSol.checkVisibilityAndEnableStatusOfButton();

		Assert.assertEquals(status, true);
	}

	@When("user opens why tendable page and  user verifies the accessibility of request demo button")
	public void user_opens_why_tendable_page_and_user_verifies_the_accessibility_of_request_demo_button() {

		ourSol.clickOnWhyTendable();
		whyT = new WhyTendablePage();
		boolean status = whyT.checkVisibilityAndEnableStatusOfButton();

		Assert.assertEquals(status, true);
	}

	@When("user clicks on the contact us page")
	public void user_clicks_on_the_contact_us_page() {
		whyT.clickOnContactUs();
	}

	@When("then clicks on marketing option")
	public void then_clicks_on_marketing_option() {
		cPage = new ContactUsPage();
		cPage.clickOnContactUnderMarket();
	}

	@When("the user fills up the form except the message section")
	public void the_user_fills_up_the_form_except_the_message_section() {
		form = new FormPage();
		form.fillTheForm("fullname", "orgName", "15424115", "email@email.com", "Management");
	}

	@When("clicks on submit")
	public void clicks_on_submit() {
		
		form.clickonagree();
		form.clickOnSubmit();
	}

	@Then("It shows error message and if it does then take a screenshot otherwise do not")
	public void it_shows_error_message_and_if_it_does_then_take_a_screenshot_otherwise_do_not() {
		WebElement error = driver
				.findElement(By.xpath("//div[@class=\"freeform-row \"]//following::ul[@class='ff-errors']"));

		if (error.getText().contains("This field is required")) {

			screenshot.takeScreenshot();
			
			
		}
		
		
	}
	
	

}
