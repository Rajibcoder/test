package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {
	
	@FindBy(xpath = "//h1[contains(@class,'a-spacing-small')]")
	private WebElement signin;
	
	@FindBy(id = "ap_email")
	private WebElement enterEmail;
	
	@FindBy(id = "continue")
	private WebElement Continue;
	
	@FindBy(xpath = "//span[contains(@class,'a-list-item')]")
	private WebElement Errormsg;
	
	public SignIn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String SignInCheck() {
		String Text = signin.getText();
		return Text;
	}
	
	public void EnterEmail(String email) {
		enterEmail.clear();
		enterEmail.sendKeys(email);
	}
	
	public void ClickContinue() {
		Continue.click();
	}
	
	public String checkmsg() {
		return Errormsg.getText();
	}

}
