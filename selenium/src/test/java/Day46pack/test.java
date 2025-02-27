package Day46pack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test {
	
	WebDriver driver;
	
	@BeforeClass
	void setup() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
	}

	@Test(priority=1)
	void testlogo()
	{
	boolean status=	driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	Assert.assertEquals(status, true);
	}
	
	@Test(priority=2)
	void testurl()
	{
		Assert.assertEquals	(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com");
	}

	@Test(priority=3,dependsOnMethods= {"testurl"})
	void testtitle()
	{
		Assert.assertEquals	(driver.getTitle(),"OrangeHRM");
	}
	
	@AfterClass
	void teardown()
	{
		driver.close();
		
	}
	
}
