package trello;

import org.testng.annotations.Test;

public class OpenFacebook extends BaseClass {
	@Test(priority = 0)
	
	public  void openfacebook() throws InterruptedException {
		webdriverutils.implicitwait(driver);
		driver.get("http://www.fb.com");
	
		Thread.sleep(5000);
		
	}

}
