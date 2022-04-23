package firstName;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pract {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.orangehrm.com/open-source/demo/");
		driver.manage().window().maximize();
		
		WebElement fname=driver.findElement(By.xpath("//input[@name='FirstName']"));
		fname.sendKeys("thilaka");
		
		WebElement lasname=driver.findElement(By.xpath("//input[@name='LastName']"));
		lasname.sendKeys("Konduri");
		
		WebElement cname=driver.findElement(By.xpath("//input[@id='Form_submitRequest_CompanyName']"));
		cname.sendKeys("Wipro");
		
		WebElement ind =driver.findElement(By.xpath("//select[@name='Industry']"));
		Select i =new Select(ind);
		i.selectByVisibleText("Automotive");
		
		WebElement jname=driver.findElement(By.xpath("//input[@name='JobTitle']"));
		jname.sendKeys("Tester");
		
		WebElement email=driver.findElement(By.xpath("//input[@name='Email']"));
		email.sendKeys("saianushakonduri@gmail.com");
		
		WebElement phone=driver.findElement(By.xpath("//input[@name='Phone']"));
		phone.sendKeys("5158679595");
		
		WebElement emp=driver.findElement(By.xpath("//select[@name='No of Employees']"));
		Select e = new Select(emp);
		e.selectByVisibleText("51 - 75");
				
		WebElement country=driver.findElement(By.xpath("//select[@name='Country']"));
		Select s = new Select(country);
		s.selectByVisibleText("Aruba");
		
		
		//driver.close();


	}

}