import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Miscelleanous {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","/Users/Prashant/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//delete specific cookie
		//driver.manage().deleteCookieNamed("name of the cookie");
		
		
		driver.get("https://google.com");
		File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ss,new File("/Users/Prashant/ss/screenshot.png"));

	}

}
