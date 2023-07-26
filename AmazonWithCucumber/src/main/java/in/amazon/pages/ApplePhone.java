package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplePhone {
	
	@FindBy(xpath = "(//div[contains(@class,'s-card-container')])[2]")
	private WebElement applemobile;
	
	public ApplePhone(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickSecondMobile() {
		applemobile.click();
	}

}
