package newObjectPageModelProperty;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilityFile4 {
	
public static WebDriver driver;
static String Userdirectory= null;



public static WebDriver dolaunchBrowser(String value) {
	if(value.equals("chrome")) {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}
	else if(value.equals("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
	}
	return driver;
		
	}


public static String getpropvalue(String key) {
	String value = null;
	try {
		Userdirectory = System.getProperty("user.dir");  // current path of ur project C:\Users\Admin\eclipse-workspace\richard
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(Userdirectory + "//input.properties");
		prop.load(ip);
		value = prop.getProperty(key);
	} catch (Exception e) {
		e.printStackTrace();
	}
	return value;
}

public static void max() {
	try {
	driver.manage().window().maximize();

	}
	catch(Exception e) {
		System.out.println(e);
		
	}
}

public static void impl() {
driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
}

public static String getExceldata(String sheetname, int row, int col) throws Exception

{
	String celldata = null;
	try {
		Userdirectory = System.getProperty("user.dir");
	
		FileInputStream fis = new FileInputStream(Userdirectory + "//mou.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		DataFormatter formatter = new DataFormatter();
		Cell cellformat = sh.getRow(row).getCell(col);
		celldata = formatter.formatCellValue(cellformat);
		System.out.println(celldata);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();

	}
	return celldata;


}

public static boolean drop(WebElement e, String value) {
	boolean flag =false;
	try {
Select s1 = new Select(e);
List<WebElement> ls1 = s1.getOptions();
for (WebElement dr : ls1) {
	if (dr.getText().equals(value)) {
		dr.click();
	}
}
flag=true;
}
	catch(Exception ex) {
		System.out.println(ex);
	}
	
return flag;

}

public static boolean doClick(WebElement e) {
	boolean flag=false;
	
	e.click();
	  flag=true;
	  return flag;
}

public static boolean doSendKeys(WebElement e, String value) {
	boolean flag=false;
	
	e.sendKeys(value);
	flag=true;
	return flag;
}




}


