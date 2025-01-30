import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalenderTest {

	public static void main(String[] args) throws InterruptedException 
	{
		String Month="6";
		String date="15";
		String year="2027";
		String [] expected= {Month,date,year};
		System.setProperty("webdriver.chrome.driver",
				"/Users/Prashant/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//div[@class='react-date-picker__inputGroup']")).click();
		driver.findElement(By.xpath("//span[@class='react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from']")).click();
		driver.findElement(By.xpath("//span[@class='react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from']")).click();
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		//String to Integer
		driver.findElements(By.cssSelector(".react-calendar__tile")).get(Integer.parseInt(Month)-1).click();
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
		
		List<WebElement> actualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		for(int i=0;i<actualList.size();i++)
		{
			System.out.println(actualList.get(i).getDomAttribute("value"));
			Assert.assertEquals(actualList.get(i).getDomAttribute("value"), expected[i]);
		}
		driver.close();

	}

}
