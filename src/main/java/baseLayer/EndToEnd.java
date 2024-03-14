package baseLayer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndToEnd {

	public static void main(String[] args) {
		
		//visit the website
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)).implicitlyWait(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		driver.get("https://www.tendable.com");
		
		//
		
		WebElement ourStory = driver.findElement(By.xpath("//a[text()='Our Story']"));
		WebElement ourSolution = driver.findElement(By.xpath("//a[text()='Our Story']"));
		WebElement whyTendable = driver.findElement(By.xpath("//a[text()='Our Story']"));
		WebElement demoButton = driver.findElement(By.xpath("//a[text()='Our Story']"));
		
		ourStory.click();
		
		
		
		
		

	}

}
