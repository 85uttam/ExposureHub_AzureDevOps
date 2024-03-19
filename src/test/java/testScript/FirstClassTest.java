package testScript;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.FirstClass;
import testBase.BaseClass;

public class FirstClassTest extends BaseClass {

	public FirstClass fc;
	@BeforeTest
	public void setUp()
	{
		driver = initilization();
		fc = new FirstClass(driver);
	}
	
	@Test
	public void testFirstClass()
	{
		fc.getTitleOfLoginPage();
	}
	
	@Test
	public void getCurrentURL()
	{
		fc.getURLofAPP();
	}
}
