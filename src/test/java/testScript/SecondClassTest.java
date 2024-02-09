package testScript;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObject.SecondClass;
import testBase.BaseClass;

public class SecondClassTest extends BaseClass {
	
	public SecondClass sc;
	
	@BeforeMethod
	public void setUp()
	{
		sc = new SecondClass(driver);
	}

	@Test
	public void testSecondClass()
	{
		sc.getURLofApp();
	}
}
