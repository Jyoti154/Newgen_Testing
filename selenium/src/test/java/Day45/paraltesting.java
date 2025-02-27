package Day45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paraltesting {
	
	WebDriver driver;

	@BeforeClass
	@Parameters({"browser"})
	void setup(String br) throws InterruptedException
	{
		switch (br.toLowerCase())
		{
		
		
		case "chrome": driver=new ChromeDriver(); break;
		
		case "edge"  : driver=new EdgeDriver();break;
		default: System.out.println("invalid browser");
		}
	
	
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
	}
	
	
	
	
	
	
	@Test(priority=3)
	void url()
	{
		Assert.assertEquals(driver.getCurrentUrl(),("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));
	}
	
	@Test(priority=4)
	void logindata()
	{
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	
	@Test(priority=5)
	void  teardown()
	{
		driver.quit();
		
	}
		
	
	
	
	
}
