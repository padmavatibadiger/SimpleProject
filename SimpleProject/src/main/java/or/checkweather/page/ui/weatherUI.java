package or.checkweather.page.ui;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.ui.pages.BasePage;

public class weatherUI extends BasePage{
	
	int hvalue, tvalue;

	@FindBy(xpath="//a[contains(text(),'No Thanks')]")
	private WebElement clickOnNoThanks;
	
	@FindBy(xpath="//*[@id='h_sub_menu']")
	private WebElement clickOnEllipsis;
	
	@FindBy(xpath="//a[@href='https://social.ndtv.com/static/Weather/report/?pfrom=home-topsubnavigation']")
	private WebElement clickOnWeather;
	
	@FindBy(xpath="//div[contains(text(),'Bengaluru')]")
	private WebElement clickOnCity;
	
	@FindBy(xpath="/html/body/div[6]/div[1]/div[6]/div/div[1]/div/div/span[3]/b")
	public WebElement clickOnHumidity;
	
    @FindBy(xpath="/html/body/div[6]/div[1]/div[6]/div/div[1]/div/div/span[4]/b")
    public WebElement clickOnTemp;
    
    
	public weatherUI(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

	
	public void getWeatherStatus()
	{
		try
		{
		if(clickOnNoThanks.isDisplayed())
		{
			clickOnNoThanks.click();
		}
		}
		catch(NullPointerException e)
		{
			System.out.println("Not Found");
		}
		clickOnEllipsis.click();
		clickOnWeather.click();
		clickOnCity.click();
		clickOnHumidity.click();
		clickOnTemp.click();
	}
	
	
}
