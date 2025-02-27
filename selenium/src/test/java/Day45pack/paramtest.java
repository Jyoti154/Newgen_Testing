package Day45pack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class paramtest {
	
	WebDriver driver;

	@BeforeClass
	@Parameters({"browser"})
	void setup(String br)
	{ 
		switch(br.toLowerCase())
		{
		case "chrome" : driver=new ChromeDriver();break;
		case "edge"   :driver=new EdgeDriver();break;
		case "firefox" : driver=new FirefoxDriver();break;
		default :System.out.println("fail browser");
		return;
		}
	
	
	
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	}
	
	@Test(priority=1)
	void logindata() throws InterruptedException
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
	}
	
	@Test(priority=2)
	void testtitle()
	{
	Assert.assertEquals	(driver.getTitle(),("OrangeHRM"));
	
	}
	
	@Test(priority=3)
	void testurl()
	{
		Assert.assertEquals(	driver.getCurrentUrl(),("\"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));
	}
	
	@AfterClass
	void teardown()
	{
		driver.quit();
	}
}

