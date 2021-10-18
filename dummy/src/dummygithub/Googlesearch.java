package dummygithub;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Googlesearch {
	@Test
	public void register(){
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("http://demowebshop.tricentis.com/");
	driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
	driver.close();
	}
		
}
