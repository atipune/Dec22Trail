package sample;
//3)Launch a browser
//In the existing tab navigate to https://www.makemytrip.com/
//Make a round trip flight search from Delhi to Goa by filling the widget with new dates
//with a difference of 5 days between departure and return flights and not the pre-filled dates.
//Assert that flight listing count is > 1
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ThirdTask 
{
	@Test
	public void task() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\New\\Pramod\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//li[@class='selected']")).click();
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Delhi");
		driver.findElement(By.xpath("//*[text()='DEL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("toCity")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Goa");
		driver.findElement(By.xpath("//*[text()='GOI']")).click();
		driver.findElement(By.xpath("departureDate")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[2]/div[3]/div/p")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[2]/div[7]/div/p")).click();
		driver.findElement(By.xpath("//*[@class='makeFlex vrtlCenter ']/a")).click();
		List<WebElement> actCount = driver.findElements(By.xpath("//*[contains(@id,'flightCard')]"));
		if(actCount.size()<=0)
		{
			Assert.fail();
		}
	}
}
