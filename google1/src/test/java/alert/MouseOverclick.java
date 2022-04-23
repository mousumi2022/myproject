package alert;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class MouseOverclick {
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
			driver.manage().window().maximize();
			
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
			Actions act = new Actions(driver);
			WebElement src= driver.findElement(By.xpath("//img[contains(@alt,'Kozi kopka')]"));
			WebElement trg = driver.findElement(By.xpath("//div[@id='trash']"));
			//act.dragAndDrop(src, trg).build().perform();
			
			act.clickAndHold(src).moveToElement(trg).release().build().perform();
			
			
			
	}
	}


