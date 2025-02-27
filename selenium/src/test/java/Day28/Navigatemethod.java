package Day28;

import java.sql.Time;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatemethod {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
	Set<String>	windoid=driver.getWindowHandles();
	
//	List<String>windoidlist=new ArrayList(windoid);
//	
//	String paraentid=windoidlist.get(0);
//	
//	String childid=windoidlist.get(1);
//	
//driver.switchTo().window(childid);
//System.out.println(driver.getTitle());
//
//driver.switchTo().window(paraentid);
//System.out.println(driver.getTitle());
	
	for(String id:windoid )
	{
	String title=driver.switchTo().window(id).getTitle();
	}

		
		{
			System.out.println(driver.getCurrentUrl());
		}
	}

}
