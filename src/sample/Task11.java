package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task11 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\New\\Pramod\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://excellab.at/power-bi-report-samples/project-fifa-2018/");
	driver.manage().window().maximize();
	List<WebElement> corners = driver.findElements(By.xpath("(//div[@class='innerContainer'])[2]/div//div[3]"));
	for(WebElement temp:corners)
	{
	System.out.println(temp.getText());	
	}

}
}
