package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyNow {
	
	@FindBy(id = "buy-now-button")
	private WebElement BuyNowBtn;
	
	public BuyNow(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void BuyNowBtnClick() {
		BuyNowBtn.click();
	}

}
