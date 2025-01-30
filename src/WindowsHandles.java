import java.util.Set;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandles {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"/Users/Prashant/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText[href='https://rahulshettyacademy.com/documents-request']")).click();
		//parent to child window
		Set<String> windows = driver.getWindowHandles(); //[parent id,child id, sub child id]
		Iterator<String>it = windows.iterator();
		String parentID = it.next();
		String childID = it.next();
		
		driver.switchTo().window(childID);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String emailID = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		
		//child to parent window
		driver.switchTo().window(parentID);
		driver.findElement(By.id("username")).sendKeys(emailID);

	}

}
