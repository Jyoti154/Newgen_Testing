package Day45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class providerdata {
	WebDriver driver;
	
	@BeforeClass()
	void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider="lp")
	void testlogin(String id ,String pwd)
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(id);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@AfterClass
	void teardown()
	{
		driver.close();
	}
	
	@DataProvider(name="lp",indices= {0,2})
	Object [][] logindata()
	{
	Object data [] [] = {
			
			   {"jyoti" , "test123"},
	           {"dmin"  ,"test01"},
	           {"Admin","admin123"},
	           {"arato" ,"tes123"},
	           {"sudhir","test"},
			
			
                     	};
		
	return data;
	}
	

}
