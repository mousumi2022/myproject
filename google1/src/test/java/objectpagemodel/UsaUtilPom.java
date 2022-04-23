package objectpagemodel;


	//package usa;

	import java.util.List;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class UsaUtilPom {
	static WebDriver driver;

	public static WebDriver dolaunchBro(String browser) {
		if(browser=="chrome") {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		else if(browser=="firefox") {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		return driver; 
		
	}

	public static void dolaunchurl(String url) {
		driver.get(url);
	}

	public static void max() {
		driver.manage().window().maximize();
	}




	public void drag(WebElement e,String value) {
		Select s = new Select(e);
		List<WebElement> ls=s.getOptions();
		for(WebElement dr:ls) {
			if(dr.getText().equals(value)) {
				dr.click();
			}
		}
		
		
	}


	}


