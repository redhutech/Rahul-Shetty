 import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingItemToCart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/Prashant/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String[] items = { "Brocolli", "Cucumber", "Beetroot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
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
