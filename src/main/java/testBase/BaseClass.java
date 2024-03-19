package testBase;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;



public class BaseClass 
{
	
	
	public WebDriver driver;
	public WebDriver initilization()
	{
		driver = new ChromeDriver();
		driver.get("https://perf-eh.ebixexchange.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
	}

}
