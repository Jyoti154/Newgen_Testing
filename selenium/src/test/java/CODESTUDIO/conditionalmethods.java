package CODESTUDIO;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalmethods {

	public static void main(String[] args) {

WebDriver driver=new ChromeDriver();
driver.get("https://demo.nopcommerce.com/register?returnUrl=%2Flogin");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

String act_title=driver.getTitle();
if(act_title.equals("nopCommerce demo store. Login"))
{
	System.out.println("test pass");
}
else
{
	System.out.println("test fail");
}

//boolean logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
//System.out.println("Display logo:"+logo);

WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
System.out.println(logo.isDisplayed());



	}

}
