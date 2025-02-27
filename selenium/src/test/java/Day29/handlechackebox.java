package Day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlechackebox {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
List<WebElement>checkbox=		driver.findElements(By.xpath("//input[@class='form-check-input' and@type='checkbox']"));
//for(int i=0;i<checkbox.size();i++)
//{
//	checkbox.get(i).click();
//}

//for(WebElement check:checkbox)
//{
//	System.out.println();check.click();
//}
		
//for(int i=4;i<checkbox.size();i++)
//{
//	checkbox.get(i).click();
//}


//for(int i=4;i<7;i++)
//{
//	checkbox.get(i).click();
//}
//Thread.sleep(5000);
//for(int i=0;i<checkbox.size();i++)
//{
//	checkbox.get(i).click();
//}
//		


		
		
		
		
		
		

	}

}
