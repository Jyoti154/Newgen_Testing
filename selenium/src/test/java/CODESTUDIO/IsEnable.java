package CODESTUDIO;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2Flogin");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	boolean inputbox=	driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
	System.out.println("input box ;"+inputbox);
	
	
	// is select
WebElement male=	driver.findElement(By.xpath("//input[@id='gender-male']"));
WebElement Femalle=driver.findElement(By.xpath("//input[@id='gender-female']"));
System.out.println("before selection...");
System.out.println(male.isSelected());
System.out.println(Femalle.isSelected());


System.out.println("After select male");
male.click();
System.out.println(male.isSelected());
System.out.println(Femalle.isSelected());

System.out.println("After select female");
Femalle.click();
System.out.println(Femalle.isSelected());
System.out.println(male.isSelected());












//driver.quit();
		
	}

}
