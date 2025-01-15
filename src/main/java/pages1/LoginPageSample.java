package pages1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageSample {
	
public WebDriver driver;
	
	public LoginPageSample(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
		
	}
@FindBy(xpath="//input[@id=\"loginform-username\"]")WebElement usernamefield;
@FindBy(xpath="//input[@id=\"loginform-password\"]")WebElement passwordfield;
@FindBy(xpath="//button[@name=\"login-button\"]")WebElement loginbutton;
@FindBy(xpath="//p[text()='Welcome to Payroll Application']")WebElement homepage;
public void enterUsername(String username)
{
	usernamefield.sendKeys(username);
}
public void enterPassword(String password)
{
	passwordfield.sendKeys(password);
}

public void clickonloginbutton()

{
	loginbutton.click();
}
public boolean ishomepageIsloaded()
{
	return homepage.isDisplayed();
}
}