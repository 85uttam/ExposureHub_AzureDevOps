package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FirstClass {
	
	public WebDriver driver;
	
	
	public FirstClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	public void getTitleOfLoginPage()
	{
		String title= driver.getTitle();
		System.out.println(title);
	}
	
	public void getURLofAPP()
	{
		System.out.println(driver.getCurrentUrl());
	}
}
