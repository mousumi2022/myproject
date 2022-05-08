package objectpagemodel;


	//package pom.utilPrograms;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;

	public class OpenCartTest extends UsaUtilPom {
		public static void main(String[] args) {
		WebDriver driver = null;
		driver=dolaunchBro("chrome");
		dolaunchurl("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		max();
		
		OpenCartObjectFile o = new OpenCartObjectFile(driver);
		o.dorad();
		o.doFname("Thilaka");
		o.doLname("vathi");
		o.doDrag("date", "22");
		o.doDrag("month","April");
		o.doDrag("year","1985");
		o.email("mou.mca2007@gmail.com");
		
		
	}
	}

