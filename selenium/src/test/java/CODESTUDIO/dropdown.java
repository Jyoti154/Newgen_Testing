package CODESTUDIO;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class dropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		driver.get("https://myudyogaadhar.org/");
		Thread.sleep(3000);
		WebElement element=driver.findElement(By.id("office_state"));
		
		Select dropdown=new Select(element);
	//dropdown.selectByVisibleText("DELHI");
		//dropdown.selectByValue("5");
		dropdown.selectByIndex(2);

if(dropdown.isMultiple())
{
	System.out.println("is multipal");
}
else
{
	System.out.println("is not multipal");
}
	
	System.out.println("total opetion:"+element.getSize());

List <WebElement> opetions=dropdown.getOptions();
		
	for(WebElement el:opetions)	
	{
		System.out.println(el.getText());
	}

	driver.close();
	}

}
