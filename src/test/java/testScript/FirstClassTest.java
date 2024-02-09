package testScript;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObject.FirstClass;
import testBase.BaseClass;

public class FirstClassTest extends BaseClass {

	public FirstClass fc;
	@BeforeMethod
	public void setUp()
	{
		initilization();
		fc = new FirstClass(driver);
	}
	
	@Test
	public void testFirstClass()
	{
		fc.getTitleOfLoginPage();
	}
}
