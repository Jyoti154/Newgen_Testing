package Day45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datapro {
	WebDriver driver;
	
	@BeforeClass
	void setup() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@Test(dataProvider="js")
	void login(String email,String pwd) throws InterruptedException
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Register']"));
	boolean logostatus=	driver.findElement(By.xpath("//a[normalize-space()='Qafox.com']")).isDisplayed();
	if(logostatus=true)
	{
		System.out.println("testpass");
	}
	else
	{
		System.out.println("testfail");
	}
	}
	
	@AfterClass
	void teardown()
	{
		driver.quit();
	}
	
	
	@DataProvider(name="js")
	
	Object[][] logindata ()
	{
		Object data[] []={
			          {"test123@gmail.com","test123"},
			          {"jyotu89@gmail.com","jyo145"},
			          {"pavanol123@gmail.com" ,"test@123"},
			          {"shal678@gmail.com","hi123"},
			          {"hiok86@gmail.com","gjk123"},
			
	                  };
	return data;
	
	
	
	
}
	
	
	

	

}
