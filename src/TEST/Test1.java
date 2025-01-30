package TEST;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Test1 {

	public static void main(String[] args) 
	{

	}
	@Test
	public void Demo()
	{
		System.out.println("HEllo");
	}
	@Test
	public void Demo1()
	{
		System.out.println("BYE");
	}
	
	@AfterTest
	public void Demo2()
	{
		System.out.println("GOODBYE");
	}
	
	@AfterSuite
	public void Demo3()
	{
		System.out.println("Last");
	}

}
