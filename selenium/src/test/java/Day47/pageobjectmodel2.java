package Day47;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageobjectmodel2 {

	
	WebDriver driver;
	//constctors
	
	pageobjectmodel2 (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
		
	}
	
	

//locators
/*By txt_username=By.xpath("//input[@placeholder='Username']");
 By txt_password=By.xpath("//input[@placeholder='Password']");
By login_btn=By.xpath("//button[normalize-space()='Login']");
*/
@FindBy (xpath="//input[@placeholder='Username']")
WebElement txt_username;
	
@FindBy(xpath="//input[@placeholder='Password']")
WebElement txt_password;

@FindBy (xpath="//button[normalize-space()='Login']")
WebElement login_btn;

@FindBy (tagName="a")
List<WebElement>links;

// action methods

public void setusername(String user)
{
	//driver.findElement(txt_username).sendKeys(user);
	txt_username.sendKeys(user);
	
}
public void setpwd(String pwd)
{
	//driver.findElement(txt_password).sendKeys(pwd);
	txt_password.sendKeys(pwd);
}
public void clicklogin()
{
	//driver.findElement(login_btn);
	login_btn.click();
}


}



