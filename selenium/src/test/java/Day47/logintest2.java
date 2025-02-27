package Day47;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class logintest2 {

	WebDriver driver;
	
	@BeforeClass 
	void setup() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	}
	
	@Test
	void testlogin()
	{
		pagepactory pg=new  pagepactory(driver);
		pg.setusername("Admin");
		pg.setpassword("admin123");
		pg.clicklogin();
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	
	@AfterClass
	void teardown()
	{
		driver.quit();
	}
}
