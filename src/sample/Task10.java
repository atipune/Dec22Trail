package sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\New\\Pramod\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("Books");
		driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]")).click();
		driver.findElement(By.xpath("//div[@class='MUFPAc']/div[3]")).click();
		String text = driver.findElement(By.xpath("//div[@class='v7W49e']/div[3]//h3")).getText();
		System.out.println(text);
	}

}
