package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SecondClass {
	
	private WebDriver driver;
	public SecondClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	
	public void getURLofApp()
	{
		String pageURL = driver.getCurrentUrl();
		System.out.println(pageURL);
	}
	
}
