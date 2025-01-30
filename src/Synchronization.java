import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"/Users/Prashant/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(5));//explicit wait
		String[] items = { "Brocolli", "Cucumber", "Beetroot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		addItems(driver,items);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		//explicit wait
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		//explicit wait
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

	}
	
	public static void addItems(WebDriver driver, String[] items)
	{
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		// convert array into array list
		int count = 0;
		for (int i = 0; i < products.size(); i++) {

			String[] name = products.get(i).getText().split("-");
			String fromattedname = name[0].trim();
			List<String> a1 = Arrays.asList(items);

			if (a1.contains(fromattedname)) {
				// click on add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				count++;
				if (count ==items.length)
					break;
			}
		}

	}
}
