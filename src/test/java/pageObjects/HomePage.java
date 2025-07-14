package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement linkmyaccount;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//li[1]//a")
	WebElement linkregister;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")
	WebElement linklogin;
	
	
	public void clickMyAccount()
	{
		linkmyaccount.click();
	}
	
	public void clickRegister()
	{
		linkregister.click();
	}
	
	public void clickLogin()
	{
		linklogin.click();
	}

}
