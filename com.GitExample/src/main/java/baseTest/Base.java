package baseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\New Workspace\\com.GitExample\\src\\test\\java\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"text\"][contains(text(),'Sign in')]")).click();
		
		
	}

}
