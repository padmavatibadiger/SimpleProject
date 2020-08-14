package Base.tests.ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
	protected static final long loginWaitTime = 60;
    protected static final long pageLoadWaitTime = 40;
    protected static final long implicitWaitTime = 20;
    protected WebDriver driver;

	 @BeforeMethod
	    public void initWebDriver() {
		 
		    System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
	    	driver= new FirefoxDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.ndtv.com/.");
	        driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
	   }
	 
	 @AfterMethod
	 public void quitBrowser()
	 {
		 driver.quit();
	 }
}
