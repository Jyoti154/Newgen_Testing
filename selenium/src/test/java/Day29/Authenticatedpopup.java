package Day29;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticatedpopup {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver=new ChromeDriver();
driver.get("https://the-internet.herokuapp.com/digest_auth");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
Thread.sleep(5000);

driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");

	}

}
