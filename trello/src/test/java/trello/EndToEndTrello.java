package trello;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import trello.BaseClass;
import trello.test.BoardsPage;
import trello.test.CreatedBoardsPage;
import trello.test.HomePage;
import trello.test.LoginToContinuePage;
import trello.test.LoginToTrelloPage;

public class EndToEndTrello extends BaseClass {
	@Test
	public void trelloEndToEnd() throws IOException, InterruptedException {
		webdriverutils.implicitwait(driver);
		Actions actions= new Actions(driver);
		HomePage homepage = new HomePage(driver);
		driver.get(fileutils.redDataFromPropertyFile("mainUrl"));
		String homepageexpectedurl = fileutils.redDataFromPropertyFile("homePageUrl");
		String homepageactualurl = driver.getCurrentUrl();
        String homepageexpectedtitle= fileutils.redDataFromPropertyFile("homePageTitle");
        String homepageactualtitle=driver.getTitle();
		Reporter.log("end to end pass");
        if (homepageexpectedtitle.equals(homepageactualtitle))
        {
        if (homepageexpectedurl.equals(homepageactualurl))
        {
			System.out.println("yes homepage url and title is correct");
			 homepage.getloginbutton().click();
		}	
			
		} else {
           System.out.println("no url and title is not correct");
		}
		Thread.sleep(2000);
		LoginToTrelloPage logintotrellopage = new LoginToTrelloPage(driver);
		if (fileutils.redDataFromPropertyFile("loginInTrelloPageUrl").equals(driver.getCurrentUrl())) {
		if (fileutils.redDataFromPropertyFile("loginInTrelloPageTitle").equals(driver.getTitle())) {
			System.out.println("yes login to continue page url and title are correct");
			logintotrellopage.getemailTextField().sendKeys(fileutils.redDataFromPropertyFile("email"));
			actions.sendKeys(Keys.ENTER).perform();
		}	
		} else {
			System.out.println("no login to continue page url and title are not correct");
		}
		
		LoginToContinuePage logintocontinuepage = new LoginToContinuePage(driver);
		//if (fileutils.redDataFromPropertyFile("liginInContinuePageUrl").equals(driver.getCurrentUrl())) {
			//if (fileutils.redDataFromPropertyFile("liginInContinuePageTitle").equals(driver.getTitle())) {
				//System.out.println("yes login to continue page title is correct");
				Thread.sleep(5000);
				String password = fileutils.redDataFromPropertyFile("password");
				//logintocontinuepage.getpasswordTextField().sendKeys(password);
				driver.switchTo().activeElement().sendKeys(password);
				Thread.sleep(5000);
				actions.sendKeys(Keys.ENTER).perform();
			//}
	//} else {
			//System.out.println("no login to continue url and title are not correct");
			
		//}
			Thread.sleep(5000);
		/*BoardsPage boardpage=new BoardsPage(driver);
		boardpage.getpopup().click();
		if (driver.getCurrentUrl().equals(fileutils.redDataFromPropertyFile("BoardsPageUrl"))) {
			if (driver.getTitle().equals(fileutils.redDataFromPropertyFile("BoardsPageTitle"))) {
				System.out.println("yes boards page url and title are correct");
				boardpage.getcreatenewboardlink().click();
			}
		}else {
			System.out.println("no boards page url and title are not correct");
		}
		Thread.sleep(5000);
		CreatedBoardsPage createdboardpage=new CreatedBoardsPage(driver);
		//if (createdboardpage.getcreatebutton().isEnabled()) {
			createdboardpage.getboardtitle().sendKeys("QASA6");
			createdboardpage.getcreatebutton().click();
		  // }
			Thread.sleep(5000);
			createdboardpage.gettitleofcardtextfield().sendKeys(fileutils.redDataFromPropertyFile("firstdata"));
			createdboardpage.getaddcardbutton().click();
			Thread.sleep(5000);
			createdboardpage.gettitleofcardtextfield().sendKeys(fileutils.redDataFromPropertyFile("seconddata"));
			createdboardpage.getaddcardbutton().click();
			Thread.sleep(5000);
			createdboardpage.gettitleofcardtextfield().sendKeys(fileutils.redDataFromPropertyFile("thirddata"));
			createdboardpage.getaddcardbutton().click();
			Thread.sleep(5000);
			createdboardpage.gettitleofcardtextfield().sendKeys(fileutils.redDataFromPropertyFile("fourthdata"));
			Thread.sleep(5000);
			createdboardpage.getaddcardbutton().click();
			Thread.sleep(5000);
			createdboardpage.getendcard().click();
			Thread.sleep(5000);
			WebElement properties = createdboardpage.getselectproperties();
			actions.clickAndHold(properties).moveByOffset(550, 0).release(properties).build().perform();
			Thread.sleep(3000);
			WebElement excel = createdboardpage.getselectexcel();
			actions.clickAndHold(excel).moveByOffset(250, 0).release(excel).build().perform();
			Thread.sleep(3000);
			createdboardpage.getshowmenubutton().click();
			Thread.sleep(3000);
			createdboardpage.getmorebutton().click();
			Thread.sleep(3000);
			createdboardpage.getcloseboardbutton().click();
			Thread.sleep(3000);
			createdboardpage.getclosebutton().click();
			Thread.sleep(3000);
			createdboardpage.getperdellink().click();
			Thread.sleep(3000);
			createdboardpage.getdeletebutton().click();
			Thread.sleep(3000);
			createdboardpage.getprofileoption().click();
			Thread.sleep(3000);
			createdboardpage.getlogoutoption().click();
			Thread.sleep(3000);
			createdboardpage.getlogoutbutton().click();*/
			}
			@Test(priority = -1)
			
			public  void openfacebook() throws InterruptedException {
				webdriverutils.implicitwait(driver);
				driver.get("http://www.fb.com");
				Thread.sleep(5000);
			
	}
			
	}


