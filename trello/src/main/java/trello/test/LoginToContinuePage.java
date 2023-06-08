package trello.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginToContinuePage {
	WebDriver driver;
	public LoginToContinuePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id  = "password")
	private WebElement passwordTextField;

	public WebElement getpasswordTextField() {
		return passwordTextField;
	}

}