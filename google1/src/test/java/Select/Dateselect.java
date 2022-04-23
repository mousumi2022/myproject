package Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dateselect {
	static WebDriver driver; 
	public static void main(String [] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("datepicker")).click();
		//selectdate("18");
		futuredate("May 2024","23");
		
		
		
		
}
	
	public static void futuredate(String expMonthYr, String date) {
		if(Integer.parseInt(date)> 31) {
			System.out.println("Wrong date");
			return;
		}
		if(expMonthYr.contains("February") && Integer.parseInt(date)>=29) {
			System.out.println("Wrong date");
			return;
		}
		String actMonthYear=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		System.out.println(actMonthYear);
		while(!actMonthYear.equalsIgnoreCase(expMonthYr)) {
			//click on next
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			actMonthYear=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();

		}
		selectdate(date);
	
	}
	public static void selectdate(String date) {
		driver.findElement(By.xpath("//a[text()='"+date+"']")).click();
	}
}

