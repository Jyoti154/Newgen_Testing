package CODESTUDIO;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countprint {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.calculator.net/");
		driver.manage().window().maximize();

		List<WebElement>	link=	driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		for(WebElement el:link)
		{
			//System.out.println("total link:"+el.getText());
		}

		driver.close();

	}
  
	
	
	
}
