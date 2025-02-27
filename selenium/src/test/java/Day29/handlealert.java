package Day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlealert {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver=new ChromeDriver();
driver.get("https://the-internet.herokuapp.com/javascript_alerts");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();

//driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
//Thread.sleep(5000);
//Alert myalert=driver.switchTo().alert();
//System.out.println(myalert.getText());
//myalert.accept();


//driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
//Thread.sleep(5000);
//Alert myalert=driver.switchTo().alert();
//System.out.println(myalert.getText());
//myalert.dismiss();

driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();

Alert myalert=driver.switchTo().alert();
Thread.sleep(5000);
myalert.sendKeys("welcome");
myalert.accept();
System.out.println(driver.getTitle());

	}
}
