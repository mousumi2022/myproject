package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg_Demo2 {
	
	static WebDriver driver=null;
	@BeforeTest
	public static void setuppage() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	@Test
	public static void search(){
		
		//driver.findElement(By.name("q")).sendKeys("Steps to create gmail account");
		System.out.println("TESt Program");
		//driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Steps to create gmail account");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		
	}
	@AfterTest
	public static void tearclose() {
		
		driver.close();
		driver.quit();
		
		
	}

}
