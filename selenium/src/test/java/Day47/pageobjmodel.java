package Day47;

import javax.swing.Spring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageobjmodel {
	
	WebDriver driver;
	//constctors
	
	pageobjmodel (WebDriver driver)
	{
		this.driver=driver;
	}
	
	

//locators
By txt_username=By.xpath("//input[@placeholder='Username']");
 By txt_password=By.xpath("//input[@placeholder='Password']");
By login_btn=By.xpath("//button[normalize-space()='Login']");



// action methods

public void setusername(String user)
{
	driver.findElement(txt_username).sendKeys(user);
}
public void setpwd(String pwd)
{
	driver.findElement(txt_password).sendKeys(pwd);
}
public void clicklogin()
{
	driver.findElement(login_btn);
}



}

