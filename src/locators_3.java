import java.time.Duration;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators_3 
{

	public static void main(String[] args)throws InterruptedException 
	{
		String name="Prashant";
		System.setProperty("webdriver.chrome.driver","/Users/Prashant/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		String pass =getPassword(driver);
		driver.get("http://rahulshettyacademy.com/locatorspractice/");
		//using ID locator for finding element
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(pass);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in." );
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
		driver.findElement(By.className("logout-btn")).click();
		driver.close();

	}
	public static String getPassword(WebDriver driver)throws InterruptedException
	{
		driver.get("http://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText=(driver.findElement(By.cssSelector("form p")).getText());
		//Please use temporary password 'rahulshettyacademy' to Login
		String[] passwordArray = passwordText.split("'");
		String password =  passwordArray[1].split("'")[0];
	    return password;		
		//0th index - Please use temporary password 
		//1st index - rahulshettyacademy' to Login
		
	}

}
