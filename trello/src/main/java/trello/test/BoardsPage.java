package trello.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BoardsPage {
	WebDriver driver;
	public BoardsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[text()='Create new board']")
	private WebElement createnewboardlink;

	public WebElement getcreatenewboardlink() {
		return createnewboardlink;
	}

}