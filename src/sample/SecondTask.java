package sample;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

//2)Launch a browser
//In the existing tab navigate to https://www.flipkart.com/
//Scroll to the section of the page “Top Stories: Brand Directory”
//Click on Eggs in Groceries section
//Upon redirection enter PIN as “110047”
//Assert that eggs listing count is > 1
public class SecondTask {
	@Test
	public void task()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\New\\Pramod\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Actions act= new Actions(driver);
		act.scrollToElement(driver.findElement(By.xpath("//*[text()='Top Stories']")));
		driver.findElement(By.xpath("//*[text()='Eggs']")).click();
		driver.findElement(By.xpath("//*[@name='pincode']")).sendKeys("110047");
		act.sendKeys(Keys.ENTER);
		List<WebElement> EggItems = driver.findElements(By.xpath("(//div[@class='_1YokD2 _3Mn1Gg col-12-12'])[1]//a//*[contains(text(),'Egg')][1]"));
		if(EggItems.size()<=0)
		{
			Assert.fail();
		}
	}
}
