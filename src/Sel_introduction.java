import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel_introduction 
{

	public static void main(String[] args) 
	{
		// Invoking the browser
		// Chrome - ChromeDriver ->Methods close get
		// Firefox - FirefoxDriver ->Methods close get
		// Safari - SafariDriver ->Methods close get
		// WebDriver close get
		// WebDriver methods + class methods
		
		// ChromeDriver.exe-> Chrome Browser Selenium Manager
		// step to invoke chrome driver
		System.setProperty("webdriver.chrome.driver","/Users/Prashant/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		// webdriver.chrome.driver->value of path
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();//driver.quit() used to close all associated windows whereas close is used to close the only tab
		
		//Firefox launch
		//geckodriver
		//webdriver.gecko.driver
		WebDriver drivers=new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver","/Users/Prashant/Downloads/geckodrive/geckodriver.exe");
		drivers.get("https://rahulshettyacademy.com/");
		System.out.println(drivers.getTitle());
		System.out.println(drivers.getCurrentUrl());
		drivers.close();
		
		//Microsoft edge launch
		
		WebDriver drivers1=new EdgeDriver();
		System.setProperty("webdriver.edge.driver","/Users/Prashant/Downloads/edgedriver/Driver_Notes.exe");
		drivers1.get("https://rahulshettyacademy.com/");
		System.out.println(drivers1.getTitle());
		System.out.println(drivers1.getCurrentUrl());
		drivers1.close();
		
	}

}
