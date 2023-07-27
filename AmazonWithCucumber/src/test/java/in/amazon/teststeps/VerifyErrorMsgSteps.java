package in.amazon.teststeps;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import in.amazon.pages.LandingPage;
import in.amazon.pages.SignIn;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyErrorMsgSteps {
	WebDriver driver;
	SignIn signin;
	
	@Given("a user is on the landing page")
	public void a_user_is_on_the_landing_page() {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/");
	}

	@When("he click on sign-in button")
	public void he_click_on_sign_in_button() {
		LandingPage landingpage = new LandingPage(driver);
	    landingpage.ClickSignIn();
	}

	@When("he enters invalid email address in the email text box")
	public void he_enters_invalid_email_address_in_the_email_text_box() {
	    signin = new SignIn(driver);
	    signin.EnterEmail("rajib@ll");
	}

	@When("he click on the continue button")
	public void he_click_on_the_continue_button() {
	    signin.ClickContinue();
	}

	@Then("he must see the error message - {string}")
	public void he_must_see_the_error_message(String string) {
	    String Actual = signin.checkmsg();
	    String Expected = string;
	    assertEquals(Actual, Expected);
	    driver.quit();
	}

}
