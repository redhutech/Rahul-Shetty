import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavaStreams {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","/Users/Prashant/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//click on the column to make it sorted
		
		driver.findElement(By.xpath("//tr//th[1]")).click();
		
		//capture all the web elements in the list
		
		List<WebElement> elements=driver.findElements(By.xpath("//tr//td[1]"));
		
		//extract the text from the web elements into new list
		
		List<String> original = elements.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//apply sort in the list -> sorted list
		
		List<String> SortedOriginal = original.stream().sorted().collect(Collectors.toList());
		
		//compare sorted list with original list
		
		Assert.assertTrue(original.equals(SortedOriginal));
		
		//scan the name column with beans
		List<String> price;
		do 
		{
			List<WebElement> rows=driver.findElements(By.xpath("//tr//td[1]"));
		
		price = rows.stream().filter(s->s.getText().contains("Rice")).
		map(s->getPriceVeggie(s)).collect(Collectors.toList());
		price.forEach(a->System.out.print(a));
		
		if(price.size()<1)
		{
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		}
		}
		while(price.size()<1);

	}
	
	private static String getPriceVeggie(WebElement s)
	{
		String PriceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return PriceValue;
	}

}
