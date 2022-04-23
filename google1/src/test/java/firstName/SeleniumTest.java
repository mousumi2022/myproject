package firstName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {
	public static void main(String[]args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/open-source/demo/");
		driver.manage().window().maximize();
		WebElement fname=driver.findElement(By.xpath("//input[@name='FirstName']"));
		fname.sendKeys("Mousumi");
		WebElement lname=driver.findElement(By.xpath("//input[@name='LastName']"));
		lname.sendKeys("Sahoo");
		WebElement cname=driver.findElement(By.xpath("//input[@name='CompanyName']"));
		cname.sendKeys("NIIT");
		WebElement jtitle=driver.findElement(By.xpath("//input[@name='JobTitle']"));
		jtitle.sendKeys("Test Engineer");
		WebElement phone=driver.findElement(By.xpath("//input[@name='Phone']"));
		phone.sendKeys("8035532440");
		WebElement email=driver.findElement(By.xpath("//input[@name='Email']"));
		email.sendKeys("mou.mca2007@gmail.com");
		
		WebElement country=driver.findElement(By.xpath("//select[@name='Country']"));
		Select s = new Select(country);
		//s.selectByVisibleText("Aruba");
		s.selectByValue("Aruba");
		//s.selectByIndex(3);
		
		WebElement industry=driver.findElement(By.xpath("//select[@name='Industry']"));
		Select s1=new Select(industry);
		s1.selectByIndex(3);
		
		
		
		WebElement emp=driver.findElement(By.xpath("//select[@name='No of Employees']"));
		Select s2=new Select(emp);
		s2.selectByVisibleText("11 - 15");
		
		
		
		
		
		
	}

}
