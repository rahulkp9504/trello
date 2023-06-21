package trello;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	public WebDriver driver;
	public FileUtility fileutils=new FileUtility();
	public WebDriverUtility webdriverutils=new WebDriverUtility();
	String browserName = "chrome";
	@BeforeClass 
	//@Parameters("browserName")
	public void configBeforeMethod() throws IOException {
		//String browserName=fileutils.redDataFromPropertyFile("browser");
		if (browserName.equals("chrome")) {
			//ChromeOptions options= new ChromeOptions();
			//options.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver();
		}
		else if (browserName.equals("firefox")) {
			driver= new FirefoxDriver();
		} 
		else if (browserName.equals("edge")) {
			driver=new EdgeDriver();
			
		}
		driver.manage().window().maximize();
		
		
	
	}
	@AfterClass
	public void configAftermethod() {
		driver.manage().window().minimize();
		driver.quit();
	}

}

