package trello.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginToTrelloPage {
	WebDriver driver;
	public LoginToTrelloPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id  = "user")
	private WebElement emailTextField;

	public WebElement getemailTextField() {
		return emailTextField;
	}

}