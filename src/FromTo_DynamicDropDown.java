import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FromTo_DynamicDropDown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","/Users/Prashant/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://rahulshettyacademy.com/dropdownsPractise/");
		// //a[@value='MAA'] - Xpath for chennai
		
		// //a[@value='BLR']
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(500);
		// //div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();//\
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();//\
	}
}
