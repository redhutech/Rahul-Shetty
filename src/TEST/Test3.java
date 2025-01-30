package TEST;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test3 {

	@Test
	public void WebloginCar()
	{
		System.out.println("webloginCar");
	}
	
	@Test
	public void MobileLoginCar()
	{
		System.out.println("mobileloginCar");
	}
	
	@BeforeSuite
	public void BfSuite()
	{
		System.out.println("No. 1");
	}

	@Test
	public void MobileinCar()
	{
		System.out.println("mobileloginCar");
	}
	

	@Test
	public void MobileLogCar()
	{
		System.out.println("mobileloginCar");
	}
	
	
	@Test
	public void APILoginCar()
	{
		System.out.println("APIloginCar");
	}
}
