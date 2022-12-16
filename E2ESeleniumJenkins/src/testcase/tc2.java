package testcase;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc2 {
	
	@Test
	public void testcase1() {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver1.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//button[@title='Only allow essential cookies']")).click();
		driver.findElement(By.id("email")).sendKeys("Hello");
		driver.findElement(By.id("pass")).sendKeys("123456");
	}

}
