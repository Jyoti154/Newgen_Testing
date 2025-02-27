package Day47;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pagepactory{
	
	WebDriver driver;
		
	
	
	 pagepactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement login;
	
	public void setusername(String user)
	{
		username.sendKeys(user);
	}

	public void setpassword(String pwd)
	{
		password.sendKeys(pwd);
		
	}
	public void clicklogin()
	{
		login.click();
	}
}



