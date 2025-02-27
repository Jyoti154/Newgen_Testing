package Day45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {

	
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	}
	
	
	
	@Test(dataProvider="dp")
	void testlogin(String email,String pwd)
	
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	boolean logostatus=	driver.findElement(By.xpath("//span[normalize-space()='My Account']")).isDisplayed();
  
	if(logostatus==true)
	{
		driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']"));
		Assert.assertTrue(true);
	}
	else
	{
		Assert.fail();
	}
	
	}
	
	@AfterClass
	void teardown()
	{
		driver.quit();
	}
	
	@DataProvider(name="dp",indices= {0,3})
	Object[][] logindata()
	{
		
		Object data [] []= {
				           {"abc@gmail.com" , "test123"},
				           {"xyz@gmail.com"  ,"test01"},
				           {"opx@gmail.com" ," test09"},
				           {"pavanol123@gmail.com" ,"test@123"},
				           {"jyo@gmail.com","test"},
				
				
				
				
		                   };
		
		return data;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
