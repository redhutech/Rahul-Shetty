package TEST;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 
{
	@Test
	public void PLoan()
	{
		System.out.println("good");
	}
	
	@BeforeTest
	public void PLoan1()
	{
		System.out.println("I will execute first");
	}

}
