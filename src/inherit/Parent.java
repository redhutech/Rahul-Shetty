package inherit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Parent 
{
	public void doThis()
	{
		System.out.println("I am here");
	}
	
	@BeforeMethod
	public void beforeRun()
	{
		System.out.println("first");
	}
	
	@AfterMethod
	public void afterRun()
	{
		System.out.println("last");
	}
}
