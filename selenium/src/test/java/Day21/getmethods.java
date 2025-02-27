package Day21;

import java.util.Set;

import org.openqa.selenium.By;
import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class getmethods {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver=new ChromeDriver();

driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();
Thread.sleep(3000);
System.out.println(driver.getTitle());
Thread.sleep(3000);
System.out.println(driver.getCurrentUrl());
//System.out.println(driver.getPageSource());

//String windoid=driver.getWindowHandle();
//System.out.println("windoid:"+windoid);
Thread.sleep(3000);
driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
Set<String>windoids=driver.getWindowHandles();
System.out.println(windoids);

// this is for further use for my coding.

//boolean logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
//System.out.println("logo status:"+logo);
//
//boolean firstname=driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
//System.out.println("name is display?"+firstname);
//
//boolean box=driver.findElement(By.xpath("//input[@id='gender-male']")).isEnabled();
//System.out.println("box is display?"+box);
//
//boolean dropdownbox=driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")).isEnabled();
//System.out.println("dropdownbox"+dropdownbox);
//
//WebElement male=driver.findElement(By.xpath("//input[@id='gender-male']"));
//WebElement female=driver.findElement(By.xpath("//input[@id='gender-female']"));
//
//
//System.out.println("after selecting...");
//
//male.click();
//System.out.println(male.isSelected());
//System.out.println(female.isSelected());
//
//System.out.println("after selecting female");
//female.click();
//System.out.println(male.isSelected());
//System.out.println(female.isSelected());




driver.close();



	}

}
