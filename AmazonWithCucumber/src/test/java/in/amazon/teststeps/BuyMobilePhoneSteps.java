package in.amazon.teststeps;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import in.amazon.pages.AllMobileBrand;
import in.amazon.pages.ApplePhone;
import in.amazon.pages.BuyNow;
import in.amazon.pages.LandingPage;
import in.amazon.pages.SignIn;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyMobilePhoneSteps {
	WebDriver driver;
	AllMobileBrand mobilebrand;
	
	@Given("a user is in the LandingPage on amazon")
	public void a_user_is_in_the_landing_page_on_amazon() {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/");
	}

	@When("he clicks on Mobiles in the navigatiom bar")
	public void he_clicks_on_mobiles_in_the_navigatiom_bar() {
	    LandingPage landingpage = new LandingPage(driver);
	    landingpage.clickMobile();
	}

	@When("he hovers the pointer over Mobiles & Accessories")
	public void he_hovers_the_pointer_over_mobiles_accessories() {
	    mobilebrand = new AllMobileBrand(driver);
	    mobilebrand.hoverOverMobileAndAccessories();
	}

	@When("he clicks on Apple in the sub-menu")
	public void he_clicks_on_apple_in_the_sub_menu() {
		mobilebrand.clickApple();
	}

	@When("he clicks on the second abailable phone")
	public void he_clicks_on_the_second_abailable_phone() {
		ApplePhone applephone = new ApplePhone(driver);
		applephone.clickSecondMobile();
	}
	
	@When("he switches focus on the new tab")
	public void he_switches_focus_on_the_new_tab() {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
	}

	@When("he clicks on buy now button")
	public void he_clicks_on_buy_now_button() {
		BuyNow buynow = new BuyNow(driver);
		buynow.BuyNowBtnClick();
	}

	@Then("he must be able to purchase the mobile phone successfully.")
	public void he_must_be_able_to_purchase_the_mobile_phone_successfully() {
		SignIn signin = new SignIn(driver);
		String Actual =  signin.SignInCheck();
		String Expected = "Sign in";
		assertEquals(Actual, Expected);
		driver.quit();
	}

}
