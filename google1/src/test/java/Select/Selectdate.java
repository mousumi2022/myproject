package Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectdate {
	public static WebDriver driver;
public static void main(String args[]) {
	
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	dateclick("20");
	
	
	
}
public static void dateclick(String value) {
	driver.findElement(By.xpath("//a[text()='"+value+"']")).click();
}
}
