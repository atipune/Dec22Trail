package sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//1)Launch a browser
//In the existing tab navigate to https://the-internet.herokuapp.com/
//Click on “Frames” link
//Then click on “iFrame”
//Assert the content of the text area to be “Your content goes here”

public class FirstTask 
{
	@Test
	public void task()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\New\\Pramod\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//*[text()='Frames']")).click();
		driver.findElement(By.xpath("//*[text()='iFrame']")).click();
		String expText="Your content goes here.";
		driver.switchTo().frame("mce_0_ifr");
		String actText = driver.findElement(By.xpath("//body[@id='tinymce']/p")).getText();
		Assert.assertEquals(actText, expText);
		driver.quit();
	}
}
